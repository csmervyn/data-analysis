package com.mervyn.dataanalysis.datanumber.service;

import com.mervyn.dataanalysis.datanumber.domain.DataNumber;
import com.mervyn.dataanalysis.datanumber.domain.DataNumberVO;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.List;

/**
 * @author hexinxin
 * @Date: 2018/5/16
 * @Time: 9:39
 * @Description:
 */
public interface DataNumberService {
    DataNumber findByNumber(String number);

    List<DataNumber> findAll();

    public void save(DataNumberVO dataNumberVO);
}
