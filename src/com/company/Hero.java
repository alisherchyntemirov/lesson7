package com.company;
public abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbility;

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
    //  public static Hero[Magic,Medic,Warrior]{
//
//    }

}

