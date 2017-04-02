package TeamB.GraduateJob.po;

import java.util.Date;

public class dai_ban_shi_xiang {
    private Integer daibanshixiangid;

    private Integer userid;

    private String event;

    private Date date;

    private String place;

    private String leibie;

    public Integer getDaibanshixiangid() {
        return daibanshixiangid;
    }

    public void setDaibanshixiangid(Integer daibanshixiangid) {
        this.daibanshixiangid = daibanshixiangid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event == null ? null : event.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie == null ? null : leibie.trim();
    }
}