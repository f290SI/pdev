package br.com.fatecararars.pdev.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //TODO: criar os atributos nome, login, senha, email

    /**
     * Relacionamento N:M, tabela de relacionamento de usuarios e roles
     * 
     */
    
    //TODO: criar relacionamento muito para muitos com List<Role>
}
