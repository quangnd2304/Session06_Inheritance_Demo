import entity.Student;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.add(3,7);
        st.add(7.8F,8.9F);
        st.display(7,"ABC");
        st.display("DEF",9);
        st.inputData();
        System.out.println(st.toString());
    }
}