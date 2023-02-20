package org.example;

public class Author
{
    private String name;
    private int age;

    public String toString()
    {
        // Добавляем метод toString()
        return "Имя Автора " + this.name + " Возраст Автора" + this.age;
        // Возвращаем строку в метод Main
    }
    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }
    public boolean nameEquals(String name)
    {
        return name.equals(this.name);
    }

    public int hashCode()
    {
        return java.util.Objects.hash(name);
    }
}
