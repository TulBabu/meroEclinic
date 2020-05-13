/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meroeclinic.web.public_chat.entity;

import com.meroeclinic.core.entity.MasterEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Babu TUl
 */

@Entity
@Table(name = "tbl_public_chat")
public class PublicChat extends MasterEntity {
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "contact_no")
    private String contactNo;
    @Column(name = "message")
    private String message;

    public PublicChat() {
    }
    
    public PublicChat(int id){
        this.id=id;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNameAndMessage(){
        return fullName + "=> " + message;
    }
    
}
