package teamB.GraduateJob.po;

public class Jobs {
    private Integer jobid;

    private String jobname;

    private String jobnumber;

    private String jobdemand;

    private String jobfunction;

    private Integer jobsalary;

    private String jobaddress;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber == null ? null : jobnumber.trim();
    }

    public String getJobdemand() {
        return jobdemand;
    }

    public void setJobdemand(String jobdemand) {
        this.jobdemand = jobdemand == null ? null : jobdemand.trim();
    }

    public String getJobfunction() {
        return jobfunction;
    }

    public void setJobfunction(String jobfunction) {
        this.jobfunction = jobfunction == null ? null : jobfunction.trim();
    }

    public Integer getJobsalary() {
        return jobsalary;
    }

    public void setJobsalary(Integer jobsalary) {
        this.jobsalary = jobsalary;
    }

    public String getJobaddress() {
        return jobaddress;
    }

    public void setJobaddress(String jobaddress) {
        this.jobaddress = jobaddress == null ? null : jobaddress.trim();
    }
}