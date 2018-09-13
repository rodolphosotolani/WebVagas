package br.com.sotolani.webvagas.entities.endereco;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private int numero;

    private String complemento;

    private String quadraLote;

    private Rua rua;

}
