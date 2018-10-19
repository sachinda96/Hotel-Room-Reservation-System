/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.dao;

import java.util.ArrayList;
import lk.ijse.reservation.core.dto.SuperDTO;

/**
 *
 * @author Sachinda Nipun
 */
public interface SuperDAO <T extends SuperDTO> {
    
    public boolean add(T DTO)throws Exception;
    
    public boolean update(T DTO)throws Exception;
    
    public boolean delete(T DTO)throws Exception;
    
    public T search(T DTO)throws Exception;
    
    public ArrayList<T> getAll()throws Exception;        
    
}
    

