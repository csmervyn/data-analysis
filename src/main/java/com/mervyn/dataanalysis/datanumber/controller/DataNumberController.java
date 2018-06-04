package com.mervyn.dataanalysis.datanumber.controller;

import com.mervyn.dataanalysis.common.JsonResult;
import com.mervyn.dataanalysis.datanumber.domain.DataNumber;
import com.mervyn.dataanalysis.datanumber.domain.DataNumberVO;
import com.mervyn.dataanalysis.datanumber.service.DataNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author hexinxin
 * @Date: 2018/5/16
 * @Time: 8:38
 * @Description: 数据编号管理
 */
@RestController("dataNumberController")
@RequestMapping(value = "/dataNumber")
public class DataNumberController {
    @Autowired
    private DataNumberService dataNumberService;
    @RequestMapping(value = "/number",method = RequestMethod.GET)
    public JsonResult<DataNumber> findByNumber(DataNumberVO dataNumberVO){
        DataNumber dataNumber = dataNumberService.findByNumber(dataNumberVO.getNumber());
        return new JsonResult<DataNumber>(dataNumber,"查询数据编号成功",Boolean.TRUE);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public JsonResult<List<DataNumber>> findAll(){
        List<DataNumber> list = dataNumberService.findAll();
        return new JsonResult<List<DataNumber>>(list,"查询数据编号成功",Boolean.TRUE);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public JsonResult<Object> save(DataNumberVO dataNumberVO){
        dataNumberService.save(dataNumberVO);
        return new JsonResult<Object>(null,"数据编号存入成功",Boolean.TRUE);
    }

}
