package TeamB.GraduateJob.po;

import java.util.Date;

public class inform {
    private Integer informid;

    private String source;

    private String detail;

    private Date date;

    public Integer getInformid() {
        return informid;
    }

    public void setInformid(Integer informid) {
        this.informid = informid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}