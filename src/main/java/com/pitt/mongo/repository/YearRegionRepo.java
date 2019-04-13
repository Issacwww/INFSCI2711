
package com.pitt.mongo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.YearRegion;

public interface YearRegionRepo extends MongoRepository<YearRegion, InnerId> {

}