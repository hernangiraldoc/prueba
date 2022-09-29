/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CinemaCiclo.CinemaCiclo.service;

import com.CinemaCiclo.CinemaCiclo.model.Admin;
import com.CinemaCiclo.CinemaCiclo.repository.AdminRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    
    @Autowired
    private AdminRepository adminRepository;
    
    public List<Admin> getAll(){
        return (List<Admin>) adminRepository.getAll();
    }
    public Optional<Admin> getAdmin (int id){
        return adminRepository.getAdmin(id);
    }
    public Admin save (Admin a){
        if(a.getIdAdmin()==null){
            return adminRepository.save(a);
        }else{
            Optional<Admin> aaux= adminRepository.getAdmin(a.getIdAdmin());
            if (aaux.isEmpty()){
                return adminRepository.save(a);
            }else{
                return (a);
            }
        }
    }
}
