package com.vinodss.es.service;

import java.util.List;

import com.vinodss.es.models.Problem;

public interface ProblemService {

	void saveDocument(Problem problemDocument);

	List<Problem> findAllProblemDocuments();

}
