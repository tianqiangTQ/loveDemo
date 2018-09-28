package com.tianqiang.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author tianqiang
 * @version 创建时间：2018/9/28 下午5:23
 */
@Controller
@Log4j
public class IndexController {

    @RequestMapping(value = "/heart", method = RequestMethod.GET)
    public String welcome(ModelMap model) {
        return "demo2";
    }
}