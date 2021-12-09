package com.cherevataya;
/*
1) В Дз11 был метод который возвращает 100 случайных людей.
Написать метод который который удалит из этого списка добликаты по имени и фамилии.
Т.е. останутся только люди с уникальной комбинайцией имя+фамилия. Остальные поля в расчет не берутся.
 */

import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Person> people = NewPerson.generatePersons();
        for (Person person : people) {
            System.out.println(person);

        }
    }

}