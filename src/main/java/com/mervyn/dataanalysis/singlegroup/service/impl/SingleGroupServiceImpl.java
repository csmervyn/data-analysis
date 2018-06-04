package com.mervyn.dataanalysis.singlegroup.service.impl;

import com.mervyn.dataanalysis.singlegroup.dao.SingleGroupRepository;
import com.mervyn.dataanalysis.singlegroup.domain.SingleGroup;
import com.mervyn.dataanalysis.singlegroup.service.SingleGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author hexinxin
 * @Date: 2018/5/18
 * @Time: 10:09
 * @Description:
 */
@Service
public class SingleGroupServiceImpl implements SingleGroupService{
    @Autowired
    private SingleGroupRepository singleGroupRepository;
    @Override
    public void save(SingleGroup singleGroup) {
        singleGroupRepository.save(singleGroup);
    }

    @Override
    public List<SingleGroup> findByNumberAndTitleName(String number, String titleName) {
        List<SingleGroup> list =  singleGroupRepository.findByNumberAndTitleName(number,titleName);
        Collections.sort(list);
        return list;
    }
}
