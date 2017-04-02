package teamB.GraduateJob.service;

import teamB.GraduateJob.po.*;

import java.util.List;

/**
 * Created by yxaw on 2016/12/13.
 */
public interface CompanyService {
    //------------------Company表
    Company selectByCompanyId(int companyid);

    //------------------contactid表
    Inform selectInformByCompanyId(int companyid);

    //------------------job表

    List<Jobs> selectJosByCompanyId(int companyid);
    List<ExCompanyJob> selectJobsBystu_job(String character, String industry);
    Jobs selectJobsByJobid(int jobid);
    //------------------graduate表
    //------------handinresume
    List<ExCompanyJob> selectHandInResumeByCompanyid(int companyid);
    //-notice

    List<Notice> SelectNoticeBycompanyid (int companyid);
    Notice SelectNoticeBynoticeid (int noticeid);

    void UpdataHandinResume(int graduateid,int jobid,int value);
}
