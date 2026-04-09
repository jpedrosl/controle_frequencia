//comente a logica do codigo para fins de estudo
// a pasta models é onde ficam as classes que representam as entidades do sistema
package com.senai.backend.controle_frequencia.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "usuarios") // Anotação para mapear a classe para a tabela "usuarios" no banco de dados
@Entity // Anotação para indicar que esta classe é uma entidade JPA
public class Usuario {

    @Id // Anotação para indicar que este campo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Anotação para gerar o valor da chave primária automaticamente(serial)
    
    @Column(name = "id") // Anotação para mapear o campo "id" para a coluna "id" na tabela do banco de dados
    private Integer id;

    @Column(name = "nome") // Anotação para mapear o campo "nome" para a coluna "nome" na tabela do banco de dados
    private String nome;

    @Column(name = "data_nascimento") // Anotação para mapear o campo "dataNascimento" para a coluna "data_nascimento" na tabela do banco de dados
    private LocalDate dataNascimento;

    // Construtor padrão
    public Usuario() {
    }


    // Construtor com parâmetros
    //clique com o botao direito do mouse selecione source action e selecione "Generate" -> "Constructor"
    public Usuario(Integer id, String nome, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters, serve para acessar e modificar os atributos da classe
    //getter serve para obter o valor de um atributo
    //setter serve para modificar o valor de um atributo
    //clique com o botao direito do mouse selecione source action e selecione "Generate" -> "getter e setter"

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    

    

    

}
