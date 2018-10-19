/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.DAO.custom.impl;

import ik.ijse.reservation.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.reservation.core.dto.RoomTypeDTO;
import lk.ijse.reservation.core.dto.RoomsDTO;
import lk.ijse.reservation.custom.RoomTypeDAO;
import lk.ijse.reservation.dao.SuperDAO;

/**
 *
 * @author Sachinda Nipun
 */
public class RoomTypeDAOImpl implements RoomTypeDAO{

    @Override
    public boolean add(RoomTypeDTO RoomTYpe) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Roomstype VALUES (?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, RoomTYpe.getId());
        pstm.setObject(2, RoomTYpe.getType());
        pstm.setObject(3, RoomTYpe.getDetails());
        pstm.setObject(4, RoomTYpe.getBedType());
        pstm.setObject(5, RoomTYpe.getFasilites());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(RoomTypeDTO RoomTYpe) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Roomstype SET RoomTypes=?, RoomTypeDetails =?, BedType =?,Fasilites =? WHERE RTID=?";
         PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, RoomTYpe.getId());
        pstm.setObject(2, RoomTYpe.getType());
        pstm.setObject(3, RoomTYpe.getDetails());
        pstm.setObject(4, RoomTYpe.getBedType());
        pstm.setObject(5, RoomTYpe.getFasilites());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(RoomTypeDTO RoomTYpe) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Roomstype  WHERE RTID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, RoomTYpe.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RoomTypeDTO search(RoomTypeDTO RoomTYpe) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Roomstype  WHERE id='" + RoomTYpe.getId()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new RoomTypeDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
                    );
                    
                    }
    

        return null;
    }

    @Override
    public ArrayList<RoomTypeDTO> getAll() throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Roomstype ";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<RoomTypeDTO> alRoomType = null;

        while (rst.next()) {
            if (alRoomType == null) {
                alRoomType = new ArrayList<>();
            }

            alRoomType.add(new RoomTypeDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            ) );

        }

        return alRoomType;
    }
    }
    

