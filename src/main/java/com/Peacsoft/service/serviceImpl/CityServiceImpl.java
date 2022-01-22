package com.Peacsoft.service.serviceImpl;

import com.Peacsoft.dao.CityDao;
import com.Peacsoft.dao.daoImpl.CityDaoImpl;
import com.Peacsoft.model.City;
import com.Peacsoft.model.Country;
import com.Peacsoft.service.CityService;

import java.sql.SQLException;
import java.util.List;

public class CityServiceImpl implements CityService {
    CityDao Dao = new CityDaoImpl();
    @Override
    public void saveCity(String name,String location,int how_many_school,int population) {
        Dao.saveCity(name,location,how_many_school,population);
    }

    @Override
    public void findById(int id) throws SQLException {
        Dao.findByIdCity(id);
    }

    @Override
    public void deleteByIdCity(int id) throws SQLException {
        Dao.deleteByIdCity(id);
    }

    @Override
    public List<City> getAllCity() throws SQLException {
        return Dao.getAllCity();
    }

}
