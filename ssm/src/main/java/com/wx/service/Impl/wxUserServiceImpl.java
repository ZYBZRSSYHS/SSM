package com.wx.service.Impl;

import com.wx.dao.wxUserDao;
import com.wx.model.wxUser;
import com.wx.service.wxUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class wxUserServiceImpl implements wxUserService {

    @Resource
    private wxUserDao wxUserDao;

    public List<wxUser> findAll(){
        return wxUserDao.findAll();
    }
}
