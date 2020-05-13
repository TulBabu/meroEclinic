/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meroeclinic.web.publicChat.repository;

import com.meroeclinic.web.appointment.entity.Appointment;
import com.meroeclinic.web.public_chat.entity.PublicChat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Babu TUl
 */
@Repository
public interface PublicChatRepository extends
        JpaRepository<PublicChat, Integer> {

}
