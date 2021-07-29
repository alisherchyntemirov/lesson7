package com.company;
public class Medic extends Hero {

    @Override
    public void applySuperAbility(String superAbilityType) {
        setSuperAbility("Medic treats");
        System.out.println(getSuperAbility());
    }
}
