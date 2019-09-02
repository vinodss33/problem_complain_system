package com.vinodss.es.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinodss.es.models.Problem;
import com.vinodss.es.service.ProblemService;

@RestController
public class ProblemComplainController {
	@Autowired
	ProblemService problemService;

	@PostMapping("/submit-problem")
	public void submitComplainDocument(Problem problemDocument) {
		problemService.saveDocument(problemDocument);

	}
	@PostMapping("/find-problem")
	public List<Problem> getComplainDocument() {
		List<Problem> problems=problemService.findAllProblemDocuments();
		return problems;

	}
}
