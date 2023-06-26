package com.example.gradeerWeb.gradeerConfig;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeerConfigRepository extends CrudRepository<GradeerConfig, Integer> {
}
