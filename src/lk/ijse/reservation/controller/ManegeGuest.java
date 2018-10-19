/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.controller;

import java.util.ArrayList;
import lk.ijse.reservation.DAO.DAOFactory;
//import lk.ijse.reservation.DAO.DaoFactory;
import lk.ijse.reservation.core.dto.GuestDTO;
import lk.ijse.reservation.custom.GuestDAO;

/**
 *
 * @author Sachinda Nipun
 */
public class ManegeGuest {

    /**
     *
     */
   public static GuestDAO GuestDAO = (GuestDAO) DAOFactory.getInstance(). getDAO(DAOFactory.DAOTypes.GUEST);
    
    public static boolean addGuest(GuestDTO Guest) throws  Exception  {
        boolean result = GuestDAO.add(Guest);
        return result;
    }
    
    public static boolean deleteGuest(GuestDTO Guest)throws Exception{
        boolean result = GuestDAO.delete(Guest);
        return result;
    }
    
    public static boolean updateGuest(GuestDTO Guest)throws Exception{
        boolean result = GuestDAO.update(Guest);
        return result;
    }
    
    public static GuestDTO searchGuest(GuestDTO Guest) throws Exception{
        GuestDTO searchedCustomer = GuestDAO.search(Guest);
        return searchedCustomer;
    }
    
    public static ArrayList<GuestDTO> getAllGuest()throws Exception{
        return GuestDAO.getAll();
    }
}
