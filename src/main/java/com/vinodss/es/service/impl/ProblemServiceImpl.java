package com.vinodss.es.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinodss.es.models.Problem;
import com.vinodss.es.repository.ComplainRepository;
import com.vinodss.es.service.ProblemService;
@Service
public class ProblemServiceImpl implements ProblemService {
	@Autowired
	ComplainRepository complainRepository;

	@Override
	public void saveDocument(Problem problemDocument) {
		//TODO: generate ID
		complainRepository.save(problemDocument);
	}

	@Override
	public List<Problem> findAllProblemDocuments() {
		Iterable<Problem> iterable = complainRepository.findAll();
		List<Problem> target = new ArrayList<>();
		iterable.forEach(target::add);
		return target;
	}

}
