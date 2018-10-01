package com.mongomonguito.xmens.repository;

import com.mongomonguito.xmens.documents.Xmen;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface XmenRepo extends MongoRepository<Xmen,Integer> {

}
