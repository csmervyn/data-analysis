package com.mervyn.dataanalysis.singlegroup.dao;


import com.mervyn.dataanalysis.singlegroup.domain.SingleGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hexinxin
 * @Date: 2018/5/18
 * @Time: 10:05
 * @Description:
 */
@Repository
public interface SingleGroupRepository   extends JpaRepository<SingleGroup, Long> {
    List<SingleGroup> findByNumberAndTitleName(String number,String titleName);
}
