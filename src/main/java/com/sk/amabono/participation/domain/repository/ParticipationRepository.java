package com.sk.amabono.participation.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.amabono.participation.domain.model.Participation;

@RepositoryRestResource
public interface ParticipationRepository extends PagingAndSortingRepository<Participation, Long> {

}
