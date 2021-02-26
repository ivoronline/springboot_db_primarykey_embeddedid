package com.ivoronline.springboot_db_primarykey_embeddedid.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PersonId implements Serializable {

  //COMPOSITE PRIMARY KEY
  private String name;
  private Integer age;

  //REQUIERED NO ARGS CONSTRUCTOR
  public PersonId() {}

  //CONSTRUCTOR FOR findById(BookId)
  public PersonId(String name, Integer age) {
    this.name = name;
    this.age  = age;
  }

}
