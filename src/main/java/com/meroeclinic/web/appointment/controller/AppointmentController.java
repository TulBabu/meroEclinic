/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meroeclinic.web.appointment.controller;

import com.meroeclinic.core.controller.CRUDController;
import com.meroeclinic.web.appointment.entity.Appointment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/appointment")
public class AppointmentController extends CRUDController<Appointment, Integer> {

    public AppointmentController() {
        pageURI = "appointment";
        pageTitle = "Appointment";
        viewPath = "test/enquiry_form";
    }
    
}
