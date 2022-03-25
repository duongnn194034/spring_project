package com.example.Manage;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "nhabao", path = "nhabao")
public interface NhaBaoRepository extends MongoRepository<NhaBao, String> {

    List<NhaBao> findByName(@Param("name") String name);

}