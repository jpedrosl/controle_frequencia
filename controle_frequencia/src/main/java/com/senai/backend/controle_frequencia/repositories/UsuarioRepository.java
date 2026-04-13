//a pasta repository é responsável por gerenciar a persistência dos dados de usuários
// Ela contém interfaces que estendem JpaRepository para fornecer operações CRUD


package com.senai.backend.controle_frequencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.controle_frequencia.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> { // Interface para acesso a dados de usuários


}
