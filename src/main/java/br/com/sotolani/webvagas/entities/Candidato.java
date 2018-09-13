package br.com.sotolani.webvagas.entities;

import br.com.sotolani.webvagas.entities.endereco.Endereco;
import br.com.sotolani.webvagas.enuns.EnumTipoEscolaridade;
import br.com.sotolani.webvagas.enuns.EnumTipoSexo;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "TB_CANDIDATO")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Max(150)
    private String nome;

    private Date dataNascimento;

    private EnumTipoEscolaridade tipoEscolaridade;

    private EnumTipoSexo tipoSexo;

    private Curriculo curriculo;

    private Endereco endereco;

}
