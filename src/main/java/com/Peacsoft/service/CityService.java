package com.Peacsoft.service;

import com.Peacsoft.model.City;
import com.Peacsoft.model.Country;

import java.sql.SQLException;
import java.util.List;

public interface CityService {
    void saveCity(String name,String location,int how_many_school,int population);
    void findById(int id) throws SQLException;
    void deleteByIdCity(int id) throws SQLException;
    List<City> getAllCity() throws SQLException;

}
