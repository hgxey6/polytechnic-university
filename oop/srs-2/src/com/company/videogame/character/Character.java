package com.company.videogame.character;

import com.company.videogame.behavior.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weapon;

    public Character() {
    }

    public abstract void fight();
    public abstract void display();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
