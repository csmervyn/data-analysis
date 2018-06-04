package com.mervyn.dataanalysis.singlegroup.controller;

import com.mervyn.dataanalysis.common.JsonResult;
import com.mervyn.dataanalysis.datanumber.domain.DataNumber;
import com.mervyn.dataanalysis.datanumber.domain.DataNumberVO;
import com.mervyn.dataanalysis.singlegroup.domain.SingleGroup;
import com.mervyn.dataanalysis.singlegroup.service.SingleGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hexinxin
 * @Date: 2018/5/18
 * @Time: 10:41
 * @Description:
 */
@RestController
@RequestMapping("singleGroup")
public class SingleGroupController {
    @Autowired
    private SingleGroupService singleGroupService;
    @RequestMapping(value = "",method = RequestMethod.POST)
    public JsonResult<Object> save(SingleGroup singleGroup){
        singleGroupService.save(singleGroup);
        return new JsonResult<Object>(null,"单表数据存入成功",Boolean.TRUE);
    }

    @RequestMapping(value = "/singleGroup",method = RequestMethod.GET)
    public JsonResult<List<SingleGroup>> findByNumber(SingleGroup singleGroup){
        List<SingleGroup> list = singleGroupService.findByNumberAndTitleName(singleGroup.getNumber(),singleGroup
                .getTitleName());
        return new JsonResult<List<SingleGroup>>(list,"查询单表数据成功",Boolean.TRUE);
    }

}
