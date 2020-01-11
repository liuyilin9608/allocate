package com.ielts.allocate.controller;

import com.ielts.allocate.entity.EngUser;
import com.ielts.allocate.mapper.EngUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class EngUserController {

    @Autowired
    private EngUserMapper engUserMapper;

    @RequestMapping("/test")
    public String findUser(Model model){

        List<EngUser> list = engUserMapper.selectAll();
        model.addAttribute("test",list);
        return "test";
    }
}
