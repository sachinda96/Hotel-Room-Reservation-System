/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.DAO.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import ik.ijse.reservation.db.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.reservation.core.dto.GuestDTO;
import lk.ijse.reservation.core.dto.RoomsDTO;
import lk.ijse.reservation.core.dto.SuperDTO;
import lk.ijse.reservation.custom.GuestDAO;
import lk.ijse.reservation.custom.RoomsDAO;
import lk.ijse.reservation.dao.SuperDAO;
import sun.rmi.registry.RegistryImpl;

/**
 *
 * @author Sachinda Nipun
 */
public class RoomDAOImple implements RoomsDAO{

       @Override
    public boolean add(RoomsDTO room) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Rooms VALUES (?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, room.getRTID());
        pstm.setObject(2, room.getRoomType());
        pstm.setObject(3, room.getID());
        pstm.setObject(4, room.getNumber());
        pstm.setObject(5, room.getFlow());
        pstm.setObject(6, room.getPrice());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(RoomsDTO room) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE ROOMS SET name=?, contact=?, email=?,Gender=? WHERE RMID=?";
         PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, room.getRTID());
        pstm.setObject(2, room.getRoomType());
        pstm.setObject(3, room.getID());
        pstm.setObject(4, room.getNumber());
        pstm.setObject(5, room.getFlow());
        pstm.setObject(6, room.getPrice());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(RoomsDTO room) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM ROOMS WHERE RMID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, room.getID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RoomsDTO search(RoomsDTO room) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM ROOMS WHERE id='" + room.getID()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new RoomsDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getBigDecimal(6)
                    );
                    
                    }
    

        return null;
    }

    @Override
    public ArrayList<RoomsDTO> getAll() throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM ROOMS";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<RoomsDTO> alRoom = null;

        while (rst.next()) {
            if (alRoom == null) {
                alRoom = new ArrayList<>();
            }

            alRoom.add(new RoomsDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getBigDecimal(6)
            ) );

        }

        return alRoom;
    }
    }


   
    
    

