package com.Peacsoft.dao.daoImpl;

import com.Peacsoft.dao.CountryDao;
import com.Peacsoft.model.Country;
import com.Peacsoft.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryDaoImpl implements CountryDao {
    Util util = new Util();

    @Override
    public List<Country> getAllCountry() throws SQLException {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country();

        try {
            Connection connection = util.connection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM country";
            ResultSet resul = statement.executeQuery(sql);
            while (resul.next()) {
                country.setId(resul.getInt(1));
                country.setName(resul.getString("name"));
                country.setPopulation(resul.getInt("population"));
                country.setHow_many_university(resul.getInt("how_many_university"));
                countries.add(country);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return countries;
    }

    public void findByIdCountry(int id) {
        String s = "SELECT * FROM country WHERE id = (?)";

        try (Connection connection = util.connection()) {
            PreparedStatement statement = connection.prepareStatement(s);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String id2 = resultSet.getString("id");
                String name = resultSet.getString("name");
                int population = resultSet.getInt("population");
                int how_many_school = resultSet.getInt("how_many_university");


                System.out.println(id2);
                System.out.println(name);
                System.out.println(population);
                System.out.println(how_many_school);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveCountry(String name, int population,  int how_many_university)  {

        String SQL = "INSERT INTO country (name,population,how_many_university,person_id) values(?,?,?)";
        try (Connection connection = util.connection();
             PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setString(1, name);
            statement.setInt(2, population);
            statement.setInt(3, how_many_university);

            statement.executeUpdate();
            System.out.println("Add to dataBase");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteByIdCountry(int id) throws SQLException {
        Connection conn = util.connection();
        String sql = "DELETE FROM country WHERE id =?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id);

        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("country was deleted successfully!");
        }
    }
}

