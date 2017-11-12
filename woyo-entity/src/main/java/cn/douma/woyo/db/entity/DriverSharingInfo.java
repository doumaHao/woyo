package cn.douma.woyo.db.entity;

import java.util.Date;

public class DriverSharingInfo {
    private Long id;

    private Long userId;

    private Long carId;

    private String contractType;

    private Date setoffTime;

    private String setoffDate;

    private Long departureId;

    private Long destinationId;

    private Integer totelSeat;

    private Integer remainderSeat;

    private Date publishTime;

    private Long totalPrice;

    private Long unitPrice;

    private String noContract;

    private String completeFlg;

    private String deleteFlg;

    private String remarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
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

    public String getSetoffDate() {
        return setoffDate;
    }

    public void setSetoffDate(String setoffDate) {
        this.setoffDate = setoffDate == null ? null : setoffDate.trim();
    }

    public Long getDepartureId() {
        return departureId;
    }

    public void setDepartureId(Long departureId) {
        this.departureId = departureId;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
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

    public String getDeleteFlg() {
        return deleteFlg;
    }

    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg == null ? null : deleteFlg.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}