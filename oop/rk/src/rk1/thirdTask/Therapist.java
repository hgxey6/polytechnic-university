package rk1.thirdTask;

import rk1.secondTask.Specialist;

public class Therapist extends Specialist {
    @Override
    public void work() {
        System.out.println("Терапевт работает");
    }

    @Override
    public void toGoOnHoliday() {
        System.out.println("Терапевт ушел в отпуск");
    }
}
