package TeamB.GraduateJob.po;

import java.util.Date;

public class notice {
    private Integer noticeid;

    private Integer userid;

    private String source;

    private String simplenotice;

    private String detailnotice;

    private Date date;

    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getSimplenotice() {
        return simplenotice;
    }

    public void setSimplenotice(String simplenotice) {
        this.simplenotice = simplenotice == null ? null : simplenotice.trim();
    }

    public String getDetailnotice() {
        return detailnotice;
    }

    public void setDetailnotice(String detailnotice) {
        this.detailnotice = detailnotice == null ? null : detailnotice.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}