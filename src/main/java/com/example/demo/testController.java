package com.example.demo;

import com.example.demo.dto.ResultDto;
import com.example.demo.dto.ResultDtoFactory;
import com.example.demo.entity.BaseUser;
import com.example.demo.service.BaseUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bin on 2017/6/27 0027.
 */
@RestController
@RequestMapping(value = "/show")
public class testController {

    @Autowired
    private BaseUserService baseUserService;

    @RequestMapping("/query")
    @ResponseBody
    public ResultDto query() {

        PageHelper.startPage(1, 12);

        List<BaseUser> users = baseUserService.selectAll();
        return ResultDtoFactory.toSuccess(new PageInfo(users));
    }

    @RequestMapping("/test")
    public String test() {
        return "helle world";
    }
}
