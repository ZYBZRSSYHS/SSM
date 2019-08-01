package com.wx.controller.test;

import com.wx.dao.wxUserDao;
import com.wx.model.wxUser;
import org.junit.Test;


import javax.annotation.Resource;
import java.util.List;

public class wxUserDaoTest extends BaseJunit4Test{

    @Resource
    private wxUserDao wxUserDao;

    @Test
    public void testFindAll(){
        List<wxUser> wxUserList = wxUserDao.findAll();
        System.out.println(wxUserList);
    }

    @Test
    public void testFindById(){
        wxUser wxUser = wxUserDao.findById("1");
        System.out.println(wxUser);
    }

    @Test
    public void testFindByName(){
        wxUser wxUser = wxUserDao.findByName("wx");
        System.out.println(wxUser);
    }

    @Test
    public void testCountyByName(){
        int count =wxUserDao.countyByName("wx");
        System.out.println(count);
    }

    @Test
    public void testInsert(){
        for(int i=0;i<10;i++){
            wxUser wxUser = new wxUser();
            wxUser.setId(i);
            wxUser.setName("xfx");
            wxUser.setPassword("789");
            int count = wxUserDao.insert(wxUser);
            System.out.println(count);
        }
    }

    @Test
    public void testUpdate(){
        wxUser wxUser = new wxUser();
        wxUser.setId(6);
        wxUser.setName("ay");
        wxUser.setPassword("88889");
        int count = wxUserDao.update(wxUser);
        System.out.println(count);
    }

    @Test
    public void testDelete(){
      //  for(int i=1;i<3;i++){//
           int count = wxUserDao.delete(6);
            System.out.println(count);
       // }
    }

    @Test
    public void testDeleteByName(){
        String name = "xfx";
        int count = wxUserDao.deleteByName(name);
        System.out.println(count);
    }

}
