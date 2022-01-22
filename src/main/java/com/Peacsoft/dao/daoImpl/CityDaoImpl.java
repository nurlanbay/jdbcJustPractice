package com.Peacsoft.dao.daoImpl;

import com.Peacsoft.dao.CityDao;
import com.Peacsoft.model.City;
import com.Peacsoft.model.Country;
import com.Peacsoft.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityDaoImpl implements CityDao {
    Util util = new Util();

    @Override
    public void saveCity(String name, String location, int how_many_school, int population) {
        String SQL = "INSERT INTO person(name ,location,how_many_school,population)values (?,?,?,?)";

        try (Connection connect = util.connection();
             PreparedStatement statement = connect.prepareStatement(SQL);) {
            statement.setString(1, name);
            statement.setString(2, location);
            statement.setInt(3, how_many_school);
            statement.setInt(5, population);

            statement.executeUpdate();
            System.out.println("add to DataBase");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void findByIdCity(int id) {

        String s = "SELECT * FROM city WHERE id = (?)";

        try (Connection connection = util.connection()) {
            PreparedStatement statement = connection.prepareStatement(s);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String id1 = resultSet.getString("id");
                String name = resultSet.getString("name");
                String location = resultSet.getString("location");
                int how_many_school = resultSet.getInt("how_many_school");
                int population = resultSet.getInt("population");

                System.out.println(id1);
                System.out.println(name);
                System.out.println(location);
                System.out.println(how_many_school);
                System.out.println(population);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<City> getAllCity() {
        ArrayList<City> customers = new ArrayList<City>();
        City customer = new City();
        try {
            Connection connection = util.connection();
            Statement statement = connection.createStatement();
            String s = "SELECT * FROM city";

            ResultSet rs = statement.executeQuery(s);
            while (rs.next()) {

                customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setName(rs.getString("location"));
                customer.setLocation(rs.getString("how_many_school"));
                customer.setHow_many_school(rs.getInt("population"));


                customers.add(customer);
            }

            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return customers;
    }

    @Override

    public void deleteByIdCity(int id) throws SQLException {
        Connection conn = util.connection();
        String sql = "DELETE FROM city WHERE id =?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id);

        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("city was deleted successfully!");
        }
    }
}
