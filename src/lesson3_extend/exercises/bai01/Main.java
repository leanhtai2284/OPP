package lesson3_extend.exercises.bai01;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("1","tai",9);
        Student stu2 = new Student("2","leai",8);
        Student stu3 = new Student("3","anhai",7);

        System.out.println("Dem so luong SV: " + Student.dem());
    }

}
