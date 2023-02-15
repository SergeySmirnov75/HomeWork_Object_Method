package org.example;

public class Book
{
    String name;
    int age;
    Author author;

    public String toString()
    {
        // Добавляем метод toString()
        return "Название Книги " + this.name + " Возраст книги " + this.age + " Автор " + this.author;
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

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
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
