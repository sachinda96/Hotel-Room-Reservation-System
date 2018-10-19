/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.core.dto;

import java.math.BigDecimal;

/**
 *
 * @author Sachinda Nipun
 */
public class MealsDTO extends SuperDTO{
   private String MId;
   private String MealsType;
   private String MealsDescription;
   private BigDecimal price;

    public MealsDTO() {
    }

    public MealsDTO(String MId, String MealsType, String MealsDescription, BigDecimal price) {
        this.MId = MId;
        this.MealsType = MealsType;
        this.MealsDescription = MealsDescription;
        this.price = price;
    }

    /**
     * @return the MId
     */
    public String getMId() {
        return MId;
    }

    /**
     * @param MId the MId to set
     */
    public void setMId(String MId) {
        this.MId = MId;
    }

    /**
     * @return the MealsType
     */
    public String getMealsType() {
        return MealsType;
    }

    /**
     * @param MealsType the MealsType to set
     */
    public void setMealsType(String MealsType) {
        this.MealsType = MealsType;
    }

    /**
     * @return the MealsDescription
     */
    public String getMealsDescription() {
        return MealsDescription;
    }

    /**
     * @param MealsDescription the MealsDescription to set
     */
    public void setMealsDescription(String MealsDescription) {
        this.MealsDescription = MealsDescription;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
   
}
