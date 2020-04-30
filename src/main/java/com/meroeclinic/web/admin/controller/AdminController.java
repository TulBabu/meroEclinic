/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meroeclinic.web.admin.controller;

import com.meroeclinic.core.controller.CRUDController;
import com.meroeclinic.web.appointment.entity.Appointment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController extends CRUDController<Appointment, Integer> {

    public AdminController() {
        pageURI = "appointment";
        pageTitle = "Appointment";
        viewPath = "test/admin";
    }
    
}
