/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.DAO;

import static lk.ijse.reservation.DAO.DAOFactory.DAOTypes.GUEST;
import lk.ijse.reservation.DAO.custom.impl.FasilitesDAOImpl;
import lk.ijse.reservation.DAO.custom.impl.GuestDAOImpl;
import lk.ijse.reservation.DAO.custom.impl.RoomDAOImple;
import lk.ijse.reservation.DAO.custom.impl.RoomTypeDAOImpl;
import lk.ijse.reservation.dao.SuperDAO;

/**
 *
 * @author Sachinda Nipun
 */
public class DAOFactory {
    public enum DAOTypes{
        GUEST,ROOMS,Fasilites,ROOMSTYPE
    }
    
    private static DAOFactory daoFactory;
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    
  public lk.ijse.reservation.dao.SuperDAO getDAO(DAOTypes doaTypes){
      switch(doaTypes){
            case GUEST:
                return  new GuestDAOImpl();
                case ROOMS:
                return new RoomDAOImple();
                case Fasilites:
                    return new FasilitesDAOImpl();
                case ROOMSTYPE:
                    return new RoomTypeDAOImpl();
            default:
                return null;
        }
    }
}
  
