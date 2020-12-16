package de.cosh.azure.model;


import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
//@Table(name="Predio19_evw", schema="sde", catalog="plano" )
@Table(name="PREDIO19", schema="sde", catalog="plano" )
@Immutable
public class GeoPredio19 {
    private static final long serialVersionUID = 1L;

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="OBJECTID")
    private Integer idObjeto;
//
//    @Column(name="IdPredio")
//    private String idPredio;

//    @Column(name="SupPredio")
//    private BigDecimal superficie;

//    @Column(name="SHAPE")
//    private Polygon shape;

//    @Column(name="GDB_GEOMATTR_DATA")
//    private String geoData;
//
//    @Column(name="SDE_STATE_ID")
//    private Integer stateId;
    public GeoPredio19(){
    }

    public Integer getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(Integer idObjeto) {
        this.idObjeto = idObjeto;
    }
}