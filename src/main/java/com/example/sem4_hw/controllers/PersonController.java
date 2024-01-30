package com.example.sem4_hw.controllers;

import com.example.sem4_hw.domain.Person;
import com.example.sem4_hw.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }


    /**
     * Получаем всех участников
     *
     * @param model
     * @return
     */
    @GetMapping("/participants")
    public String getPersons(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        return "participants";
    }

    /**
     * Добавление участника
     *
     * @param person
     * @param model
     * @return
     */
    @PostMapping("/participants")
    public String addPerson(Person person, Model model) {
        personService.addPerson(person);
        model.addAttribute("persons", personService.getAllPersons());
        return "participants";
    }

}
