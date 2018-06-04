package com.mervyn.dataanalysis.singlegroup.service;/**
 * Created by hm on 2018/5/18.
 */

import com.mervyn.dataanalysis.singlegroup.domain.SingleGroup;

import java.util.List;

/**
 * @author hexinxin
 *         Date: 2018/5/18
 *         Time: 10:07
 *         Description:
 */
public interface SingleGroupService {
    public void save(SingleGroup singleGroup);
    List<SingleGroup> findByNumberAndTitleName(String number,String titleName);
}
