package com.sk.amabono.participation.domain.model;

import java.util.List;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Participation extends AbstractEntity implements AggregateRoot {
	
	

	private String bono_id;
	
	private int requestcount;
	private int requestcountlimit;
	private String participants;
	
	private boolean isclosed;

	
	
	public Participation() {
		
	}
	
	public Participation( String bono_id, String participants, boolean isclosed, int requestcount, int requestcountlimit) {
		this.bono_id=bono_id;
		this.participants=participants;
		this.isclosed =isclosed;
		this.requestcount = requestcount;
		this.requestcountlimit = requestcountlimit;
			
	}
	
	
}
 
