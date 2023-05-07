package ru.osada.springLes;

/**
 * @author Vladislav Osada
 * @date 07.05.2023 13:21
 */
public class TestBean {
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
