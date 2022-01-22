package com.Peacsoft.dao;

import com.Peacsoft.model.Country;
import com.Peacsoft.model.President;
import com.Peacsoft.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public interface PresidentDao {
    List<President> getAllPresident();
}
