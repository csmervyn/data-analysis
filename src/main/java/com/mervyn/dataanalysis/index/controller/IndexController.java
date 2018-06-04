package com.mervyn.dataanalysis.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hexinxin
 * @Date: 2018/5/17
 * @Time: 11:33
 * @Description: 测试主页
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(ModelMap map){
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    /**
     * @Description: 跳转到多组文件上传的页面
     * @param
     * @return
     * @throws
     * @author hexinxin
     * @date 2018/5/17 15:19
     */
    @RequestMapping("/multigroup/upload")
    public String multigroupUpload(){
        return "multigroup/upload";
    }

    /**
     * @Description: 跳转到单组文件上传的页面
     * @param
     * @return
     * @throws
     * @author hexinxin
     * @date 2018/5/17 15:19
     */
    @RequestMapping("/singlegroup/upload")
    public String singlegroupUpload(){
        return "/singlegroup/upload";
    }



}
