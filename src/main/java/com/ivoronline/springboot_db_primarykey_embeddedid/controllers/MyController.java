package com.ivoronline.springboot_db_primarykey_embeddedid.controllers;

import com.ivoronline.springboot_db_primarykey_embeddedid.entities.PersonEntity;
import com.ivoronline.springboot_db_primarykey_embeddedid.entities.PersonId;
import com.ivoronline.springboot_db_primarykey_embeddedid.respositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @Autowired PersonRepository personRepository;

  //===================================================================
  // ADD BOOKS
  //===================================================================
  @ResponseBody
  @RequestMapping("/AddPersons")
  public String addPersons() {

    //CREATE BOOK1
    PersonEntity personEntity1          = new PersonEntity();
                 personEntity1.personId = new PersonId("John", 20);
                 personEntity1.book     = "Book about dogs";

    //CREATE BOOK2
    PersonEntity personEntity2          = new PersonEntity();
                 personEntity1.personId = new PersonId("John", 50);
                 personEntity2.book     = "Book about cats";

    //STORE BOOKS
    personRepository.save(personEntity1);
    personRepository.save(personEntity2);

    //RETURN SOMETHING TO BROWSER
    return "Persons added to DB";

  }

  //===================================================================
  // GET BOOK
  //===================================================================
  @ResponseBody
  @RequestMapping("/GetPerson")
  public PersonEntity getPerson() {
    PersonEntity personEntity = personRepository.findById(new PersonId("John", 20)).get();
    return personEntity;
  }

}
