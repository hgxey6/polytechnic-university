package com.company.videogame.behavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("удар мечом ");
    }
}
