package org.application.enums;

public enum CoursesCategories {
    PROGRAMMING ("Программирование"),
    TESTING ("Тестирование"),
    ANALYTICS("Аналитика");

    private final String name;

    CoursesCategories(String name) {
        this.name = name;
    }
}
