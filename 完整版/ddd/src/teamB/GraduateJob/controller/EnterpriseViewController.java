package teamB.GraduateJob.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import teamB.GraduateJob.po.*;
import teamB.GraduateJob.service.AdminService;
import teamB.GraduateJob.service.CompanyService;
import teamB.GraduateJob.service.StudentService;

/**
 * Created by yxaw on 2016/11/16.
 */
@Controller
public class EnterpriseViewController {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private StudentService studentService;
    @RequestMapping("/company_home.action")
    //currentPage为传入的现在是第几页
    public String company_home(HttpSession session, HttpServletRequest req, Model model) {
        return "forward:/jsp/comclient/company-home.jsp";
    }



    @RequestMapping("/company_notice.action")
    public String company_notice(HttpSession session, HttpServletRequest req, Model model) {
        Company company = (Company) session.getAttribute("company");
        List<Notice> notices = companyService.SelectNoticeBycompanyid(company.getCompanyid());
        model.addAttribute("notices", notices);
        return "forward:/jsp/comclient/company-notice.jsp";
    }
    @RequestMapping("/company_notice_detail.action")
    public String company_notice_detail(HttpSession session, HttpServletRequest req, Model model,int noticeid) {
        Notice notice=companyService.SelectNoticeBynoticeid(noticeid);
        model.addAttribute("notice", notice);
        return "forward:/jsp/comclient/company-notice-detail.jsp";
    }

    @RequestMapping("/company_offer.action")
    //currentPage为传入的现在是第几页
    public String company_offer(HttpSession session, HttpServletRequest req, Model model) {
        return "forward:/jsp/comclient/company-offer.jsp";
    }
    @RequestMapping("/company_resume_details.action")
    //currentPage为传入的现在是第几页
    public String company_resume_details(HttpSession session, HttpServletRequest req, Model model,int jobid,int graduateid) {
        ExCompanyJob exCompanyJob = new ExCompanyJob();
        exCompanyJob.setJobs(companyService.selectJobsByJobid(jobid));
        exCompanyJob.setGraduate(studentService.findGraduateByGraduateId(graduateid));
        model.addAttribute("exCompanyJob",exCompanyJob);
        return "forward:/jsp/comclient/company-resume-details.jsp";
    }
    @RequestMapping("/company_resume_view.action")
    public String company_resume_view(HttpSession session, HttpServletRequest req, Model model) {
        Company company = (Company) session.getAttribute("company");
        List<ExCompanyJob> exCompanyJobs = companyService.selectHandInResumeByCompanyid(company.getCompanyid());
        for(int i = 0; i<exCompanyJobs.size();i++){
            ExCompanyJob exCompanyJob = exCompanyJobs.get(i);
            if(exCompanyJob.getHandInResume().getIsView() == 0)
                exCompanyJob.setMessage("未查看");
            else exCompanyJob.setMessage("已查看");

            if(exCompanyJob.getHandInResume().getResumeState() ==1){
                exCompanyJob.setMessage("已发送面试通知");
            }
            else if(exCompanyJob.getHandInResume().getResumeState() ==2){
                exCompanyJob.setMessage("已发送offer");
            }
        }
        model.addAttribute("exCompanyJobs",exCompanyJobs);
        return "forward:/jsp/comclient/company-resume-view.jsp";
    }
    @RequestMapping("/company_stumesgcheek.action")
    //currentPage为传入的现在是第几页
    public String company_stumesgcheek(HttpSession session, HttpServletRequest req, Model model) {
        return "forward:/jsp/comclient/company-stumesgcheek.jsp";
    }
    @RequestMapping("/company_stusearch.action")
    //currentPage为传入的现在是第几页
    public String company_stusearch(HttpSession session, HttpServletRequest req, Model model) {
        return "forward:/jsp/comclient/company-stusearch.jsp";
    }

