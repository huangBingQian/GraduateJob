package teamB.GraduateJob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import teamB.GraduateJob.po.*;
import teamB.GraduateJob.service.AdminService;
import teamB.GraduateJob.service.CompanyService;
import teamB.GraduateJob.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yxaw on 2016/12/18.
 */
@Controller
public class StudentController {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private AdminService adminService;

    //学生端学生首页控制器
    @RequestMapping("/stu_home.action")
    public String stu_home(HttpSession session, HttpServletRequest req, Model model) {
        int graduateid = (Integer) session.getAttribute("graduateid");
        int noticeAmount = studentService.CountNoticeNumberByGraduateId(graduateid);
        model.addAttribute("noticeAmount", noticeAmount);
        return "forward:/jsp/stuclient/stu_home.jsp";
    }

    //学生端职位页面控制器
    @RequestMapping("/stu_job.action")
    public String stu_job(HttpSession session, HttpServletRequest req, Model model) {
        //每个函数都有:取消息数目
        int graduateid = (Integer) session.getAttribute("graduateid");
        int noticeAmount = studentService.CountNoticeNumberByGraduateId(graduateid);
        //企业性质
        List<Companycharacterlist> companycharacterlists = adminService.getCompanyCharacterList();
        //企业行业
        List<Industrylist> industrylists = adminService.getIndustryList();
        //根据companycharacter,industry查job
        List<ExCompanyJob> exCompanyJobs = companyService.selectJobsBystu_job("全体", "全体");
        model.addAttribute("noticeAmount", noticeAmount);
        model.addAttribute("companycharacterlists", companycharacterlists);
        model.addAttribute("industrylists", industrylists);
        model.addAttribute("exCompanyJobs", exCompanyJobs);
        return "forward:/jsp/stuclient/stu_job.jsp";
    }

    @RequestMapping("/stu_job_detail.action")
    public String stu_job_detail(HttpSession session, Model model, int jobid, int companyid) {
        ExCompanyJob exCompanyJob = new ExCompanyJob();
        exCompanyJob.setJobs(studentService.selectGobsByGobid(jobid));
        exCompanyJob.setCompany(studentService.selectCompanyByCompanyid(companyid));
        model.addAttribute("exCompanyJob", exCompanyJob);
        return "forward:/jsp/stuclient/stu-job-detail.jsp";
    }

    @RequestMapping("/message.action")
    public String message(HttpSession session, Model model) {
        Graduate graduate = (Graduate) session.getAttribute("graduate");
        List<ExCompanyJob> exCompanyJobs = studentService.selectHandInResumeByGraduateId(graduate.getGraduateid());
        int offernum = 0;
        for (int i = 0; i < exCompanyJobs.size(); i++) {
            ExCompanyJob exCompanyJob = exCompanyJobs.get(i);
            if (exCompanyJob.getHandInResume().getResumeState() == 2) {
                offernum++;
            }
        }
        model.addAttribute("exCompanyJobs", exCompanyJobs);
        model.addAttribute("handinresumeNumber", exCompanyJobs.size());
        model.addAttribute("offernum", offernum);
        return "forward:/jsp/stuclient/message.jsp";
    }

    @RequestMapping("/resume.action")
    public String resume(HttpSession session, Model model) {
        Graduate graduate = (Graduate) session.getAttribute("graduate");
        List<ExCompanyJob> exCompanyJobs = studentService.selectHandInResumeByGraduateId(graduate.getGraduateid());
        List<ExCompanyJob> OfferJobs = new ArrayList<ExCompanyJob>();
        for (int i = 0; i < exCompanyJobs.size(); i++) {
            ExCompanyJob exCompanyJob = exCompanyJobs.get(i);
            if (exCompanyJob.getHandInResume().getResumeState() == 0) {
                exCompanyJob.setMessage("简历已发送");
            } else if (exCompanyJob.getHandInResume().getResumeState() == 1) {
                exCompanyJob.setMessage("获得面试通知");
            } else if (exCompanyJob.getHandInResume().getResumeState() == 2) {
                OfferJobs.add(exCompanyJob);
                exCompanyJob.setMessage("获得Offer");
            }
        }
        model.addAttribute("exCompanyJobs", exCompanyJobs);
        model.addAttribute("OfferJobs", OfferJobs);
        return "forward:/jsp/stuclient/resume.jsp";
    }

