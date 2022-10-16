/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CinemaCiclo.CinemaCiclo.repository;

import com.CinemaCiclo.CinemaCiclo.model.Message;
import com.CinemaCiclo.CinemaCiclo.repository.crud.MessageCrudRepository;
import java.util.List;
import java.util.Optional;
import org.jboss.logging.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    
    @Autowired
    private MessageCrudRepository messageCrudRepository;
    
    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }
    public Optional<Message> getMessage (int id){
        return messageCrudRepository.findById(id);
    }
    public Message save(Message m){
        return messageCrudRepository.save(m);
    }
    public void delete (Message m){
        messageCrudRepository.delete(m);
    }
}
