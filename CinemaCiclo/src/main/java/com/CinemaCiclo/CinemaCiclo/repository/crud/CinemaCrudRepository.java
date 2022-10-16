/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CinemaCiclo.CinemaCiclo.repository.crud;

//public interface CinemaCrudRepository extends JpaRepository<Cinema, Integer>
import com.CinemaCiclo.CinemaCiclo.model.Cinema;
import org.springframework.data.repository.CrudRepository;

public interface CinemaCrudRepository extends CrudRepository<Cinema, Integer> {

}
