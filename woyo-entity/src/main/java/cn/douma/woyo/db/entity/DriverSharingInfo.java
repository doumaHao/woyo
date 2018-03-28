package cn.douma.woyo.db.entity;

import java.util.Date;

public class DriverSharingInfo {
    private Long id;

    private String idno;

    private String carNo;

    private String contractType;

    private Date setoffTime;

    private String departureId;

    private String destinationId;

    private Integer totelSeat;

    private Integer remainderSeat;

    private Date publishTime;

    private Long totalPrice;

    private Long unitPrice;

    private String noContract;

    private String completeFlg;

    private String remarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public Date getSetoffTime() {
        return setoffTime;
    }

    public void setSetoffTime(Date setoffTime) {
        this.setoffTime = setoffTime;
    }

    public String getDepartureId() {
        return departureId;
    }

    public void setDepartureId(String departureId) {
        this.departureId = departureId == null ? null : departureId.trim();
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId == null ? null : destinationId.trim();
    }

    public Integer getTotelSeat() {
        return totelSeat;
    }

    public void setTotelSeat(Integer totelSeat) {
        this.totelSeat = totelSeat;
    }

    public Integer getRemainderSeat() {
        return remainderSeat;
    }

    public void setRemainderSeat(Integer remainderSeat) {
        this.remainderSeat = remainderSeat;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getNoContract() {
        return noContract;
    }

    public void setNoContract(String noContract) {
        this.noContract = noContract == null ? null : noContract.trim();
    }

    public String getCompleteFlg() {
        return completeFlg;
    }

    public void setCompleteFlg(String completeFlg) {
        this.completeFlg = completeFlg == null ? null : completeFlg.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}