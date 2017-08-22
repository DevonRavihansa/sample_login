package com.digispike.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Devon Ravihansa on 8/22/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
