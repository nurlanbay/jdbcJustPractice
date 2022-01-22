package com.Peacsoft.dao;

import com.Peacsoft.model.City;
import com.Peacsoft.model.Country;

import java.sql.SQLException;
import java.util.List;

public interface CountryDao {
    List<Country> getAllCountry() throws SQLException;
    void findByIdCountry(int id);
    void saveCountry(String name,int population ,int how_many_university);
    void deleteByIdCountry(int id) throws SQLException;
}
