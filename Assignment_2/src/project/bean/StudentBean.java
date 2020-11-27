//Ñ§ÉúÀà
package project.bean;

public class StudentBean {
    private String s_id;
    private String s_name;
    private String s_age;
    private String s_sex;
    private String s_academy;
    private String s_address;

    public StudentBean() {

    }

    public StudentBean(String s_id, String s_name, String s_age, String s_sex,
                       String s_academy, String s_address) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_age = s_age;
        this.s_sex = s_sex;
        this.s_academy = s_academy;
        this.s_address = s_address;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_age() {
        return s_age;
    }

    public void setS_age(String s_age) {
        this.s_age = s_age;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public String getS_academy() {
        return s_academy;
    }

    public void setS_academy(String s_academy) {
        this.s_academy = s_academy;
    }

    public String getS_address() {
        return s_address;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address;
    }

}
