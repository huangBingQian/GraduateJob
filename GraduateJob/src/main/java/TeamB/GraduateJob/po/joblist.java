package TeamB.GraduateJob.po;

public class joblist {
    private String jobid;

    private String jobname;

    private String companyname;

    private String pay;

    private String workplace;

    private String type;

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid == null ? null : jobid.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay == null ? null : pay.trim();
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    public String toString() {
        return "joblist{" +
                "jobid='" + jobid + '\'' +
                ", jobname='" + jobname + '\'' +
                ", companyname='" + companyname + '\'' +
                ", pay='" + pay + '\'' +
                ", workplace='" + workplace + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}