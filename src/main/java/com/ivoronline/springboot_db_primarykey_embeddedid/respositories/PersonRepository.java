package com.ivoronline.springboot_db_primarykey_embeddedid.respositories;

import com.ivoronline.springboot_db_primarykey_embeddedid.entities.PersonEntity;
import com.ivoronline.springboot_db_primarykey_embeddedid.entities.PersonId;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, PersonId> { }

