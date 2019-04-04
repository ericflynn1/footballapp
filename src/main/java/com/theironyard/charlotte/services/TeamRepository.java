package com.theironyard.charlotte.services;

import com.theironyard.charlotte.entities.TeamIdentifier;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<TeamIdentifier, Integer> {
    TeamIdentifier findFirstByNameIgnoreCase(String teamName);
    TeamIdentifier findByAbbreviation(String abrv);
}
