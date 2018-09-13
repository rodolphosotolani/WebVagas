package br.com.sotolani.webvagas.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumTipoEscolaridade {

    ANALFABETO(1, "Analfabeto"),
    SEMI_ANALFABETO(2, "Semi-Analfabeto"),
    FUNDAMENTAL_INCOMPLETO(3, "Ensino Fundamental Incompleto"),
    FUNDAMENTAL(4, "Ensino Fundamental Completo"),
    MEDIO_INCOMPLETO(5, "Ensino Médio Incompleto"),
    MEDIO(6, "Ensino Médio Completo"),
    SUPERIOR_INCOMPLETO(7, "Ensino Superior Incompleto"),
    SUPERIOR(8, "Ensino Superior Completo"),
    POS_GRADUACAO(9, "Pós Graduação"),
    MEESTRADO(10, "Mestrado"),
    DOUTORADO(11, "Doutorado");

    private int id;
    private String descricao;

}
