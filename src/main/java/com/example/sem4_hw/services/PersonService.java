package com.example.sem4_hw.services;

import com.example.sem4_hw.domain.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    List<Person> persons = new ArrayList<>();

    /**
     * Добавление участника
     * @param person
     */
    public void addPerson(Person person){
        persons.add(person);
    }

    /**
     * Получение списка всех участников
     * @return
     */
    public List<Person> getAllPersons() {
        return persons;
    }
}
