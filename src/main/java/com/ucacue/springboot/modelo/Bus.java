package com.ucacue.springboot.modelo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="buslocation")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombus",length= 60,nullable=false)
    private Integer nombus;

    @Column(name = "longitud",length= 60,nullable=false)
    private Float longitud;

    @Column(name = "latitud",length= 60,nullable=false)
    private Float latitud;

    @Column(name = "velobus",length= 60,nullable=false)
    private Float velobus;
    @Column(name = "fecha",length= 60,nullable=false)
    private Date fecha;

    public Bus(){

    }

    public Bus(Integer id, Integer nombus, Float longitud, Float latitud, Float velobus, Date fecha) {
        this.id = id;
        this.nombus = nombus;
        this.longitud = longitud;
        this.latitud = latitud;
        this.velobus = velobus;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNombus() {
        return nombus;
    }

    public void setNombus(Integer nombus) {
        this.nombus = nombus;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public Float getVelobus() {
        return velobus;
    }

    public void setVelobus(Float velobus) {
        this.velobus = velobus;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}



