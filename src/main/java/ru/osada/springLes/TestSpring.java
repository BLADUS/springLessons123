package ru.osada.springLes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vladislav Osada
 * @date 07.05.2023 13:23
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Тут мы сами создаем оружие и сами же его присваеваем его нашеу персонажу*/
        /*Weapon weapon = context.getBean("weaponBean", Weapon.class);
        Character character = new Character(weapon);*/

        Character character = context.getBean("characterBean",Character.class);
        character.launchAttack();
        context.close();
    }
}
