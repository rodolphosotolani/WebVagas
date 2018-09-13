package br.com.sotolani.webvagas.entities.endereco;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class Rua {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private List<String> listaCep;

    private Bairro bairro;
}
