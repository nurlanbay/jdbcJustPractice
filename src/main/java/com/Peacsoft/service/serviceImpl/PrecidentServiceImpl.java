package com.Peacsoft.service.serviceImpl;

import com.Peacsoft.dao.PresidentDao;
import com.Peacsoft.dao.daoImpl.PresidentDaoImpl;
import com.Peacsoft.model.President;
import com.Peacsoft.service.PresidentService;

import java.util.List;

public class PrecidentServiceImpl implements PresidentService {
    PresidentDao president = new PresidentDaoImpl();

    @Override
    public List<President> getAllPresident() {
        return president.getAllPresident();
    }
}
