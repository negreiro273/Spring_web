package com.sigcart.sigcart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigcart.sigcart.entities.Games;

public interface GameRepository extends JpaRepository<Games, Long> {
}
