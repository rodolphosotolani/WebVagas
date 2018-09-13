package br.com.sotolani.webvagas.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table
public class Prova {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private List<Questao> listaQuestoes;

    private CandidatoVaga candidatoVaga;

    private LocalDateTime dataInicio;

    private LocalDateTime dataTermino;

    private long duracao;
}
