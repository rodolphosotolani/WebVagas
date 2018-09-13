package br.com.sotolani.webvagas.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CANDIDATO_VAGA")
public class CandidatoVaga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Candidato candidato;

    private Vaga vaga;

    private boolean aprovado;

    private double notaProva;

    private Prova prova;

}
