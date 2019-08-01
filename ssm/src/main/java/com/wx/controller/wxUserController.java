package com.wx.controller;


import com.wx.model.wxUser;
import com.wx.service.wxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class wxUserController {

    @Resource
    private wxUserService wxUserService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        List<wxUser> wxUserList = wxUserService.findAll();
        for(wxUser wxuser:wxUserList){
            System.out.println("Id:"+wxuser.getId());
            System.out.println("Name:"+wxuser.getName());
        }
        return "hello";
    }
}
