package ru.osada.springLes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vladislav Osada
 * @date 07.05.2023 13:36
 */
public class Character {
    private List<Weapon> weapons = new ArrayList<>();
    private Weapon weapon;
    private String race;
    private int level;

    public Character(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void launchAttack(){
        System.out.println("Персонаж нанес следующую атаку: " + weapon.typeAttack());
    }

    public void fastLaunchAttack(){
        for (Weapon weapon: weapons
             ) {
            System.out.println("Персонаж нанес следующую атаку: " + weapon.typeAttack() );
        }
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public List getWeapons(){
        return weapons;
    }
}
