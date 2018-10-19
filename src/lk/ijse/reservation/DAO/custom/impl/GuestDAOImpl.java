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
import lk.ijse.reservation.core.dto.GuestDTO;
import lk.ijse.reservation.core.dto.SuperDTO;
import lk.ijse.reservation.custom.GuestDAO;
import lk.ijse.reservation.dao.SuperDAO;

/**
 *
 * @author Sachinda Nipun
 */
public class GuestDAOImpl implements GuestDAO{

    @Override
    public boolean add(GuestDTO Guest) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Guest VALUES (?,?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, Guest.getId());
        pstm.setObject(2, Guest.getFirstName());
        pstm.setObject(3, Guest.getLastName());
        pstm.setObject(4, Guest.getGender());
        pstm.setObject(5, Guest.getIDType());
        pstm.setObject(6, Guest.getIdNumber());
        pstm.setObject(7, Guest.getContactNo());
        pstm.setObject(8, Guest.getEMail());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(GuestDTO Guest) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Guest SET EMail =?, ContactNo=?, Idnumber=?,IDType=?,Gender=?,LastName =?,FirstName=?  WHERE GID=?";
        PreparedStatement pstm = connection.prepareStatement(sql); //To change body of generated methods, choose Tools | Templates.
        pstm.setObject(1, Guest.getEMail());
        pstm.setObject(2, Guest.getContactNo());
        pstm.setObject(3, Guest.getIdNumber());
        pstm.setObject(4, Guest.getIDType());
        pstm.setObject(5, Guest.getGender());
        pstm.setObject(6, Guest.getLastName());
        pstm.setObject(7, Guest.getFirstName());
        pstm.setObject(8, Guest.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(GuestDTO Guest) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Guest WHERE GID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, Guest.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GuestDTO search(GuestDTO Guest) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Guest WHERE id='" + Guest.getId() + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new GuestDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8));
                    
                    }
    

        return null;
    }

    @Override
    public ArrayList<GuestDTO> getAll() throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Guest";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<GuestDTO> alGuest = null;

        while (rst.next()) {
            if (alGuest == null) {
                alGuest = new ArrayList<>();
            }

            alGuest.add(new GuestDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)
            ));

        }

        return alGuest;
    }
    }

   
    
    

