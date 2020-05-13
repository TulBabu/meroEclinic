/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meroeclinic.web.public_chat.controller;

import com.meroeclinic.web.appointment.controller.*;
import com.meroeclinic.core.controller.CRUDController;
import com.meroeclinic.web.appointment.entity.Appointment;
import com.meroeclinic.web.public_chat.entity.PublicChat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/publicChat")
public class PublicChatController extends CRUDController<PublicChat, Integer> {

    public PublicChatController() {
        pageURI = "publicChat";
        pageTitle = "PublicChat";
        viewPath = "test/publicChat";
    }
    
}
