package com.nihaoyin.healthmanagement.dao;

import com.nihaoyin.healthmanagement.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    public List<MainMenu> getMenu();
}
