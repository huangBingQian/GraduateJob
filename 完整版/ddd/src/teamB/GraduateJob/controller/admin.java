package teamB.GraduateJob.controller;

/**
 * Created by yxaw on 2016/12/10.
 */
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import teamB.GraduateJob.po.*;
import teamB.GraduateJob.service.AdminService;

@Controller
public class admin {
    @Autowired
    private AdminService adminService;
    //---------------------------------------companycharacterlist----------------------------------
    //POST方法,读取companycharacter,并加入表中.
    @RequestMapping("/addcomchar.action")
    public String addcomchar(HttpServletRequest request) throws IOException{
        String companycharacter=request.getParameter("companycharacter");
        adminService.addCompanyCharacter(companycharacter);
        return "forward:/companycharacterlist.action";
    }
    //读取companycharacterlist全部内容返回到admin_addcomchar.jsp
    @RequestMapping("/companycharacterlist.action")
    public String companycharacterlist(HttpSession session, HttpServletRequest req, Model model){
        List<Companycharacterlist> companyCharacterlist = adminService.getCompanyCharacterList();
        model.addAttribute("companyCharacterlist", companyCharacterlist);

        return "forward:/jsp/admin/admin_addcomchar.jsp";
    }

    //删除companycharacterlist的表项,根据companycharacterid
    @RequestMapping("/deletecomchar.action")
    public String deletecomchar(HttpServletRequest request) throws IOException {
        int companycharacterid=Integer.parseInt(request.getParameter("companycharacterid"));
        adminService.deleteCompanyCharacter(companycharacterid);
        return "forward:/companycharacterlist.action";
    }

    //---------------------------------------industrylist.action----------------------------------
    @RequestMapping("/addindustrylist.action")
    public String addindustrylist(HttpServletRequest request) throws IOException{
        String industry=request.getParameter("industry");
        adminService.addIndustry(industry);
        return "forward:/industrylist.action";
    }
    //读取industrylist全部内容返回到admin_addcomchar.jsp
    @RequestMapping("/industrylist.action")
    public String industrylist(HttpSession session, HttpServletRequest req, Model model){
        List<Industrylist> industrylist = adminService.getIndustryList();
        model.addAttribute("industrylist", industrylist);
        return "forward:/jsp/admin/admin_industrylist.jsp";
    }
    //删除industrylist的表项,根据industrylistid
    @RequestMapping("/deleteindustrylist.action")
    public String deleteindustrylist(HttpServletRequest request) throws IOException {
        int industrylistid=Integer.parseInt(request.getParameter("industrylistid"));
        adminService.deleteIndustry(industrylistid);
        return "forward:/industrylist.action";
    }
    //---------------------------------------company.action----------------------------------
    //处理company页面,展现company表,companycharacterlsit,industrylist的内容
    @RequestMapping("/company.action")
    public String company(HttpSession session,HttpServletRequest req, Model model) throws  IOException{
        //companies
        List<Company> companies = adminService.getCompany();
        model.addAttribute("companies",companies);
        //companycharacterlists
        List<Companycharacterlist> companycharacterlists = adminService.getCompanyCharacterList();
        model.addAttribute("companycharacterlists",companycharacterlists);
        //industrylists
        List<Industrylist> industrylists = adminService.getIndustryList();
        model.addAttribute("industrylists",industrylists);
        return "forward:/jsp/admin/admin_company.jsp";
    }

    // 加入company项
    @RequestMapping("/addcompany.action")
    public String addcompany(HttpServletRequest request,MultipartFile logo) throws IOException{
        Company company = new Company();
        company.setCompanyid(Integer.parseInt(request.getParameter("Companyid")));
        company.setCompanypassword(request.getParameter("Companypassword"));
        company.setCompanyname(request.getParameter("Companyname"));
        company.setIndustry(request.getParameter("Industry"));
        company.setCompanycharacter(request.getParameter("Companycharacter"));
        company.setCompanyplace(request.getParameter("Companyplace"));
        //网址
        company.setWebsite(request.getParameter("website"));
        //主要内容
        company.setMain(request.getParameter("main"));

        //处理上传的图片
        if(logo != null){
            //存储图片的物理路径
            String pic_path = "D:\\updata\\logo\\";
            //原始名称
            String originalFilename=logo.getOriginalFilename();
            //新的名称
            String newFilename = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));

