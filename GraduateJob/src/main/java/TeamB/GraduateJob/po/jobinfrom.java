package TeamB.GraduateJob.po;

public class jobinfrom {
    private String jobid;

    private Integer jobnub;

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid == null ? null : jobid.trim();
    }

    public Integer getJobnub() {
        return jobnub;
    }

    public void setJobnub(Integer jobnub) {
        this.jobnub = jobnub;
    }
}