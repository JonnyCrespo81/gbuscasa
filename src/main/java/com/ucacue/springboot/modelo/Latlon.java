package com.ucacue.springboot.modelo;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="LatLon")
public class Latlon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double Lat;
    private double Lon;

    private Date fecha;

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLon() {
        return Lon;
    }

    public void setLon(double lon) {
        Lon = lon;
    }

    public Date getFecha() { return fecha; }

    public void setFecha(Date fecha) { this.fecha = fecha; }
}
