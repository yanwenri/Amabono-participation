package com.sk.amabono.participation.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.sk.amabono.participation.domain.model.AbstractEntity;
import com.sk.amabono.participation.domain.model.AggregateRoot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Participation extends AbstractEntity implements AggregateRoot {
	
}

