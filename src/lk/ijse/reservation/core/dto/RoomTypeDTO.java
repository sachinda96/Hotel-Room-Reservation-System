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
public class RoomTypeDTO extends SuperDTO{
    private String id;
    private String Type;
    private String Details;
    private String BedType;
    private String Fasilites;
   
    public RoomTypeDTO() {
    }

    public RoomTypeDTO(String id, String Type, String Details, String bedType, String fasilites) {
        this.id = id;
        this.Type=Type;
        this.Details=Details;
        this.BedType=bedType;
        this.Fasilites=fasilites;
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
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @return the Details
     */
    public String getDetails() {
        return Details;
    }

    /**
     * @param Details the Details to set
     */
    public void setDetails(String Details) {
        this.Details = Details;
    }

    /**
     * @return the BedType
     */
    public String getBedType() {
        return BedType;
    }

    /**
     * @param BedType the BedType to set
     */
    public void setBedType(String BedType) {
        this.BedType = BedType;
    }

    /**
     * @return the Fasilites
     */
    public String getFasilites() {
        return Fasilites;
    }

    /**
     * @param Fasilites the Fasilites to set
     */
    public void setFasilites(String Fasilites) {
        this.Fasilites = Fasilites;
    }

   
}
