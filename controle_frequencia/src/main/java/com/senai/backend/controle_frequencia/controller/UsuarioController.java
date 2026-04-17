//as pasta controller serve para organizar as classes que recebem as requisições HTTP
//aqui ficam as classes que implementam as regras de negócio da aplicação
// ela chama a pasta services
package com.senai.backend.controle_frequencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.controle_frequencia.models.Usuario;
import com.senai.backend.controle_frequencia.services.UsuarioServices;
import org.springframework.web.bind.annotation.PutMapping;


@RestController// <--- Aqui é onde as requisições HTTP são recebidas
@RequestMapping("/usuario")//<--- Aqui é onde a URL base para as requisições é definida
public class UsuarioController {

    @Autowired
    private UsuarioServices usuarioService; //o primeiro UsuarioServices referencia o Servic

    //GetMapping serve para contar usuários
    @GetMapping("/contar-usuarios")//<--- Aqui é onde a requisição para contar usuários é definida
    public Long contarUsuarios() {//<--- Aqui é onde a lógica para contar usuários é implementada
        return usuarioService.contarUsuarios();//<--- Aqui é onde o serviço de contagem de usuários é chamado
    }

    @GetMapping("/buscar-usuario/{id}")//<--- Aqui é onde a requisição para buscar um usuário é definida
    public Usuario buscarUsuario(@PathVariable Integer id){//<--- Aqui é onde a lógica para buscar um usuário é implementada
        return usuarioService.buscarUsuario(id);
    }

    @GetMapping("/listar-usuarios")//<--- Aqui é onde a requisição para listar usuários é definida
    public List<Usuario> listarUsuarios(){//<--- Aqui é onde a lógica para listar usuários é implementada
        return usuarioService.listarUsuarios();
    }

    @DeleteMapping("/deletar-usuario/{id}")//<--- Aqui é onde a requisição para deletar um usuário é definida
    public String deleteUsuario(@PathVariable Integer id){ //voce coloca aqui oque voce quer retornar
        if (usuarioService.deletarUsuario(id)) {//<--- Aqui é onde a lógica para deletar um usuário é implementada
            return "Usuário deletado com sucesso!"; //<--- Aqui é onde a resposta de sucesso é retornada
        }
        return "Erro ao deletar usuário.";

    }

    @PostMapping("/salvar-usuario")//<--- Aqui é onde a requisição para salvar um usuário é definida
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario){//<--- Aqui é onde a lógica para cadastrar um usuário é implementada
        return usuarioService.cadastrarUsuario(usuario);
    }

//@PutMapping serve para atualizar um usuário
    @PutMapping("/atualizar-usuario/{id}")//<--- Aqui é onde a requisição para atualizar um usuário é definida
    public String atualizarUsuario(@PathVariable Integer id, @RequestBody Usuario usuario){//<--- Aqui é onde a lógica para atualizar um usuário é implementada
        if(usuarioService.atualizarUsuario(id, usuario)!= null){//<--- Aqui é onde a lógica para verificar se a atualização foi bem-sucedida é implementada. 
            return "usuario atualizado com sucesso";
        }
        return "falha ao atualizar o usuario";
    }




}










