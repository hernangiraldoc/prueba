/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CinemaCiclo.CinemaCiclo.repository;

import com.CinemaCiclo.CinemaCiclo.model.Cinema;
import com.CinemaCiclo.CinemaCiclo.repository.crud.CinemaCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaRepository {
    
    @Autowired
    private CinemaCrudRepository cinemaCrudRepository;
    
    public List<Cinema> getAll(){
        return (List<Cinema>) cinemaCrudRepository.findAll();
    }
    public Optional<Cinema> getCinema(int id){
        return cinemaCrudRepository.findById(id);
    }
    
    public Cinema save(Cinema c){
        return cinemaCrudRepository.save(c);
    }
    
    public void delete(Cinema c){
        cinemaCrudRepository.delete(c);
    }
}
