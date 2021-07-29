package com.company;
public class Magic extends Hero{

    @Override
    public void applySuperAbility(String superAbilityType) {
        setSuperAbility("Magical attack");
        System.out.println(getSuperAbility());
    }
}

