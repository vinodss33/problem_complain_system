
package com.vinodss.es.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserProblem {
	@Id
	@JsonProperty("userName")
	private String userName;
	@JsonProperty("location")
	private String location;
	@JsonProperty("userDetails")
	private UserDetails userDetails;
	@JsonProperty("problems")
	private List<Problem> problems = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("userName")
	public String getUserName() {
		return userName;
	}

	@JsonProperty("userName")
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonProperty("location")
	public String getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	@JsonProperty("userDetails")
	public UserDetails getUserDetails() {
		return userDetails;
	}

	@JsonProperty("userDetails")
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	@JsonProperty("problems")
	public List<Problem> getProblems() {
		return problems;
	}

	@JsonProperty("problems")
	public void setProblems(List<Problem> problems) {
		this.problems = problems;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
