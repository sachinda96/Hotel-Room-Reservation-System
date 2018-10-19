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
import lk.ijse.reservation.core.dto.FasilitesDTO;
import lk.ijse.reservation.core.dto.RoomsDTO;
import lk.ijse.reservation.custom.FasilitesDAO;

/**
 *
 * @author Sachinda Nipun
 */
public class FasilitesDAOImpl implements FasilitesDAO{

    @Override
    public boolean add(FasilitesDTO Fasilites) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Fasilites  VALUES (?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, Fasilites.getId());
        pstm.setObject(2, Fasilites.getName());
        pstm.setObject(3, Fasilites.getFasilites());
        pstm.setObject(4, Fasilites.getPrice());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(FasilitesDTO Fasilites) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Fasilites  SET FasilitesName=?, Fasilites=?, FasilitesPrice=? WHERE FID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, Fasilites.getId());
        pstm.setObject(2, Fasilites.getName());
        pstm.setObject(3, Fasilites.getFasilites());
        pstm.setObject(4, Fasilites.getPrice());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(FasilitesDTO Fasilites) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Fasilites  WHERE FID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, Fasilites.getId());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FasilitesDTO search(FasilitesDTO Fasilites) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Fasilites  WHERE Fid='" + Fasilites.getId()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new FasilitesDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
                    );
                    
                    }
    

        return null;
    }

    @Override
    public ArrayList<FasilitesDTO> getAll() throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Fasilites ";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<FasilitesDTO> alFasilites = null;

        while (rst.next()) {
            if (alFasilites == null) {
                alFasilites = new ArrayList<>();
            }

            alFasilites.add(new FasilitesDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            ) );

        }

        return alFasilites;
    }
    }

