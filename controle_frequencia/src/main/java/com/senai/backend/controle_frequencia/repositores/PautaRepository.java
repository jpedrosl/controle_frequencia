package com.senai.backend.controle_frequencia.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.controle_frequencia.models.Pauta;

@Repository // Repository serve para encapsular a lógica de acesso a dados
public interface PautaRepository extends JpaRepository<Pauta, Integer> { // Interface para acesso a dados de pautas

}
