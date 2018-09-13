package br.com.sotolani.webvagas.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table
public class NivelCategoria {

    private Categoria categoria;

    private String nivel;

    private int posicao;

}
