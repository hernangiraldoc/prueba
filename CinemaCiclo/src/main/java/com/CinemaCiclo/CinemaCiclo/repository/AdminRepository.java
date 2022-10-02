/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CinemaCiclo.CinemaCiclo.repository;

import com.CinemaCiclo.CinemaCiclo.model.Admin;
import com.CinemaCiclo.CinemaCiclo.repository.crud.AdminCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepository {
    
    @Autowired
    private AdminCrudRepository adminCrudRepository;
    
    public List<Admin> getAll(){
        return (List<Admin>)adminCrudRepository.findAll();
    }
    public Optional<Admin> getAdmin (int id){
        return adminCrudRepository.findById(id);
    }
    public Admin save (Admin a){
        return adminCrudRepository.save(a);
    }
    
    public void delete(Admin a){
        adminCrudRepository.delete(a);
    }
}
