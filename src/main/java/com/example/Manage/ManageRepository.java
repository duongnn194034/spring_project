package com.example.Manage;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface ManageRepository extends MongoRepository<NhanVienHanhChinh, String> {

    List<NhanVienHanhChinh> findByName(@Param("name") String name);

}
