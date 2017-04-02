package teamB.GraduateJob.po;

import java.util.Date;

public class HandInResume {
    private Integer graduateid;

    private Integer jobid;

    private Integer resumeState;

    private Integer isView;

    private Date interviewdate;

    private Date senddate;

    private Integer companyid;

    public Integer getGraduateid() {
        return graduateid;
    }

    public void setGraduateid(Integer graduateid) {
        this.graduateid = graduateid;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getResumeState() {
        return resumeState;
    }

    public void setResumeState(Integer resumeState) {
        this.resumeState = resumeState;
    }

    public Integer getIsView() {
        return isView;
    }

    public void setIsView(Integer isView) {
        this.isView = isView;
    }

    public Date getInterviewdate() {
        return interviewdate;
    }

    public void setInterviewdate(Date interviewdate) {
        this.interviewdate = interviewdate;
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }
}