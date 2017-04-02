package teamB.GraduateJob.service.impl;

/**
 * Created by yxaw on 2016/12/10.
 */

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import teamB.GraduateJob.po.Companycharacterlist;
import teamB.GraduateJob.po.ExCompanyJob;
import teamB.GraduateJob.po.Inform;
import teamB.GraduateJob.po.Jobs;
import teamB.GraduateJob.service.AdminService;
import teamB.GraduateJob.service.CompanyService;
import teamB.GraduateJob.service.StudentService;

import java.util.List;

public class CompanyServiceImplTest {
    public ApplicationContext applicationContext;
    public CompanyService companyService;
    public StudentService studentService;
    @Before
    public void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        companyService = (CompanyService) applicationContext.getBean("CompanyServiceImpl");
        studentService = (StudentService) applicationContext.getBean("StudentServiceImpl");
    }
    @Test //成功 输出:周勇
    public void selectInformByCompanyIdTest(){
        Inform inform=companyService.selectInformByCompanyId(10000);
        System.out.println(inform.getContactname());
    }
    @Test
    public void selectJosByCompanyId(){
        List<Jobs> jobs = companyService.selectJosByCompanyId(10000);
        for(int i=0; i<jobs.size();i++){
            System.out.println(jobs.get(i).getJobname());
        }
    }
    //成功
    @Test
    public void selectJobsBystu_jobTest(){
        List<ExCompanyJob> exCompanyJobs = companyService.selectJobsBystu_job("外企","IT行业");
        for(int i = 0 ; i < exCompanyJobs.size() ; i++){
            ExCompanyJob exCompanyJob = exCompanyJobs.get(i);
            System.out.printf(exCompanyJob.getJobs().getJobname());
        }
    }
    @Test
    public void selectHandInResumeByGraduateIdTest(){
        List<ExCompanyJob> exCompanyJobs = studentService.selectHandInResumeByGraduateId(14071225);
        for(int i = 0 ; i < exCompanyJobs.size() ; i++){
            ExCompanyJob exCompanyJob = exCompanyJobs.get(i);
            System.out.printf(exCompanyJob.getJobs().getJobname());
        }
    }
}
