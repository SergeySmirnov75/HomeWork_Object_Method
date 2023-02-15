package org.example;

public class PersonService
{
    // Создаем новый класс, чтобы вынести метод isAdult
    public boolean isAdult(Person person)
    {
        // Метод isAdult определяет, взрослый человек или нет
        return person.getAge() > 18;
    }
}