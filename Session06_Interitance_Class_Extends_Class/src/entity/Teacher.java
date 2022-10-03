package entity;

public class Teacher extends Person{
    private String teacherId;
    private String schoolName;

    public Teacher() {
    }

    public Teacher(String name, int age, String address, String phone, String teacherId, String schoolName) {
        super(name, age, address, phone);
        this.teacherId = teacherId;
        this.schoolName = schoolName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


}
