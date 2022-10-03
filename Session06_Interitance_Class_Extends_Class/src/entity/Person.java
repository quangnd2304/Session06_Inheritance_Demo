package entity;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phone;

    public Person() {
    }

    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    protected void inputData(){
        System.out.println("Nhap thong tin cho Person");
    }

    public void displayData(){
        System.out.println("Hien thi thong tin Person");
        int a = (int)8.7F;//float --> int --> cast explicit - Tuong minh
        float b = 8;//int --> float --> cast implicit - Ngam dinh
        System.out.println(""+5);
        Scanner sc = new Scanner(System.in);
        int c = Integer.parseInt(sc.nextLine());
        String str = c+"";
    }
}
