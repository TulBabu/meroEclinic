/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meroeclinic.web.home.controller;

import com.meroeclinic.core.controller.SiteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/")
public class HomeController extends SiteController{

    public HomeController() {
    pageTitle="meroEclinic";
    }
    @GetMapping
    public String index(){
        return "home/index";
    }
    @GetMapping(value = "/contact")
    public String contact(){
        return "contact_form/index";
    }
    @GetMapping(value = "/enquiry")
    public String enquiry(){
        return "enquiry_form/index";
    }
    @GetMapping(value = "/gallery")
    public String gallery(){
        return "gallery/index";
    }
    
}
