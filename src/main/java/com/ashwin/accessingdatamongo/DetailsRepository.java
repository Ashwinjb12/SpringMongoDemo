package com.ashwin.accessingdatamongo;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DetailsRepository extends MongoRepository<Details, String> {
	public List<Details> findByName(String name);

}