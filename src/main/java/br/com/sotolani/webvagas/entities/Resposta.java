package br.com.sotolani.webvagas.entities;

import javax.persistence.*;

@Entity
@Table
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String descricao;

    private boolean verdadeira;

    private double peso;

}
