/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CinemaCiclo.CinemaCiclo.repository.crud;

import com.CinemaCiclo.CinemaCiclo.model.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer>{
    
}
