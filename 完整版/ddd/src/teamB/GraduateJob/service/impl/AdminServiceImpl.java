package teamB.GraduateJob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import teamB.GraduateJob.mapper.*;
import teamB.GraduateJob.po.*;
import teamB.GraduateJob.service.AdminService;

import java.util.List;
import java.util.jar.Pack200;

/**
 * Created by yxaw on 2016/12/10.
 */
public class AdminServiceImpl implements AdminService {
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
    private JobsMapper jobsMapper;
    @Autowired
    private DivideMapper divideMapper;
    @Autowired
    private TalkjobMapper talkjobMapper;
    @Autowired
    private JointalkMapper jointalkMapper;
    @Autowired
    private TalkMapper talkMapper;
    @Autowired
    private  GraduateMapper graduateMapper;
    @Autowired
    private NoticeMapper noticeMapper;
    @Autowired
    private HandInResumeMapper handInResumeMapper;
    @Override
    public void addCompanyCharacter(String companyCharacter){
        Companycharacterlist companycharacterlist= new Companycharacterlist();
        companycharacterlist.setCompanycharacter(companyCharacter);
        companycharacterlistMapper.insert(companycharacterlist);
    }
    @Override
    public void deleteCompanyCharacter(int companyCharacterId){
        companycharacterlistMapper.deleteByPrimaryKey(companyCharacterId);
    }
    @Override
    public List<Companycharacterlist> getCompanyCharacterList(){
        CompanycharacterlistExample companycharacterlistExample = new CompanycharacterlistExample();
        CompanycharacterlistExample.Criteria criteria =companycharacterlistExample.createCriteria();
        return companycharacterlistMapper.selectByExample(companycharacterlistExample);
    }


    public void addIndustry(String industry){
        Industrylist industrylist = new Industrylist();
        industrylist.setIndustry(industry);
        industrylistMapper.insert(industrylist);
    }

    public void deleteIndustry(int industryId){
        industrylistMapper.deleteByPrimaryKey(industryId);
    }