    @RequestMapping("/employment.action")
    public String employment(HttpSession session, Model model) {
        Graduate graduate = (Graduate) session.getAttribute("graduate");
        List<ExCompanyJob> exCompanyJobs = studentService.selectHandInResumeByGraduateId(graduate.getGraduateid());
        List<ExCompanyJob> OfferJobs = new ArrayList<ExCompanyJob>();
        List<ExCompanyJob> interviewJobs = new ArrayList<ExCompanyJob>();
        for (int i = 0; i < exCompanyJobs.size(); i++) {
            ExCompanyJob exCompanyJob = exCompanyJobs.get(i);
            if (exCompanyJob.getHandInResume().getResumeState() == 0) {
                exCompanyJob.setMessage("简历已发送");
            } else if (exCompanyJob.getHandInResume().getResumeState() == 1) {
                interviewJobs.add(exCompanyJob);
                exCompanyJob.setMessage("获得面试通知");
            } else if (exCompanyJob.getHandInResume().getResumeState() == 2) {
                OfferJobs.add(exCompanyJob);
                exCompanyJob.setMessage("获得Offer");
            }
        }
        model.addAttribute("exCompanyJobs", exCompanyJobs);
        model.addAttribute("OfferJobs", OfferJobs);
        model.addAttribute("interviewJobs", interviewJobs);
        return "forward:/jsp/stuclient/employment.jsp";
    }

    @RequestMapping("/notice.action")
    public String notice(HttpSession session, Model model) {
        Graduate graduate = (Graduate) session.getAttribute("graduate");
        List<Notice> notices = studentService.SelectNoticeByGraduateId(graduate.getGraduateid());
        model.addAttribute("notices", notices);
        return "forward:/jsp/stuclient/notice.jsp";
    }
    @RequestMapping("/stu_notice_detail.action")
    public String stu_notice_detail(HttpSession session, Model model,int noticeid) {
        Notice notice = companyService.SelectNoticeBynoticeid(noticeid);
        model.addAttribute("notice", notice);
        return "forward:/jsp/stuclient/stu-notice-detail.jsp";
    }

    @RequestMapping("/handin.action")
    public String handin(HttpSession session, Model model, int jobid, int companyid) {
        Graduate graduate = (Graduate) session.getAttribute("graduate");
        Jobs jobs = studentService.selectGobsByGobid(jobid);
        HandInResume handInResume = new HandInResume();
        handInResume.setCompanyid(companyid);
        handInResume.setJobid(jobid);
        handInResume.setGraduateid(graduate.getGraduateid());
        handInResume.setInterviewdate(new Date());
        handInResume.setResumeState(0);
        handInResume.setIsView(0);
        handInResume.setSenddate(new Date());
        adminService.addHandinresume(handInResume);
        //notice
        Notice notice = new Notice();
        notice.setCompanyid(companyid);
        notice.setGraduateid(-1);
        notice.setNoticeContext("如题");
        notice.setNoticeFrom("系统");
        notice.setNoticeTitle(graduate.getGraduatename()+"同学投递了本公司"+jobs.getJobname()+"岗位,请及时确认.");
        notice.setNoticeTime(new Date());
        adminService.addNotice(notice);
        return "forward:/employment.action";
    }

    @RequestMapping("/deleteresume.action")
    public String deleteresume(HttpSession session, Model model, int jobid) {
        Graduate graduate = (Graduate) session.getAttribute("graduate");
        studentService.deleteHandinresum(jobid,graduate.getGraduateid());
        return "forward:/employment.action";
    }
}