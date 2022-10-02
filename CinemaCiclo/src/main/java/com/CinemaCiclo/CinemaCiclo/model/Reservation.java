/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CinemaCiclo.CinemaCiclo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import static org.hibernate.engine.internal.Cascade.cascade;
        

@Entity
@Table(name="Reserves")
public class Reservation implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;

    
    @OneToOne
    @JoinColumn(name = "score")
    private Score score;
    
    public Reservation() {
    }

    
    public Reservation(Integer idReservation, Date startDate, Date devolutionDate) {
        this.idReservation = idReservation;
        this.startDate = startDate;
        this.devolutionDate = devolutionDate;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
    
    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    
    
    
}
