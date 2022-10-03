package entity;

public class Student  extends  Person{
    //1. Cac thuoc tinh rieng cua Student
    private String studentId;
    private float mark;
    //2. Constructor rieng


    public Student() {
    }

    public Student(String name, int age, String address, String phone, String studentId, float mark) {
        super(name, age, address, phone);
        this.studentId = studentId;
        this.mark = mark;
    }

    public Student(String name, int age, String address, String phone, String studentId) {
        super(name, age, address, phone);
        this.studentId = studentId;
    }
    //3. Cac phuong thuc rieng
    //3.1. Cac phuong thuc get/set rieng

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    //3.2. Cac phuong thuc chuc nang rieng cua no
    public void inputDataStudent() {
        super.inputData();
        System.out.println("Nhap thong tin ma sinh vien va diem cua sinh vien");
    }

    public void displayDataStudent() {
        super.displayData();
        System.out.println("Hien thi thong tin ma sinh vien va diem cua sinh vien");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public float add(float num1, float num2){
        return num1+num2;
    }

    public void display(int num, String str){

    }
    public void display(String str, int num){

    }
    public void inputData(){
        System.out.println("Nhap thong tin cho Student");
    }

    public String toString(){
        return "Phuong thuc toString cua Object da bi Student ghi de";
    }

}
