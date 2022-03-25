package com.example.Manage.ToaBao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "toabao", path = "toabao")
public interface ToaBaoRepository extends MongoRepository<ToaBao, String> {

    List<ToaBao> findByName(@Param("name") String name);
}
