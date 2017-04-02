package teamB.GraduateJob.po;

public class Companycharacterlist {
    private Integer companycharacterid;

    private String companycharacter;

    public Integer getCompanycharacterid() {
        return companycharacterid;
    }

    public void setCompanycharacterid(Integer companycharacterid) {
        this.companycharacterid = companycharacterid;
    }

    public String getCompanycharacter() {
        return companycharacter;
    }

    public void setCompanycharacter(String companycharacter) {
        this.companycharacter = companycharacter == null ? null : companycharacter.trim();
    }
}