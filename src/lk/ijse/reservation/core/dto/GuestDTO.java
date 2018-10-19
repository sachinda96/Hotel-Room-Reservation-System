/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.core.dto;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Sachinda Nipun
 */
public class GuestDTO extends SuperDTO{
     private String id;
    private String FirstName;
    private String LastName;
    private String Gender;
    private String IDType;
    private String IdNumber;
    private String ContactNo;
    private String EMail;

    public GuestDTO() {
    }

    public GuestDTO(String id, String FirstName, String LastName, String Gender, String IDType, String IdNumber, String ContactNo, String EMail) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.IDType = IDType;
        this.IdNumber = IdNumber;
        this.ContactNo = ContactNo;
        this.EMail = EMail;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the IDType
     */
    public String getIDType() {
        return IDType;
    }

    /**
     * @param IDType the IDType to set
     */
    public void setIDType(String IDType) {
        this.IDType = IDType;
    }

    /**
     * @return the IdNumber
     */
    public String getIdNumber() {
        return IdNumber;
    }

    /**
     * @param IdNumber the IdNumber to set
     */
    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

    /**
     * @return the ContactNo
     */
    public String getContactNo() {
        return ContactNo;
    }

    /**
     * @param ContactNo the ContactNo to set
     */
    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    /**
     * @return the EMail
     */
    public String getEMail() {
        return EMail;
    }

    /**
     * @param EMail the EMail to set
     */
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }
   

   
    }
