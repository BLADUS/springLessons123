package ru.osada.springLes;

/**
 * @author Vladislav Osada
 * @date 07.05.2023 13:40
 */
public class FireBall implements Weapon{
    @Override
    public String typeAttack() {
        return "Урон магией 20.ед" + "Постепенный урон 5.eд".repeat(3);
    }
}
