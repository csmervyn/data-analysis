package com.mervyn.dataanalysis.datanumber.domain;


import javax.persistence.*;

/**
 * @author hexinxin
 * @Date: 2018/5/16
 * @Time: 9:29
 * @Description: DataNumber实体
 */
@Entity(name="data_number")
public class DataNumber {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
