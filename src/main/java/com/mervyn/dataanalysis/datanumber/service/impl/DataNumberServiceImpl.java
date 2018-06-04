package com.mervyn.dataanalysis.datanumber.service.impl;

import com.mervyn.dataanalysis.datanumber.dao.DataNumberRepository;
import com.mervyn.dataanalysis.datanumber.domain.DataNumber;
import com.mervyn.dataanalysis.datanumber.domain.DataNumberVO;
import com.mervyn.dataanalysis.datanumber.service.DataNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author hexinxin
 * @Date: 2018/5/16
 * @Time: 9:45
 * @Description:
 */
@Service("dataNumberService")
public class DataNumberServiceImpl implements DataNumberService{
    @Autowired
    private DataNumberRepository repository;

    @Override
    @Transactional
    public DataNumber findByNumber(String number) {
        return repository.findByNumber(number);
    }

    @Override
    @Transactional
    public List<DataNumber> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void save(DataNumberVO dataNumberVO) {
        DataNumber dataNumber = new DataNumber();
        dataNumber.setNumber(dataNumberVO.getNumber());
        repository.save(dataNumber);
    }

}
