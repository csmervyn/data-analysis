package com.mervyn.dataanalysis.datanumber.dao;

import com.mervyn.dataanalysis.datanumber.domain.DataNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hexinxin
 * @Date: 2018/5/16
 * @Time: 9:35
 * @Description:
 */
@Repository
public interface DataNumberRepository  extends JpaRepository<DataNumber, Long> {
    DataNumber findByNumber(String number);
}
