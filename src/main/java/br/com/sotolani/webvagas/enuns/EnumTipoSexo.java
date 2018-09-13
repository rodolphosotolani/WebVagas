package br.com.sotolani.webvagas.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumTipoSexo {

    MASCULINO('M', "MASCULINO"),
    FEMININO('F', "FEMININO");

    private final char id;
    private final String descricao;

}
