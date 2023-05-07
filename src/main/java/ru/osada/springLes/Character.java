package ru.osada.springLes;

/**
 * @author Vladislav Osada
 * @date 07.05.2023 13:36
 */
public class Character {
    private Weapon weapon;

    public Character(Weapon weapon) {
        this.weapon = weapon;
    }

    public void launchAttack(){
        System.out.println("Персонаж нанес следующую атаку: " + weapon.typeAttack());
    }
}
