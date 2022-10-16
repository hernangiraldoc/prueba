/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CinemaCiclo.CinemaCiclo.repository;

import com.CinemaCiclo.CinemaCiclo.model.Client;
import com.CinemaCiclo.CinemaCiclo.model.ClientReport;
import com.CinemaCiclo.CinemaCiclo.model.Reservation;
import com.CinemaCiclo.CinemaCiclo.repository.crud.ReservationCrudRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.ResponseEntity.status;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepository {
    
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;
    
    public List<Reservation> getAll(){
        return (List<Reservation>)reservationCrudRepository.findAll();
    }
    public Optional<Reservation> getReservation (int id){
        return reservationCrudRepository.findById(id);
    }
    public Reservation save(Reservation r){
        return reservationCrudRepository.save(r);
    }
    public void delete (Reservation r){
        reservationCrudRepository.delete(r);
    }
    
    public List<Reservation> getReservationByStatus(String status){
        return reservationCrudRepository.findAllByStatus(status);
    }
    
    public List<Reservation> getReservationPeriod(Date dateOne,Date dateTwo){
        return reservationCrudRepository.findAllByStartDateAfterAndStartDateBefore(dateOne, dateTwo);
    }
    
    public List<ClientReport> getTopClients(){
        List<ClientReport>response=new ArrayList<>();
        List<Object[]> report= reservationCrudRepository.countTotalReservationByClient();
        for (int i=0; i<report.size(); i++){
            response.add(new ClientReport((Long)report.get(i)[1], (Client) report.get(i)[0]));
        } return response;
    }
    
}
