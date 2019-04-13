
package com.pitt.mongo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthRegionTarget;

public interface MonthRegionTargetRepo extends MongoRepository<MonthRegionTarget, InnerId> {

}