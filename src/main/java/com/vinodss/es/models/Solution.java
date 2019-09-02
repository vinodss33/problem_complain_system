
package com.vinodss.es.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Solution {

	@JsonProperty("resolutionDuration")
	private String resolutionDuration;
	@JsonProperty("solutionDetails")
	private String solutionDetails;

	@JsonProperty("resolutionDuration")
	public String getResolutionDuration() {
		return resolutionDuration;
	}

	@JsonProperty("resolutionDuration")
	public void setResolutionDuration(String resolutionDuration) {
		this.resolutionDuration = resolutionDuration;
	}

	@JsonProperty("solutionDetails")
	public String getSolutionDetails() {
		return solutionDetails;
	}

	@JsonProperty("solutionDetails")
	public void setSolutionDetails(String solutionDetails) {
		this.solutionDetails = solutionDetails;
	}

}
