package teamB.GraduateJob.service.impl;

/**
 * Created by yxaw on 2016/12/10.
 */
import javafx.application.Application;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import teamB.GraduateJob.mapper.CompanycharacterlistMapper;
import teamB.GraduateJob.po.Companycharacterlist;
import teamB.GraduateJob.po.Jobs;
import teamB.GraduateJob.service.AdminService;

import java.util.List;

public class AdminServiceImplTest {
    public ApplicationContext applicationContext;
    public AdminService adminService;
    @Before
    public void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        adminService = (AdminService) applicationContext.getBean("AdminServiceImpl");
    }
    @Test
    public void addCompanyCharacterTest(){
        //测试是否能正常进行 success
        String name=new String("dadada");
        adminService.addCompanyCharacter(name);
    }
    @Test
    public void deleteCompanyCharacterTest(){
        //测试是否能正常运行 success
        adminService.deleteCompanyCharacter(2);
    }
    @Test
    public void  getCompanyCharacterList(){
        //测试是否能正常运行 success
        List<Companycharacterlist> companycharacterlists=adminService.getCompanyCharacterList();
        for(int i=0;  i<companycharacterlists.size();i++) {
            Companycharacterlist a=companycharacterlists.get(i);
            System.out.println(a.getCompanycharacter());
        }
    }
    //nice,自增id会存到getJobid!
    @Test
    public void getJob(){
        Jobs jobs = new Jobs();
        jobs.setJobsalary(11);
        jobs.setJobnumber("11");
        jobs.setJobaddress("ss");
        jobs.setJobname("111");
        jobs.setJobdemand("11");
        jobs.setJobfunction("111");
        adminService.addJob(jobs);
        System.out.println(jobs.getJobid());
    }
}
