package com.vinodss.es.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

import com.vinodss.es.models.Problem;
@Repository
public interface ComplainRepository extends ElasticsearchCrudRepository<Problem, String> {
	

}
