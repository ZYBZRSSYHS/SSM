package com.wx.dao;

import com.wx.model.wxUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface wxUserDao {
        List<wxUser> findAll();

        wxUser findById(String id);

        wxUser findByName(String name);

        int countyByName(String name);

        int insert(wxUser wxUser);

        int update(wxUser wxUser);

        int delete(int id);

        int deleteByName(String name);
}
