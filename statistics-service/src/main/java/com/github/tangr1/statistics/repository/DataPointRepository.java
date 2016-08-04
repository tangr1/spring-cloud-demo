package com.github.tangr1.statistics.repository;

import com.github.tangr1.statistics.domain.timeseries.DataPointId;
import com.github.tangr1.statistics.domain.timeseries.DataPoint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataPointRepository extends CrudRepository<DataPoint, DataPointId> {

	List<DataPoint> findByIdAccount(String account);

}
