package cn.douma.woyo.db.entity;

import java.util.Date;

public class RequirementInfo {
    private Long id;

    private String reqNo;

    private String reqtType;

    private String reqStartAddress;

    private String reqEndAddress;

    private Date reqTime;

    private Integer personNum;

    private Integer cargoNum;

    private Date createTime;

    private String createIdno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReqNo() {
        return reqNo;
    }

    public void setReqNo(String reqNo) {
        this.reqNo = reqNo == null ? null : reqNo.trim();
    }

    public String getReqtType() {
        return reqtType;
    }

    public void setReqtType(String reqtType) {
        this.reqtType = reqtType == null ? null : reqtType.trim();
    }

    public String getReqStartAddress() {
        return reqStartAddress;
    }

    public void setReqStartAddress(String reqStartAddress) {
        this.reqStartAddress = reqStartAddress == null ? null : reqStartAddress.trim();
    }

    public String getReqEndAddress() {
        return reqEndAddress;
    }

    public void setReqEndAddress(String reqEndAddress) {
        this.reqEndAddress = reqEndAddress == null ? null : reqEndAddress.trim();
    }

    public Date getReqTime() {
        return reqTime;
    }

    public void setReqTime(Date reqTime) {
        this.reqTime = reqTime;
    }

    public Integer getPersonNum() {
        return personNum;
    }

    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    public Integer getCargoNum() {
        return cargoNum;
    }

    public void setCargoNum(Integer cargoNum) {
        this.cargoNum = cargoNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateIdno() {
        return createIdno;
    }

    public void setCreateIdno(String createIdno) {
        this.createIdno = createIdno == null ? null : createIdno.trim();
    }
}