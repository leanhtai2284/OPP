package lesson2_constructor.Exercises.bai3_student;

public class Stu {
    private String id;
    private String name;
    private double score;

    public Stu(String id, String name, double score) {
        this.id = id;
        this.setName(name);
        this.setScore(score);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }else {
            System.out.println("Loi ten khong duoc de trong");
        }

    }
    public double getScore(){
        return this.score;
    }
    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Loi diem");
        }
    }

    public void output(){
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Score: " + this.score);

    }
}
