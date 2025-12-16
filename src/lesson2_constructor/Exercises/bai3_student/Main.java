package lesson2_constructor.Exercises.bai3_student;

public class Main {
    public static void main(String[] args) {
      Stu student = new Stu("1", "Tai",7.5);
//      student.setID("1");
      student.setScore(11);
      System.out.println("ID hien tai:" + student.getId());
//      student.setName();
        student.setScore(7.8);

      student.output();
    }
}
