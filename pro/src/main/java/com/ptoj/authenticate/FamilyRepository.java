package com.ptoj.authenticate;

import org.hibernate.type.descriptor.sql.JdbcTypeFamilyInformation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FamilyRepository extends MongoRepository<Family, String> {
}
