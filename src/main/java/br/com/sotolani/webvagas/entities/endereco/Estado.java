package br.com.sotolani.webvagas.entities.endereco;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table
public class Estado {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Min(2)
    @Max(2)
    private String sigla;

    @NotNull
    @Max(100)
    private String nome;

    @NotNull
    private Pais pais;

    private List<Cidade> listCidades;

}
