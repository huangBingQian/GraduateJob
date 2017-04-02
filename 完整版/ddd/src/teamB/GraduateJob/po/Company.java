package teamB.GraduateJob.po;

public class Company {
    private Integer companyid;

    private String companyname;

    private String companycharacter;

    private String companyplace;

    private String industry;

    private String companypassword;

    private String main;

    private String website;

    private String logo;

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanycharacter() {
        return companycharacter;
    }

    public void setCompanycharacter(String companycharacter) {
        this.companycharacter = companycharacter == null ? null : companycharacter.trim();
    }

    public String getCompanyplace() {
        return companyplace;
    }

    public void setCompanyplace(String companyplace) {
        this.companyplace = companyplace == null ? null : companyplace.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getCompanypassword() {
        return companypassword;
    }

    public void setCompanypassword(String companypassword) {
        this.companypassword = companypassword == null ? null : companypassword.trim();
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main == null ? null : main.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }
}