package com.company.videogame.character;

import com.company.videogame.behavior.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        this.weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }

    @Override
    public void display() {
        System.out.println("Рыцарь");
    }
}
