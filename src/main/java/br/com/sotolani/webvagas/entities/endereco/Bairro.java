package br.com.sotolani.webvagas.entities.endereco;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private Cidade cidade;
}
