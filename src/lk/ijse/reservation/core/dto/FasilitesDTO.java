/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.core.dto;

/**
 *
 * @author Sachinda Nipun
 */
public class FasilitesDTO extends SuperDTO{
     private String id;
    private String name;
    private String fasilites;
    private String Price;
    public FasilitesDTO() {
    }

    public FasilitesDTO(String id, String name, String fasilites,String price) {
        this.id = id;
        this.name = name;
        this.fasilites=fasilites;
        this.Price = price;

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the fasilites
     */
    public String getFasilites() {
        return fasilites;
    }

    /**
     * @param fasilites the fasilites to set
     */
    public void setFasilites(String fasilites) {
        this.fasilites = fasilites;
    }

    /**
     * @return the Price
     */
    public String getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    
}
