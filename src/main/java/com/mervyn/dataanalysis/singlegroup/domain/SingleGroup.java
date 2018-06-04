package com.mervyn.dataanalysis.singlegroup.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author hexinxin
 * @Date: 2018/5/18
 * @Time: 9:59
 * @Description:
 */
@Entity(name="single_group")
public class SingleGroup implements Comparable<SingleGroup>{
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String titleName;
    @Column(nullable = false)
    private double data;
    @Column(nullable = false)
    private String number;
    @Column(nullable = false)
    private int lineNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    @Override
    public int compareTo(SingleGroup o) {
        if(lineNum > o.getLineNum()){
            return 1;
        }
        if(lineNum < o.getLineNum()){
            return -1;
        }
        return 0;
    }
}
