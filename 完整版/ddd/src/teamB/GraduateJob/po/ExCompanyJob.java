package teamB.GraduateJob.po;

/**
 * Created by yxaw on 2016/12/19.
 */
public class ExCompanyJob {
    private Jobs jobs;
    private Company company;
    private HandInResume handInResume;
    private  Graduate graduate;

    public Graduate getGraduate() {
        return graduate;
    }

    public void setGraduate(Graduate graduate) {
        this.graduate = graduate;
    }

    public HandInResume getHandInResume() {
        return handInResume;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setHandInResume(HandInResume handInResume) {
        this.handInResume = handInResume;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
