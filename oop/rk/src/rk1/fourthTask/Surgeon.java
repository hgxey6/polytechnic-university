package rk1.fourthTask;

import rk1.thirdTask.Therapist;

public class Surgeon extends Therapist {

    public void cut() {
        System.out.println("хирург режет");
    }

    public void operate() {
        System.out.println("Хирург оперирует");
    }

    public void sew() {
        System.out.println("Хирург шьет порез");
    }
}
