package teamB.GraduateJob.po;

public class Talk {
    private Integer talkid;

    private String theme;

    private String expectnumber;

    private String expecttime;

    public Integer getTalkid() {
        return talkid;
    }

    public void setTalkid(Integer talkid) {
        this.talkid = talkid;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getExpectnumber() {
        return expectnumber;
    }

    public void setExpectnumber(String expectnumber) {
        this.expectnumber = expectnumber == null ? null : expectnumber.trim();
    }

    public String getExpecttime() {
        return expecttime;
    }

    public void setExpecttime(String expecttime) {
        this.expecttime = expecttime == null ? null : expecttime.trim();
    }
}