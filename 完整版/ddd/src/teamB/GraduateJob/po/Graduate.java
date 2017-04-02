package teamB.GraduateJob.po;

public class Graduate {
    private Integer graduateid;

    private String graduatename;

    private String sex;

    private Integer age;

    private String major;

    private String graduatephone;

    private String graduateemail;

    private String masterskill;

    private String practicalexperience;

    private String classid;

    private String motto;

    private String stuLogo;

    private String resumeFile;

    private String grade;

    private String institute;

    private Integer graduateyear;

    private String stupassword;

    public Integer getGraduateid() {
        return graduateid;
    }

    public void setGraduateid(Integer graduateid) {
        this.graduateid = graduateid;
    }

    public String getGraduatename() {
        return graduatename;
    }

    public void setGraduatename(String graduatename) {
        this.graduatename = graduatename == null ? null : graduatename.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getGraduatephone() {
        return graduatephone;
    }

    public void setGraduatephone(String graduatephone) {
        this.graduatephone = graduatephone == null ? null : graduatephone.trim();
    }

    public String getGraduateemail() {
        return graduateemail;
    }

    public void setGraduateemail(String graduateemail) {
        this.graduateemail = graduateemail == null ? null : graduateemail.trim();
    }

    public String getMasterskill() {
        return masterskill;
    }

    public void setMasterskill(String masterskill) {
        this.masterskill = masterskill == null ? null : masterskill.trim();
    }

    public String getPracticalexperience() {
        return practicalexperience;
    }

    public void setPracticalexperience(String practicalexperience) {
        this.practicalexperience = practicalexperience == null ? null : practicalexperience.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto == null ? null : motto.trim();
    }

    public String getStuLogo() {
        return stuLogo;
    }

    public void setStuLogo(String stuLogo) {
        this.stuLogo = stuLogo == null ? null : stuLogo.trim();
    }

    public String getResumeFile() {
        return resumeFile;
    }

    public void setResumeFile(String resumeFile) {
        this.resumeFile = resumeFile == null ? null : resumeFile.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute == null ? null : institute.trim();
    }

    public Integer getGraduateyear() {
        return graduateyear;
    }

    public void setGraduateyear(Integer graduateyear) {
        this.graduateyear = graduateyear;
    }

    public String getStupassword() {
        return stupassword;
    }

    public void setStupassword(String stupassword) {
        this.stupassword = stupassword == null ? null : stupassword.trim();
    }
}