            File newFile = new java.io.File(pic_path+newFilename);
            //将内存的数据写入磁盘
            logo.transferTo(newFile);
            company.setLogo(newFilename);
        }


        adminService.addCompany(company);
        return "forward:/company.action";

    }
    @RequestMapping("/deletecompany.action")
    public String deletecompany(HttpServletRequest request) throws IOException{
        adminService.deleteCompany(Integer.parseInt(request.getParameter("Companyid")));
        return "forward:/company.action";
    }
    //-----------------------------contact.action 关系表
    @RequestMapping("contact.action")
    public String contact(HttpServletRequest req,Model model){
        List<Contact> contacts = adminService.getContact();
        model.addAttribute("contacts",contacts);
        return "forward:/jsp/admin/admin_contact.jsp";
    }
    @RequestMapping("addcontact.action")
    public String addcontact(HttpServletRequest req){
        Contact contact= new Contact();
        contact.setCompanyid(Integer.parseInt(req.getParameter("companyid")));
        contact.setContactid(Integer.parseInt(req.getParameter("contactid")));
        adminService.addContact(contact);
        return "forward:/contact.action";
    }
    @RequestMapping("deletecontact.action")
    public String deletecontact(HttpServletRequest req){
        Contact contact= new Contact();
        contact.setCompanyid(Integer.parseInt(req.getParameter("companyid")));
        contact.setContactid(Integer.parseInt(req.getParameter("contactid")));
        adminService.deleteContact(contact);
        return "forward:/contact.action";
    }
    //------------------------infom表
    @RequestMapping("inform.action")
    public String inform(HttpServletRequest req,Model model){
        List<Inform> informs = adminService.getInform();
        model.addAttribute("informs",informs);
        return "forward:/jsp/admin/admin_inform.jsp";
    }
    @RequestMapping("addinform.action")
    public String addinform(HttpServletRequest req){
        Inform inform = new Inform();
        inform.setPhonenumber(req.getParameter("phonenumber"));
        inform.setContactemail(req.getParameter("contactemail"));
        inform.setQq(req.getParameter("qq"));
        inform.setMachinenumber(req.getParameter("machinenumber"));
        inform.setContactname(req.getParameter("contactname"));
        inform.setAddress(req.getParameter("address"));
        adminService.addInform(inform);
        return "forward:/inform.action";
    }
    @RequestMapping("deleteinform.action")
    public String deleteinform(HttpServletRequest req){
        adminService.deleteInform(Integer.parseInt(req.getParameter("contactid")));
        return "forward:/inform.action";
    }
    //----------------jobs表
    @RequestMapping("job.action")
    public String job(HttpServletRequest req,Model model){
        List<Jobs> jobs = adminService.getJobs();
        model.addAttribute("jobs",jobs);
        return "forward:/jsp/admin/admin_job.jsp";
    }
    @RequestMapping("addjob.action")
    public String addjob(HttpServletRequest req){
        Inform inform = new Inform();
        Jobs job = new Jobs();
        job.setJobaddress(req.getParameter("jobaddress"));
        job.setJobdemand(req.getParameter("jobdemand"));
        job.setJobfunction(req.getParameter("jobfunction"));
        job.setJobname(req.getParameter("jobname"));
        job.setJobnumber(req.getParameter("jobnumber"));
        job.setJobsalary(Integer.parseInt(req.getParameter("jobsalary")));
        adminService.addJob(job);
        return "forward:/job.action";
    }
    @RequestMapping("deletejob.action")
    public String deletejob(HttpServletRequest req){
        adminService.deleteJob(Integer.parseInt(req.getParameter("jobid")));
        return "forward:/job.action";
    }
    //-----------------------------divide.action 关系表
    @RequestMapping("divide.action")
    public String divide(HttpServletRequest req,Model model){
        List<Divide> divides = adminService.getDivide();
        model.addAttribute("divides",divides);
        return "forward:/jsp/admin/admin_divide.jsp";
    }
    @RequestMapping("adddivide.action")
    public String adddivide(HttpServletRequest req){
        Divide divide = new Divide();
        divide.setCompanyid(Integer.parseInt(req.getParameter("companyid")));
        divide.setJobid(Integer.parseInt(req.getParameter("jobid")));
        adminService.addDivide(divide);
        return "forward:/divide.action";
    }
    @RequestMapping("deletedivide.action")
    public String deletedivide(HttpServletRequest req){
        Divide divide= new Divide();
        divide.setCompanyid(Integer.parseInt(req.getParameter("companyid")));
        divide.setJobid(Integer.parseInt(req.getParameter("jobid")));
        adminService.deleteDivide(divide);
        return "forward:/divide.action";
    }
    //-----------------------------join.action 关系表
    @RequestMapping("join.action")
    public String join(HttpServletRequest req,Model model){
        List<Jointalk> joins = adminService.getJoin();
        model.addAttribute("joins",joins);
        return "forward:/jsp/admin/admin_join.jsp";
    }
    @RequestMapping("addjoin.action")
    public String addjoin(HttpServletRequest req){
        Jointalk join = new Jointalk();
        join.setCompanyid(Integer.parseInt(req.getParameter("companyid")));
        join.setTalkid(Integer.parseInt(req.getParameter("talkid")));
        adminService.addJoin(join);
        return "forward:/join.action";
    }
    @RequestMapping("deletejoin.action")
    public String deletejoin(HttpServletRequest req){
        Jointalk join = new Jointalk();
        join.setCompanyid(Integer.parseInt(req.getParameter("companyid")));
        join.setTalkid(Integer.parseInt(req.getParameter("talkid")));
        adminService.deleteJoin(join);
        return "forward:/join.action";
    }
    //-----------------------------talkjob.action 关系表
    @RequestMapping("talkjob.action")
    public String talkjob(HttpServletRequest req,Model model){
        List<Talkjob> talkjobs = adminService.getTalkjob();
        model.addAttribute("talkjobs",talkjobs);
        return "forward:/jsp/admin/admin_talkjob.jsp";
    }
    @RequestMapping("addtalkjob.action")
    public String addtalkjob(HttpServletRequest req){
        Talkjob talkjob = new Talkjob();
        talkjob.setJobid(Integer.parseInt(req.getParameter("jobid")));
        talkjob.setTalkid(Integer.parseInt(req.getParameter("talkid")));
        adminService.addTalkjob(talkjob);
        return "forward:/talkjob.action";
    }
    @RequestMapping("deletetalkjob.action")
    public String deletetalkjob(HttpServletRequest req){
        Talkjob talkjob = new Talkjob();
        talkjob.setJobid(Integer.parseInt(req.getParameter("jobid")));
        talkjob.setTalkid(Integer.parseInt(req.getParameter("talkid")));
        adminService.deleteTalkjob(talkjob);
        return "forward:/talkjob.action";
    }
    //----------------talk表
    @RequestMapping("talk.action")
    public String talk(HttpServletRequest req,Model model){
        List<Talk> talks = adminService.getTalk();
        model.addAttribute("talks",talks);
        return "forward:/jsp/admin/admin_talk.jsp";
    }
    @RequestMapping("addtalk.action")
    public String addtalk(HttpServletRequest req){
        Talk talk = new Talk();
        talk.setExpectnumber(req.getParameter("expectnumber"));
        talk.setExpecttime(req.getParameter("expecttime"));
        talk.setTheme(req.getParameter("theme"));
        adminService.addTalk(talk);
        return "forward:/talk.action";
    }
    @RequestMapping("deletetalk.action")
    public String deletetalk(HttpServletRequest req){
        adminService.deleteTalk(Integer.parseInt(req.getParameter("talkid")));
        return "forward:/talk.action";
    }
    //---------------------------------------graduate.action----------------------------------
    @RequestMapping("/graduate.action")
    public String graduate(HttpSession session,HttpServletRequest req, Model model) throws  IOException{
        //companies
        List<Graduate> graduates = adminService.getGraduate();
        model.addAttribute("graduates",graduates);
        return "forward:/jsp/admin/admin_graduate.jsp";
    }
    @RequestMapping("/addgraduate.action")
    public String addgraduate(HttpServletRequest request,MultipartFile logo,Graduate graduate,MultipartFile resumefile) throws IOException{

        //处理上传的图片
        if(logo != null){
            //存储图片的物理路径
            String pic_path = "D:\\updata\\stulogo\\";
            //原始名称
            String originalFilename=logo.getOriginalFilename();
            //新的名称
            String newFilename = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));

            File newFile = new java.io.File(pic_path+newFilename);
            //将内存的数据写入磁盘
            logo.transferTo(newFile);
            graduate.setStuLogo(newFilename);
        }
        if(resumefile != null){
            //存储图片的物理路径
            String pic_path = "D:\\updata\\resume\\";
            //原始名称
            String originalFilename=resumefile.getOriginalFilename();
            //新的名称
            String newFilename = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));

            File newFile = new java.io.File(pic_path+newFilename);
            //将内存的数据写入磁盘
            resumefile.transferTo(newFile);
            graduate.setResumeFile(newFilename);
        }
        adminService.addGraduate(graduate);
        return "forward:/graduate.action";
    }
    @RequestMapping("/deletegraduate.action")
    public String deletecompany(HttpServletRequest request,int graduateid) throws IOException{
        adminService.deleteGraduate(graduateid);
        return "forward:/graduate.action";
    }
    /////---------------------------------------notice--------------

    @RequestMapping("/adminnotice.action")
    public String adminnotice(HttpServletRequest request,Model model){
        List<Notice> notices = adminService.getNotice();
        model.addAttribute("notices",notices);
        return "forward:/jsp/admin/admin_notice.jsp";

    }
    @RequestMapping("/addnotice.action")
    public String addnotice(HttpServletRequest request,Notice notice){
        adminService.addNotice(notice);
        return "forward:/admin_notice.action";
    }
    @RequestMapping("/deletenotice.action")
    public String deletenotice(HttpServletRequest request,int noticeid){
        adminService.deleteNotice(noticeid);
        return "forward:/adminnotice.action";
    }
    ///---------------------------------------handinresume
    @RequestMapping("/handinresume.action")
    public String handinresume(HttpServletRequest request,Model model){
        List<HandInResume> handInResumes = adminService.getHandinresum();
        model.addAttribute("handInResumes",handInResumes);
        return "forward:/jsp/admin/handinresume.jsp";
    }
    @RequestMapping("/addhandinresume.action")
    public String addhandinresume(HttpServletRequest request,HandInResume handInResume){
        adminService.addHandinresume(handInResume);
        return "forward:/handinresume.action";
    }
    @RequestMapping("/deletehandinresume.action")
    public String deletehandinresume(HttpServletRequest request,HandInResume handInResume){
        adminService.deleteHandinresume(handInResume);
        return "forward:/handinresume.action";
    }
}
