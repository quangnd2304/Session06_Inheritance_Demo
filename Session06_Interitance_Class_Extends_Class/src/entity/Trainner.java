package entity;

public class Trainner extends Teacher {
    public Trainner(String name, int age, String address, String phone, String teacherId, String schoolName) {
        super(name, age, address, phone, teacherId, schoolName);
    }

    public void displayTrainner(){
        super.displayData();
        System.out.println(super.getTeacherId());
    }
}
