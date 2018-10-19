/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.controller;

import java.util.ArrayList;
import lk.ijse.reservation.DAO.DAOFactory;
import static lk.ijse.reservation.controller.ManegeGuest.GuestDAO;
import static lk.ijse.reservation.controller.ManegeRoom.RoomsDAO;
import lk.ijse.reservation.core.dto.GuestDTO;
import lk.ijse.reservation.core.dto.RoomTypeDTO;
import lk.ijse.reservation.core.dto.RoomsDTO;
import lk.ijse.reservation.custom.GuestDAO;
import lk.ijse.reservation.custom.RoomTypeDAO;
import lk.ijse.reservation.custom.RoomsDAO;

/**
 *
 * @author Sachinda Nipun
 */
public class ManegeRoomType {
   public static RoomTypeDAO RoomsDAO = (RoomTypeDAO) DAOFactory.getInstance(). getDAO(DAOFactory.DAOTypes.ROOMSTYPE);
   
       public static boolean addRoom(RoomTypeDTO RoomsType) throws  Exception  {
        boolean result = RoomsDAO.add(RoomsType);
        return result;
       }
        public static boolean deleteRoom(RoomTypeDTO RoomsType)throws Exception{
        boolean result = RoomsDAO.delete(RoomsType);
        return result;
    }
    
    public static boolean updateRoom(RoomTypeDTO RoomsType)throws Exception{
        boolean result = RoomsDAO.update(RoomsType);
        return result;
    }
    
    public static RoomTypeDTO searchRoomsType(RoomTypeDTO RoomsType) throws Exception{
        RoomTypeDTO searchRoomsType = RoomsDAO.search(RoomsType);
        return searchRoomsType;
    }
    
    public static ArrayList<RoomTypeDTO> getAllRoomsTypes()throws Exception{
        return RoomsDAO.getAll();
    }
    
}
