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

        Character character1 = context.getBean("characterBean",Character.class);
        Character character2 = context.getBean("characterBean",Character.class);

        boolean point = character1==character2;
        System.out.println(character1);
        System.out.println(character2);
        System.out.println(point);

        System.out.println(character2.getLevel());
        character1.setLevel(5);
        System.out.println(character2.getLevel());

        context.close();
    }
}
