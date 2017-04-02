package teamB.GraduateJob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import teamB.GraduateJob.mapper.*;
import teamB.GraduateJob.po.*;
import teamB.GraduateJob.service.CompanyService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yxaw on 2016/12/13.
 */
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanycharacterlistMapper companycharacterlistMapper;
    @Autowired
    private IndustrylistMapper industrylistMapper;
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private InformMapper informMapper;
    @Autowired
    private ContactMapper contactMapper;
    @Autowired
    private DivideMapper divideMapper;
    @Autowired
    private JobsMapper jobsMapper;
    @Autowired
    private HandInResumeMapper handInResumeMapper;
    @Autowired
    private  GraduateMapper graduateMapper;
    @Autowired
    private  NoticeMapper noticeMapper;
    public Company selectByCompanyId(int companyid){
        return companyMapper.selectByPrimaryKey(companyid);
    }
    public Inform selectInformByCompanyId(int companyid){
        //从contact表得到与Companyid关联的contactid,并通过contactid找到对应的contact.
        ContactExample contactExample = new ContactExample();
        ContactExample.Criteria criteria = contactExample.createCriteria();
        criteria.andCompanyidEqualTo(companyid);
        List<Contact> contacts = contactMapper.selectByExample(contactExample);
        //此处假设只能找到一个
        Contact contact=contacts.get(0);
        return informMapper.selectByPrimaryKey(contact.getContactid());
    }
    public List<Jobs> selectJosByCompanyId(int companyid){
        //先用companyid查divide表
        DivideExample divideExample = new DivideExample();
        DivideExample.Criteria criteria = divideExample.createCriteria();
        criteria.andCompanyidEqualTo(companyid);
        List<Divide> divides = divideMapper.selectByExample(divideExample);
        List<Jobs> jobs = new ArrayList<Jobs>();
        //遍历这个divide,查jobid在每个Job
        for(int i=0; i<divides.size();i++){
            Divide divide = divides.get(i);
            Jobs job=jobsMapper.selectByPrimaryKey(divide.getJobid());
            jobs.add(job);
        }
        return jobs;
    }

    public List<Notice> SelectNoticeBycompanyid (int companyid){
        NoticeExample noticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        criteria.andCompanyidEqualTo(companyid);
        return noticeMapper.selectByExample(noticeExample);
    }
    public List<ExCompanyJob> selectJobsBystu_job(String character,String industry){
        CompanyExample companyExample =new CompanyExample();
        CompanyExample.Criteria criteria = companyExample.createCriteria();
        if(!(character.equals("全体")))
        criteria.andCompanycharacterEqualTo(character);
        if(!(industry.equals("全体")))
        criteria.andIndustryEqualTo(industry);
        List<Company> companies=companyMapper.selectByExample(companyExample);
        List<ExCompanyJob> exCompanyJobs = new ArrayList<ExCompanyJob>();
        for(int i=0; i<companies.size();i++){
            Company company = companies.get(i);
            DivideExample divideExample = new DivideExample();
            DivideExample.Criteria criteria1 = divideExample.createCriteria();
            criteria1.andCompanyidEqualTo(company.getCompanyid());
            List<Divide> divides = divideMapper.selectByExample(divideExample);
            for(int j = 0 ; j < divides.size();j++){
                Divide divide = divides.get(j);
                Jobs job=jobsMapper.selectByPrimaryKey(divide.getJobid());
                ExCompanyJob exCompanyJob = new ExCompanyJob();
                exCompanyJob.setJobs(job);
                exCompanyJob.setCompany(company);
                exCompanyJobs.add(exCompanyJob);
            }
        }
        return exCompanyJobs;
    }
    public List<ExCompanyJob> selectHandInResumeByCompanyid(int companyid){
        HandInResumeExample handInResumeExample = new HandInResumeExample();
        HandInResumeExample.Criteria criteria = handInResumeExample.createCriteria();
        criteria.andCompanyidEqualTo(companyid);
        List<HandInResume> handInResumes = handInResumeMapper.selectByExample(handInResumeExample);
        List<ExCompanyJob> exCompanyJobs = new ArrayList<ExCompanyJob>();
        for(int i = 0 ; i < handInResumes.size();i++){
            HandInResume handInResume = handInResumes.get(i);
            ExCompanyJob exCompanyJob = new ExCompanyJob();
            exCompanyJob.setJobs(jobsMapper.selectByPrimaryKey(handInResume.getJobid()));
            exCompanyJob.setHandInResume(handInResume);
            exCompanyJob.setGraduate(graduateMapper.selectByPrimaryKey(handInResume.getGraduateid()));
            exCompanyJobs.add(exCompanyJob);
        }
        return exCompanyJobs;
    }

    public Jobs selectJobsByJobid(int jobid){
        return jobsMapper.selectByPrimaryKey(jobid);
    }

    public   Notice SelectNoticeBynoticeid (int noticeid){
        return noticeMapper.selectByPrimaryKey(noticeid);
    }
    public  void UpdataHandinResume(int graduateid,int jobid,int value){
        HandInResumeExample handInResumeExample = new HandInResumeExample();
        HandInResumeExample.Criteria criteria=handInResumeExample.createCriteria();
        criteria.andGraduateidEqualTo(graduateid);
        criteria.andJobidEqualTo(jobid);
        HandInResume handInResume = handInResumeMapper.selectByExample(handInResumeExample).get(0);
        handInResume.setResumeState(value);
        handInResumeMapper.updateByExample(handInResume,handInResumeExample);
    }
}