    public List<Industrylist> getIndustryList(){
        IndustrylistExample industrylistExample = new IndustrylistExample();
        IndustrylistExample.Criteria criteria = industrylistExample.createCriteria();
        return industrylistMapper.selectByExample(industrylistExample);
    }
    public void addCompany(Company company){
        companyMapper.insert(company);
    }
    public void deleteCompany(int companyid){
        companyMapper.deleteByPrimaryKey(companyid);
    }
    public List<Company> getCompany(){
        CompanyExample companyExample = new CompanyExample();
        CompanyExample.Criteria criteria = companyExample.createCriteria();
        return companyMapper.selectByExample(companyExample);
    }
    public void updataCompany(Company company){
        CompanyExample companyExample = new CompanyExample();
        CompanyExample.Criteria criteria = companyExample.createCriteria();
        criteria.andCompanyidEqualTo(company.getCompanyid());
        companyMapper.updateByExample(company,companyExample);
    }
    public void addInform(Inform inform){
            informMapper.insert(inform);
    }
    //给inform表删除项目byID
    public void deleteInform(int contactid){
            informMapper.deleteByPrimaryKey(contactid);
    }
    //读取inform表
    public List<Inform> getInform(){
        InformExample informExample = new InformExample();
        InformExample.Criteria criteria = informExample.createCriteria();
        return informMapper.selectByExample(informExample);
    }
    public void updataInform(Inform inform){
        InformExample informExample = new InformExample();
        InformExample.Criteria criteria = informExample.createCriteria();
        criteria.andContactidEqualTo(inform.getContactid());
        informMapper.updateByExample(inform,informExample);
    }
    //----------------------
    //给contact新增一个项目
    public void addContact(Contact contact){
        contactMapper.insert(contact);
    }
    //给contact删除项目
    public void deleteContact(Contact contact){
        ContactExample contactExample = new ContactExample();
        ContactExample.Criteria criteria = contactExample.createCriteria();
        criteria.andCompanyidEqualTo(contact.getCompanyid());
        criteria.andContactidEqualTo(contact.getContactid());
        contactMapper.deleteByExample(contactExample);
    }
    //读取Contact表
    public List<Contact> getContact(){
        ContactExample contactExample = new ContactExample();
        ContactExample.Criteria criteria = contactExample.createCriteria();
        return contactMapper.selectByExample(contactExample);
    }
    //--------------------jobs
    public int addJob(Jobs jobs){
        jobsMapper.insert(jobs);
        return jobs.getJobid();
    }
    public void deleteJob(int jobid){
        jobsMapper.deleteByPrimaryKey(jobid);
    }
    public List<Jobs> getJobs(){
        JobsExample jobsExample = new JobsExample();
        JobsExample.Criteria criteria = jobsExample.createCriteria();
        return jobsMapper.selectByExample(jobsExample);
    }
    public void updataJob(Jobs jobs){
        JobsExample jobsExample = new JobsExample();
        JobsExample.Criteria criteria = jobsExample.createCriteria();
        criteria.andJobidEqualTo(jobs.getJobid());
        jobsMapper.updateByExample(jobs,jobsExample);
    }
    public void deleteDivideByJobid(int jobid){
        jobsMapper.deleteByPrimaryKey(jobid);
    }
    //---------------divide 表
    public void addDivide(Divide divide){
        divideMapper.insert(divide);
    }
    public void deleteDivide(Divide divide){
        DivideExample divideExample= new DivideExample();
        DivideExample.Criteria criteria= divideExample.createCriteria();
        criteria.andCompanyidEqualTo(divide.getCompanyid());
        criteria.andJobidEqualTo(divide.getJobid());
        divideMapper.deleteByExample(divideExample);
    }
    public List<Divide> getDivide(){
        DivideExample divideExample= new DivideExample();
        return divideMapper.selectByExample(divideExample);
    }
    //---------------talkjob表
    public void addTalkjob(Talkjob talkjob){
        talkjobMapper.insert(talkjob);
    }
    public void deleteTalkjob(Talkjob talkjob){
        TalkjobExample talkjobExample = new TalkjobExample();
        TalkjobExample.Criteria criteria = talkjobExample.createCriteria();
        criteria.andJobidEqualTo(talkjob.getJobid());
        criteria.andTalkidEqualTo(talkjob.getTalkid());
        talkjobMapper.deleteByExample(talkjobExample);
    }
    public List<Talkjob> getTalkjob(){
        TalkjobExample talkjobExample = new TalkjobExample();
        return talkjobMapper.selectByExample(talkjobExample);
    }
    //---------------join表
    public void addJoin(Jointalk join){
        jointalkMapper.insert(join);
    }
    public void deleteJoin(Jointalk join){
        JointalkExample joinExample = new JointalkExample();
        JointalkExample.Criteria criteria = joinExample.createCriteria();
        criteria.andCompanyidEqualTo(join.getCompanyid());
        criteria.andTalkidEqualTo(join.getTalkid());
        jointalkMapper.deleteByExample(joinExample);
    }
    public List<Jointalk> getJoin(){
        JointalkExample joinExample = new JointalkExample();
        return jointalkMapper.selectByExample(joinExample);
    }
    //---------------talk表
    public void addTalk(Talk talk){
        talkMapper.insert(talk);
    }
    public void deleteTalk(int talkid){
        talkMapper.deleteByPrimaryKey(talkid);
    }
    public List<Talk> getTalk(){
        TalkExample talkExample = new TalkExample();
        return talkMapper.selectByExample(talkExample);
    }


    //------------graduate
    public void addGraduate(Graduate graduate){
        graduateMapper.insert(graduate);
    }
    public void deleteGraduate(int graduateid){
        graduateMapper.deleteByPrimaryKey(graduateid);
    }
    public List<Graduate> getGraduate(){
        GraduateExample graduateExample = new GraduateExample();
        GraduateExample.Criteria criteria = graduateExample.createCriteria();
        return graduateMapper.selectByExample(graduateExample);
    }
    //------------notice表
    public void addNotice(Notice notice){
        noticeMapper.insert(notice);
    }
    public void deleteNotice(int noticeid){
        noticeMapper.deleteByPrimaryKey(noticeid);
    }
    public List<Notice> getNotice(){
        NoticeExample noticeExample = new NoticeExample();
        return noticeMapper.selectByExample(noticeExample);
    }
    //-------------handinresume表
    public void addHandinresume(HandInResume handInResume){
        handInResumeMapper.insert(handInResume);
    }
    public void deleteHandinresume(HandInResume handInResume){
        HandInResumeExample handInResumeExample = new HandInResumeExample();
        HandInResumeExample.Criteria criteria = handInResumeExample.createCriteria();
        criteria.andJobidEqualTo(handInResume.getJobid());
        criteria.andGraduateidEqualTo(handInResume.getGraduateid());
        handInResumeMapper.deleteByExample(handInResumeExample);
    }
    public List<HandInResume> getHandinresum(){
        HandInResumeExample handInResumeExample = new HandInResumeExample();
        return handInResumeMapper.selectByExample(handInResumeExample);
    }
}
