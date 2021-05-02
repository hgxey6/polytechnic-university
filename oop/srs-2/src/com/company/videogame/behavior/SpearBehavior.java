package com.company.videogame.behavior;

public class SpearBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("удар копьем");
    }
}
