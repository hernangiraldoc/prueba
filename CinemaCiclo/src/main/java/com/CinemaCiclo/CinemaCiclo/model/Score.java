/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CinemaCiclo.CinemaCiclo.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Scores")

public class Score implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Integer idScore;
    @Column(name="puntaje",scale = 5,nullable = false)
    private Integer score;

    
    @OneToOne (cascade = {CascadeType.PERSIST},mappedBy="score")
    @JoinColumn(name="scoreId")
    private Reservation scoreReservation;
            
    public Score() {
    }

    public Score(Integer idScore, Integer score) {
        this.idScore = idScore;
        this.score = score;
    }

    public Reservation getScoreReservation() {
        return scoreReservation;
    }

    public void setScoreReservation(Reservation scoreReservation) {
        this.scoreReservation = scoreReservation;
    }

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    
}
