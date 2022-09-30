/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CinemaCiclo.CinemaCiclo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cinemas")

public class Cinema implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    @Column(name = "nombre",length = 45,nullable = false)
    private String name;
    @Column(name = "propietario",length = 45,nullable = false)
    private String owner;
    private Integer capacity;
    @Column(name = "descripcion",length = 250,nullable = false)
    private String description;
    private Integer category;

    //Interacciones:
    
    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties("cinemas")
    private Client client;
    
    
    public Cinema() {
    }

    public Cinema(Integer id, String name, String owner, Integer capacity, String description, Integer category) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.capacity = capacity;
        this.description = description;
        this.category = category;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

   