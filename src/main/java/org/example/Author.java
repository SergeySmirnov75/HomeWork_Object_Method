package org.example;

public class Author
{
    String name;
    int age;

    public String toString()
    {
        // Добавляем метод toString()
        return "Имя Автора " + this.name + " Возраст Автора" + this.age;
        // Возвращаем строку в метод Main
    }
}
