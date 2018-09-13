package br.com.sotolani.webvagas.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
}
