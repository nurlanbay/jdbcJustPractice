package com.Peacsoft.dao;

import com.Peacsoft.model.City;
import com.Peacsoft.model.Country;

import java.sql.SQLException;
import java.util.List;

public interface CityDao {
    void saveCity(String name,String location,int how_many_school,int population);
    void  findByIdCity(int id) throws SQLException;
    List<City> getAllCity() throws SQLException;
    void deleteByIdCity (int id) throws SQLException;

}
