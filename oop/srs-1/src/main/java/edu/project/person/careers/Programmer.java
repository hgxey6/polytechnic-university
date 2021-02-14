package edu.project.person.careers;

import edu.project.person.Employee;
import edu.project.person.enums.CategoryOfProgrammers;
import edu.project.person.enums.Rank;
/*
* Programmers are the main employees of the company.
* They have rank (junior, middle, senior)
* and developer positions (backend, frontend, system and tester).
* They also write code.
* */
public class Programmer extends Employee {

    private CategoryOfProgrammers category;
    private Rank rank;

    public Programmer() {
    }

    public CategoryOfProgrammers getCategory() {
        return category;
    }

    public void setCategory(CategoryOfProgrammers category) {
        this.category = category;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public void work() {
        System.out.println("Programmer is working");
    }

    public void writeCode() {
        switch (category) {
            case BACKEND -> System.out.println("Programmer writes code in Java");
            case FRONTEND -> System.out.println("Programmer writes code in JS");
            case SYSTEM_DEV -> System.out.println("Programmer writes code in Rust");
            case TESTER -> System.out.println("Programmer writes code in Python");
        }
    }
}
