package lesson2_constructor.Exercises.bai2_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    private int gio;
    private int phut;
    private int giay;

    public Time(){}
    public Time(int gio){
        this.gio = gio  ;
    }
    public Time(int gio, int phut){
        this.gio = gio;
        this.phut = phut;
    }

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public Time(Time timeNew){
        this.gio = timeNew.gio;
        this.phut = timeNew.phut;
        this.giay = timeNew.giay;
    }

    public void output(){
        LocalTime time = LocalTime.of(this.gio,this.phut,this.giay);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(time.format(formatter));
    }
}
