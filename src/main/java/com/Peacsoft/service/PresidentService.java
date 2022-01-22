package com.Peacsoft.service;

import com.Peacsoft.dao.daoImpl.PresidentDaoImpl;
import com.Peacsoft.model.President;

import java.util.List;

public interface PresidentService {
    List<President> getAllPresident();
}
