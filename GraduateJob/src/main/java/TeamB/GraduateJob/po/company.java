package TeamB.GraduateJob.po;

public class company {
    private String companyname;

    private String companyplace;

    private String companycharacter;

    private String hangye;

    private String inform;

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyplace() {
        return companyplace;
    }

    public void setCompanyplace(String companyplace) {
        this.companyplace = companyplace == null ? null : companyplace.trim();
    }

    public String getCompanycharacter() {
        return companycharacter;
    }

    public void setCompanycharacter(String companycharacter) {
        this.companycharacter = companycharacter == null ? null : companycharacter.trim();
    }

    public String getHangye() {
        return hangye;
    }

    public void setHangye(String hangye) {
        this.hangye = hangye == null ? null : hangye.trim();
    }

    public String getInform() {
        return inform;
    }

    public void setInform(String inform) {
        this.inform = inform == null ? null : inform.trim();
    }
}