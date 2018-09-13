package br.com.sotolani.webvagas.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private NivelCategoria nivelCategoria;

    private String descricao;

    private String nome;

    private Empresa empresa;

    private BigDecimal salario;

    private Set<Tags> listaDesejaveis;

    private Set<Tags> listaRequisitos;

}
