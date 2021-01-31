package com.rd.projetointegrador.rdservicesapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="TB_TIPO_RECEITA")
@Data
public class TipoReceitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_TIPO_RECEITA")
    private BigInteger idTipoReceita;

    @Column(name="DS_TIPO_RECEITA")
    private String dsTipoReceita;

}