    //------------------------------------------company_baseInfo
    @RequestMapping("/company_baseInfo.action")
    public String company_baseInfo(HttpSession session, HttpServletRequest req, Model model) {
        int companyid = (Integer) session.getAttribute("userId");
        List<Industrylist> industrylists = adminService.getIndustryList();
        List<Companycharacterlist> companycharacterlists = adminService.getCompanyCharacterList();
        Inform inform = companyService.selectInformByCompanyId(companyid);
        model.addAttribute("industrylists", industrylists);
        model.addAttribute("companycharacterlists",companycharacterlists);
        model.addAttribute("inform",inform);
        return "forward:/jsp/comclient/company-baseInfo.jsp";
    }
    @RequestMapping("/company_baseInfo_updatecompany.action")
    public String company_baseInfo_updatecompany(HttpSession session, HttpServletRequest req, Model model) {
        Company company=(Company) session.getAttribute("company");
        company.setCompanyname(req.getParameter("companyname"));
        company.setIndustry(req.getParameter("industry"));
        company.setCompanyplace(req.getParameter("companyplace"));
        company.setCompanycharacter(req.getParameter("companycharacter"));
        company.setMain(req.getParameter("main"));
        adminService.updataCompany(company);
        session.setAttribute("company",company);
        return "forward:/company_baseInfo.action";
    }
    @RequestMapping("/company_baseInfo_updatainform.action")
    public String company_baseInfo_updatainform (HttpSession session, HttpServletRequest req){
        int companyid = (Integer) session.getAttribute("userId");
        Inform inform = companyService.selectInformByCompanyId(companyid);
        inform.setAddress(req.getParameter("address"));
        inform.setContactname(req.getParameter("contactname"));
        inform.setContactemail(req.getParameter("contactemail"));
        inform.setMachinenumber(req.getParameter("machinenumber"));
        inform.setPhonenumber(req.getParameter("phonenumber"));
        inform.setQq(req.getParameter("qq"));
        adminService.updataInform(inform);
        return "forward:/company_baseInfo.action";
    }
    //------------------------------company_infomsg
    @RequestMapping("/company_infomsg.action")
    //currentPage为传入的现在是第几页
    public String company_infomsg(HttpSession session, HttpServletRequest req, Model model) {
        int companyid = (Integer) session.getAttribute("userId");
        List<Jobs> jobs = companyService.selectJosByCompanyId(companyid);
        model.addAttribute("jobs",jobs);
        return "forward:/jsp/comclient/company-infomsg.jsp";
    }
    @RequestMapping("/company_infomsg_change.action")
    public String company_infomsg_change(HttpSession session, HttpServletRequest req, Model model,Jobs jobs) {
            adminService.updataJob(jobs);
            return "forward:/company_infomsg.action";
    }
    @RequestMapping("/company_infomsg_add.action")
    public String company_infomsg_add(HttpSession session, HttpServletRequest req, Model model,Jobs jobs) {
        //插入job,插入divide
        int companyid = (Integer) session.getAttribute("userId");
        Divide divide = new Divide();
        int jobid=adminService.addJob(jobs);
        divide.setJobid(jobid);
        divide.setCompanyid(companyid);
        adminService.addDivide(divide);
        return "forward:/company_infomsg.action";
    }
    @RequestMapping("/company_infomsg_delete.action")
    public String company_infomsg_delete(HttpSession session,HttpServletRequest req,int jobid){
        //删除divide,job
        adminService.deleteDivideByJobid(jobid);
        adminService.deleteJob(jobid);
        return "forward:/company_infomsg.action";
    }

    //------infoarr
    @RequestMapping("/company_infoarr.action")
    //currentPage为传入的现在是第几页
    public String company_infoarr(HttpSession session, HttpServletRequest req, Model model) {
        return "forward:/jsp/comclient/company-infoarr.jsp";
    }


    @RequestMapping("/company_interview_notice.action")
    public String company_interview_notice(HttpSession session, HttpServletRequest req, Model model,int jobid,int graduateid) {
        companyService.UpdataHandinResume(graduateid,jobid,1);
        //加入notice
        Jobs jobs = companyService.selectJobsByJobid(jobid);
        Company company = (Company) session.getAttribute("company");
        Notice notice = new Notice();
        notice.setCompanyid(-1);
        notice.setGraduateid(graduateid);
        notice.setNoticeContext("面试时间是2016年1月11日,请您做好准备参加");
        notice.setNoticeFrom("系统");
        notice.setNoticeTitle(company.getCompanyname()+"对你投递的"+jobs.getJobname()+"岗位,发送了面试邀请.");
        notice.setNoticeTime(new Date());
        adminService.addNotice(notice);
        return "forward:/company_resume_view.action";
    }
    @RequestMapping("/company_offer_notice.action")
    public String company_offer_notice(HttpSession session, HttpServletRequest req, Model model,int jobid,int graduateid) {
        companyService.UpdataHandinResume(graduateid,jobid,2);
        //加入notice
        Jobs jobs = companyService.selectJobsByJobid(jobid);
        Company company = (Company) session.getAttribute("company");
        Notice notice = new Notice();
        notice.setCompanyid(-1);
        notice.setGraduateid(graduateid);
        notice.setNoticeContext("正式入职时间将会有联系人与你联系");
        notice.setNoticeFrom("系统");
        notice.setNoticeTitle("恭喜你!获得"+company.getCompanyname()+"的"+jobs.getJobname()+"的Offer!");
        notice.setNoticeTime(new Date());
        adminService.addNotice(notice);
        return "forward:/company_resume_view.action";
    }
    @RequestMapping("/company_addjob.action")
    public String  company_addjob(HttpSession session, HttpServletRequest req, Model model,Jobs jobs){
        Company company = (Company) session.getAttribute("company");
        int jobid=adminService.addJob(jobs);
        Divide divide = new Divide();
        divide.setCompanyid(company.getCompanyid());
        divide.setJobid(jobid);
        adminService.addDivide(divide);
        return "forward:/company_infomsg.action";
    }

}
