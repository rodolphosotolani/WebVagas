package br.com.sotolani.webvagas.entities.endereco;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Max(100)
    private String nome;

    @Max(3)
    private String sigla;

    @NotNull
    private Estado estado;
}
