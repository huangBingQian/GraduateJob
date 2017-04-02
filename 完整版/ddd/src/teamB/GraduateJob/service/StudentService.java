package teamB.GraduateJob.service;

import teamB.GraduateJob.po.*;

import java.util.List;

/**
 * Created by yxaw on 2016/12/18.
 */
public interface StudentService {
    //----------Graduate
     Graduate findGraduateByGraduateId(int graduateid);
    //----------notice
     int CountNoticeNumberByGraduateId(int graduateid);
     List<Notice> SelectNoticeByGraduateId (int graduateid);

    //-----------job
    Jobs selectGobsByGobid(int jobid);
    //-----------company
    Company selectCompanyByCompanyid(int companyid);
    //-----------handinresume
    List<ExCompanyJob> selectHandInResumeByGraduateId(int graduateid);
    void deleteHandinresum(int jobid,int graduateid);


}
