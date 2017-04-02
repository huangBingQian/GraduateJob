package teamB.GraduateJob.po;

public class Recruitment {
    private Integer recruitmentid;

    private String resumenumber;

    private String interviewnumber;

    private String admitnumber;

    public Integer getRecruitmentid() {
        return recruitmentid;
    }

    public void setRecruitmentid(Integer recruitmentid) {
        this.recruitmentid = recruitmentid;
    }

    public String getResumenumber() {
        return resumenumber;
    }

    public void setResumenumber(String resumenumber) {
        this.resumenumber = resumenumber == null ? null : resumenumber.trim();
    }

    public String getInterviewnumber() {
        return interviewnumber;
    }

    public void setInterviewnumber(String interviewnumber) {
        this.interviewnumber = interviewnumber == null ? null : interviewnumber.trim();
    }

    public String getAdmitnumber() {
        return admitnumber;
    }

    public void setAdmitnumber(String admitnumber) {
        this.admitnumber = admitnumber == null ? null : admitnumber.trim();
    }
}