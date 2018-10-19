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
public class RoomsDTO extends SuperDTO{
    private String RTID;
    private String RoomType;
    private String ID;
    private String Number;
    private String Flow;
    private BigDecimal price;

public RoomsDTO(){
    
}
        public RoomsDTO(String RTID,String RoomType,String id,String number,String flow,BigDecimal price){
            this.RTID=RTID;
            this.RoomType=RoomType;
            this.ID=id;
            this.Number=number;
            this.Flow=flow;
            this.price=price;
        
            
        }

    /**
     * @return the RTID
     */
    public String getRTID() {
        return RTID;
    }

    /**
     * @param RTID the RTID to set
     */
    public void setRTID(String RTID) {
        this.RTID = RTID;
    }

    /**
     * @return the RoomType
     */
    public String getRoomType() {
        return RoomType;
    }

    /**
     * @param RoomType the RoomType to set
     */
    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the Number
     */
    public String getNumber() {
        return Number;
    }

    /**
     * @param Number the Number to set
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * @return the Flow
     */
    public String getFlow() {
        return Flow;
    }

    /**
     * @param Flow the Flow to set
     */
    public void setFlow(String Flow) {
        this.Flow = Flow;
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