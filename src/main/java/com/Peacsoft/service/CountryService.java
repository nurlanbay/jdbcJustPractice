package com.Peacsoft.service;

import com.Peacsoft.model.Country;

import java.sql.SQLException;
import java.util.List;

public interface CountryService {
    void saveCountry(String name,int population,int budget,int how_many_university,int person_id) throws SQLException;
    List<Country> getAllCountry() throws SQLException;
    void findByIdCountry (int id);
    void deleteByIdCountry (int id) throws SQLException;
}
