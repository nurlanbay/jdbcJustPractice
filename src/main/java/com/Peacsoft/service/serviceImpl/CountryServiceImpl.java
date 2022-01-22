package com.Peacsoft.service.serviceImpl;

import com.Peacsoft.dao.CountryDao;
import com.Peacsoft.dao.daoImpl.CountryDaoImpl;
import com.Peacsoft.model.Country;
import com.Peacsoft.service.CountryService;

import java.sql.SQLException;
import java.util.List;

public class CountryServiceImpl implements CountryService {
        CountryDao countryDao = new  CountryDaoImpl();
    @Override
    public void saveCountry(String name, int population, int budget, int how_many_university, int person_id) throws SQLException {
        countryDao.getAllCountry();
    }

    @Override
    public List<Country> getAllCountry() throws SQLException {
        return countryDao.getAllCountry();
    }

    @Override
    public void findByIdCountry(int id) {
       countryDao.findByIdCountry(id);
    }

    @Override
    public void deleteByIdCountry(int id) throws SQLException {
     countryDao.deleteByIdCountry(id);
    }
}
