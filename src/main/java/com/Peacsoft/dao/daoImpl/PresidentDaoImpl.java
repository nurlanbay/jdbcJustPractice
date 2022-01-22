package com.Peacsoft.dao.daoImpl;

import com.Peacsoft.dao.PresidentDao;
import com.Peacsoft.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PresidentDaoImpl implements PresidentDao {
    Util util = new Util();
    public List<com.Peacsoft.model.President> getAllPresident()  {
        ArrayList<com.Peacsoft.model.President> countries = new ArrayList<>();
        com.Peacsoft.model.President president = new com.Peacsoft.model.President();

        try {
            Connection connection = util.connection();
            Statement statement = connection.createStatement();
            String sql ="SELECT * FROM person";
            ResultSet resul = statement.executeQuery(sql);
            while (resul.next()){
                president.setId(resul.getInt("id"));
                president.setFirst_name(resul.getString("first_name"));
                president.setLast_name(resul.getString("last_name"));
                president.setGender(resul.getString("gender"));
                president.setGate_of_birth(resul.getString("date_of_birth"));

                countries.add(president);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return countries;
    }

}
