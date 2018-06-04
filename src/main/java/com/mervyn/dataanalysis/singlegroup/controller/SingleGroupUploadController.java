package com.mervyn.dataanalysis.singlegroup.controller;/**
 * Created by hm on 2018/5/17.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @author hexinxin
 * @Date: 2018/5/17
 * @Time: 15:22
 * @Description:
 */
@Controller
@RequestMapping(value = "/singlegroupFile")
public class SingleGroupUploadController {
    @RequestMapping(value = "/upload")
    public ModelAndView upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request, ModelMap model) {
        String path = request.getSession().getServletContext().getRealPath("upload");
        File directory = new File(path);
        if(!directory.exists()){
            directory.mkdirs();
        }
        String fileName = "originalSingleGroupTableName.xls";
        File targetFile = new File(path, fileName);
        ModelAndView mav = new ModelAndView();
        //保存
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            mav.setViewName("forward:/WEB-INF/upload.jsp");
            mav.addObject("error", "无法将上传文件保存到指定目录，有可能是存储空间目录已满");
            e.printStackTrace();
            return mav;
        }
        mav.setViewName("index");
        return mav;
    }
}
