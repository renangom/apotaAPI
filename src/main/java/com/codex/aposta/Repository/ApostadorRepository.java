package com.codex.aposta.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codex.aposta.model.Apostador;

@Repository
public interface ApostadorRepository extends JpaRepository<Apostador, Long> {

}
