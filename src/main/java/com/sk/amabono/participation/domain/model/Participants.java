package com.sk.amabono.participation.domain.model;

import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.Data;
 
@Data
@Embeddable
@Builder
public class Participants implements ValueObject {
	
	private String member_id;
	private Boolean isparticipated;
	
	public Participants() {
		
	}
		
	public Participants(String member_id, boolean isparticipated) {
		this.member_id = member_id;
		this.isparticipated = isparticipated;
	}
}

