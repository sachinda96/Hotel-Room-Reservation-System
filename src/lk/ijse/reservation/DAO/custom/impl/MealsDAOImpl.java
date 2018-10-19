/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.DAO.custom.impl;

import ik.ijse.reservation.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import lk.ijse.reservation.core.dto.MealsDTO;
import lk.ijse.reservation.core.dto.RoomTypeDTO;
import lk.ijse.reservation.custom.MealsDAO;
import lk.ijse.reservation.custom.RoomTypeDAO;

/**
 *
 * @author Sachinda Nipun
 */
public class MealsDAOImpl implements MealsDAO{

    @Override
    public boolean add(MealsDTO Meals) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Roomstype SET RoomTypes=?, RoomTypeDetails =?, BedType =?,Fasilites =? WHERE RTID=?";
         PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, Meals.getMId());
        pstm.setObject(2, Meals.getMealsType());
        pstm.setObject(3, Meals.getMealsDescription());
        pstm.setObject(4, Meals.getPrice());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(MealsDTO DTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(MealsDTO DTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MealsDTO search(MealsDTO DTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<MealsDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
