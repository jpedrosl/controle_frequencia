package com.senai.backend.controle_frequencia.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "pautas")
public class Pauta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")    
    private Integer id;

    @Column(name = "turma")
    private String turma;

    /*isso de baixo é uma associação entre as entidades Pauta e Usuario, onde uma pauta pode ter muitos usuários associados a ela. A anotação @OneToMany 
indica que há uma relação de um para muitos entre Pauta e Usuario, ou seja, uma pauta pode ter vários usuários associados a ela. A anotação @JoinColumn(name = "id_pauta") 
especifica que a chave estrangeira para essa relação está na tabela de usuários, e o nome da coluna é "id_pauta". Isso significa que cada usuário terá um campo "id_pauta" 
que referencia a pauta à qual ele está associado. A lista de usuários é representada por uma variável do tipo List<Usuario>, que é uma coleção que pode armazenar múltiplos objetos do tipo Usuario.
*/
    @OneToMany // Um para muitos
    @JoinColumn(name = "id_pauta") // Chave estrangeira para a tabela de usuários
    private List<Usuario> usuario;// Lista de usuários associados à pauta, List<> faz parte da biblioteca Collections do Java. ela permite armazenar múltiplos usuários.

    public Pauta() {
    }

    public Pauta(Integer id, String turma, List<Usuario> usuario) {
        this.id = id;
        this.turma = turma;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

    

}
