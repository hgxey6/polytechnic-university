package com.company.videogame;

import com.company.videogame.behavior.BowBehavior;
import com.company.videogame.character.Knight;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight(); // удар
        knight.display();
        knight.fight();
        knight.setWeapon(new BowBehavior());
        knight.fight();
    }
}
