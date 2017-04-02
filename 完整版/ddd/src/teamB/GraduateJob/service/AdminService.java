package teamB.GraduateJob.service;

/**
 * Created by yxaw on 2016/12/10.
 */
import com.sun.org.apache.xpath.internal.operations.Div;
import teamB.GraduateJob.po.*;
import java.util.List;
public interface AdminService {
    //-------------------CompanyCharacterList表------------------------------

    //给CompanyCharacterList表(公司性质表)增加新的项目
    void addCompanyCharacter(String companyCharacter);
    //给CompanyCharacterList表(公司性质表)删除项目byID
    void deleteCompanyCharacter(int companyCharacterId);
    //读取CompanyCharacterList表
    List<Companycharacterlist> getCompanyCharacterList();

    //-------------------IndustryList表------------------------------

    //给IndustryList表(公司性质表)增加新的项目
    void addIndustry(String industry);
    //给IndustryList表(公司性质表)删除项目byID
    void deleteIndustry(int industryId);
    //读取IndustryList表
    List<Industrylist> getIndustryList();
    //-------------------Company表------------------------------
    //给Company表增加新的项目
    void addCompany(Company company);
    //给Company表(公司性质表)删除项目byID
    void deleteCompany(int companyid);
    //读取Company表
    List<Company> getCompany();

    void updataCompany(Company company);
    //-------------------inform表------------------------------
    //给inform表新增一个项目
    void addInform(Inform inform);
    //给inform表删除项目byID
    void deleteInform(int contactid);
    //读取inform表
    List<Inform> getInform();

    void updataInform(Inform inform);
    //---------------contact表
    //给contact新增一个项目
    void addContact(Contact contact);
    //给contact删除项目
    void deleteContact(Contact contact);
    //读取Contact表
    List<Contact> getContact();
    //---------------job 表
    //给job新增一个项目
    int addJob(Jobs jobs);
    void deleteJob(int jobid);
    List<Jobs> getJobs();
    void updataJob(Jobs jobs);
    //---------------divide 表
    void addDivide(Divide divide);
    void deleteDivide(Divide divide);
    void deleteDivideByJobid(int jobid);
    List<Divide> getDivide();
    //---------------talkjob表
    void addTalkjob(Talkjob talkjob);
    void deleteTalkjob(Talkjob talkjob);
    List<Talkjob> getTalkjob();
    //---------------join表
    void addJoin(Jointalk join);
    void deleteJoin(Jointalk join);
    List<Jointalk> getJoin();
    //---------------talk表
    void addTalk(Talk talk);
    void deleteTalk(int talkid);
    List<Talk> getTalk();
    //------------graduate表
    void addGraduate(Graduate graduate);
    void deleteGraduate(int graduateid);
    List<Graduate> getGraduate();
    //------------notice表
    void addNotice(Notice notice);
    void deleteNotice(int noticeid);
    List<Notice> getNotice();
    //-------------handinresume表
    void addHandinresume(HandInResume handInResume);
    void deleteHandinresume(HandInResume handInResume);
    List<HandInResume> getHandinresum();
}
