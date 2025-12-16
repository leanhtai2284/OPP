package lesson2_constructor.Practice.student;

public class Student_management {
    private String name;
    private int age;
    private String hobby;

//    public Student_management(String name, int age, String hobby) {
//        this.name = name;
//        this.age = age;
//        this.hobby = hobby;
//    }

    public Student_management(){
        age = 18;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void output(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("So thich: " + hobby);
    }

}
