package com.company;
public class Warrior extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        setSuperAbility("Warrior attacks");
        System.out.println(getSuperAbility());
    }
}
