package br.edu.ifs.seguir.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "AEJCOORDENADA", schema = "DBIFS", catalog = "")
public class AejcoordenadaEntity {
    private int idCoordenada;
    private double latitude;
    private double longitude;
    private double velocidade;
    private double altitude;
    private Date horario;

    @Id
    @Column(name = "idCoordenada")
    public int getIdCoordenada() {
        return idCoordenada;
    }

    public void setIdCoordenada(int idCoordenada) {
        this.idCoordenada = idCoordenada;
    }

    @Basic
    @Column(name = "latitude")
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude")
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "velocidade")
    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Basic
    @Column(name = "altitude")
    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    @Basic
    @Column(name = "horario")
    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AejcoordenadaEntity that = (AejcoordenadaEntity) o;
        return idCoordenada == that.idCoordenada &&
                Double.compare(that.latitude, latitude) == 0 &&
                Double.compare(that.longitude, longitude) == 0 &&
                Double.compare(that.velocidade, velocidade) == 0 &&
                Double.compare(that.altitude, altitude) == 0 &&
                Objects.equals(horario, that.horario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCoordenada, latitude, longitude, velocidade, altitude, horario);
    }
}
