package br.com.sotolani.webvagas.entities.endereco;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private String sigla;

    private List<Estado> listEstados;

}
