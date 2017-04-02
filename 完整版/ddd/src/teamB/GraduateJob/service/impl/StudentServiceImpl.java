package teamB.GraduateJob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import teamB.GraduateJob.mapper.*;
import teamB.GraduateJob.po.*;
import teamB.GraduateJob.service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yxaw on 2016/12/18.
 */
public class StudentServiceImpl implements StudentService {
    @Autowired
    GraduateMapper graduateMapper;
    @Autowired
    NoticeMapper noticeMapper;
    @Autowired
    JobsMapper jobsMapper;
    @Autowired
    CompanyMapper companyMapper;
    @Autowired
    HandInResumeMapper handInResumeMapper;
    public Graduate findGraduateByGraduateId(int graduateid){
        return graduateMapper.selectByPrimaryKey(graduateid);
    }
    public int CountNoticeNumberByGraduateId(int graduateid){
        NoticeExample noticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        criteria.andGraduateidEqualTo(graduateid);
        return noticeMapper.countByExample(noticeExample);
    }
    public Jobs selectGobsByGobid(int jobid){
        return jobsMapper.selectByPrimaryKey(jobid);
    }
    public Company selectCompanyByCompanyid(int companyid){
        return companyMapper.selectByPrimaryKey(companyid);
    }
    public List<ExCompanyJob> selectHandInResumeByGraduateId(int graduateid){
        HandInResumeExample handInResumeExample= new HandInResumeExample();
        HandInResumeExample.Criteria criteria = handInResumeExample.createCriteria();
        criteria.andGraduateidEqualTo(graduateid);
        List<ExCompanyJob> exCompanyJobs = new ArrayList<ExCompanyJob>(); ;
        List<HandInResume> handInResumes = handInResumeMapper.selectByExample(handInResumeExample);
        for(int i = 0 ; i < handInResumes.size();i++){
            HandInResume handInResume = handInResumes.get(i);
            ExCompanyJob exCompanyJob = new ExCompanyJob();
            exCompanyJob.setJobs(jobsMapper.selectByPrimaryKey(handInResume.getJobid()));
            exCompanyJob.setCompany(companyMapper.selectByPrimaryKey(handInResume.getCompanyid()));
            exCompanyJob.setHandInResume(handInResume);
            exCompanyJobs.add(exCompanyJob);
        }
        return exCompanyJobs;
    }

    public List<Notice> SelectNoticeByGraduateId(int graduateid){
        NoticeExample noticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        criteria.andGraduateidEqualTo(graduateid);
        return noticeMapper.selectByExample(noticeExample);
    }
    public void deleteHandinresum(int jobid,int graduateid){
        HandInResumeExample handInResumeExample = new HandInResumeExample();
        HandInResumeExample.Criteria criteria=handInResumeExample.createCriteria();
        criteria.andGraduateidEqualTo(graduateid);
        criteria.andJobidEqualTo(jobid);
        handInResumeMapper.deleteByExample(handInResumeExample);
    }
}
