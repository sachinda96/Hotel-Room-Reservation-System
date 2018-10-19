/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.controller;

import java.util.ArrayList;
import lk.ijse.reservation.DAO.DAOFactory;
import lk.ijse.reservation.core.dto.FasilitesDTO;
import lk.ijse.reservation.core.dto.GuestDTO;
import lk.ijse.reservation.custom.FasilitesDAO;
import lk.ijse.reservation.custom.GuestDAO;

/**
 *
 * @author Sachinda Nipun
 */
public class ManegeFasilites {
    public static FasilitesDAO fasilitesDAO = (FasilitesDAO) DAOFactory.getInstance(). getDAO(DAOFactory.DAOTypes.Fasilites);
    
    public static boolean addFaslites(FasilitesDTO Fasilites) throws  Exception  {
        boolean result = fasilitesDAO.add(Fasilites);
        return result;
    }
    
    public static boolean deleteFaslites(FasilitesDTO Fasilites)throws Exception{
        boolean result = fasilitesDAO.delete(Fasilites);
        return result;
    }
    
    public static boolean updateFaslites(FasilitesDTO Fasilites)throws Exception{
        boolean result = fasilitesDAO.update(Fasilites);
        return result;
    }
    
    public static FasilitesDTO searchFaslites(FasilitesDTO Fasilites) throws Exception{
        FasilitesDTO searchedFasilites = fasilitesDAO.search(Fasilites);
        return searchedFasilites;
    }
    
    public static ArrayList<FasilitesDTO> getAllFalitites()throws Exception{
        return fasilitesDAO.getAll();
    }
}
