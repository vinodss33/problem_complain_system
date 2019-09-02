
package com.vinodss.es.models;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "subCategory",
    "description",
    "otherSpecification",
    "solutions"
})
@Document(indexName = "problem_complain_index", type = "problem")
public class Problem {
	@JsonProperty("id")
	private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("subCategory")
    private String subCategory;
    @JsonProperty("description")
    private String description;
    @JsonProperty("otherSpecification")
    private String otherSpecification;
    @JsonProperty("solutions")
    private List<Solution> solutions = null;
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("subCategory")
    public String getSubCategory() {
        return subCategory;
    }

    @JsonProperty("subCategory")
    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("otherSpecification")
    public String getOtherSpecification() {
        return otherSpecification;
    }

    @JsonProperty("otherSpecification")
    public void setOtherSpecification(String otherSpecification) {
        this.otherSpecification = otherSpecification;
    }

    @JsonProperty("solutions")
    public List<Solution> getSolutions() {
        return solutions;
    }

    @JsonProperty("solutions")
    public void setSolutions(List<Solution> solutions) {
        this.solutions = solutions;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
