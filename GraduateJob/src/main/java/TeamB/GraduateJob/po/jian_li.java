package TeamB.GraduateJob.po;

public class jian_li {
    private Integer userid;

    private Integer phonenum;

    private String email;

    private String ability;

    private String experience;

    private String file;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(Integer phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability == null ? null : ability.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    @Override
    public String toString() {
        return "jian_li{" +
                "userid=" + userid +
                ", phonenum=" + phonenum +
                ", email='" + email + '\'' +
                ", ability='" + ability + '\'' +
                ", experience='" + experience + '\'' +
                ", file='" + file + '\'' +
                '}';
    }
}