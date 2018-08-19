package zizai.model;

public class Student {
    private Integer id;

    private String name;

    private String age;

    private String sex;

    private  String chinese;
    private String math;
    private String english;

    public String  getChinese() {
        return chinese;
    }

    public void setChinese( String chinese) {
        this.chinese = chinese== null ? null : chinese.trim();
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math== null ? null : math.trim();
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english== null ? null : english.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }


}