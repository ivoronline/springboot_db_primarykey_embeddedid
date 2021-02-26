package com.ivoronline.springboot_db_primarykey_embeddedid.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class PersonEntity {

  //COMPOSITE PRIMARY KEY
  @EmbeddedId
  public PersonId personId;

  //OTHER PROPERTIES
  public String book;

}
