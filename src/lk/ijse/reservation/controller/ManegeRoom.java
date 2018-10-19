/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.controller;

import java.util.ArrayList;
import lk.ijse.reservation.DAO.DAOFactory;
import lk.ijse.reservation.core.dto.GuestDTO;
import lk.ijse.reservation.core.dto.RoomsDTO;
import lk.ijse.reservation.custom.GuestDAO;
import lk.ijse.reservation.custom.RoomsDAO;

/**
 *
 * @author Sachinda Nipun
 */
public class ManegeRoom {
     public static RoomsDAO RoomsDAO = (RoomsDAO) DAOFactory.getInstance(). getDAO(DAOFactory.DAOTypes.ROOMS);
    
    public static boolean addRoom(RoomsDTO Rooms) throws  Exception  {
        boolean result = RoomsDAO.add(Rooms);
        return result;
    }

    
   public static boolean deleteRoom(RoomsDTO Rooms)throws Exception{
        boolean result = RoomsDAO.delete(Rooms);
        return result;
    }
    
    public static boolean updateRoom(RoomsDTO Rooms)throws Exception{
        boolean result = RoomsDAO.update(Rooms);
        return result;
    }
    
    public static RoomsDTO searchRoom(RoomsDTO Rooms) throws Exception{
        RoomsDTO searchRoom = RoomsDAO.search(Rooms);
        return searchRoom;
    }
    
    public static ArrayList<RoomsDTO> getAllRooms()throws Exception{
        return RoomsDAO.getAll();
}
}
