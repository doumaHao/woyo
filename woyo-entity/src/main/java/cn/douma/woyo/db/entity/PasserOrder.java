package cn.douma.woyo.db.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PasserOrder {
    private Long id;

    private Long passerShareId;

    private Long driverShareId;

    private Integer consumeSeat;

    private BigDecimal orderPrice;

    private Date orderTime;

    private String orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPasserShareId() {
        return passerShareId;
    }

    public void setPasserShareId(Long passerShareId) {
        this.passerShareId = passerShareId;
    }

    public Long getDriverShareId() {
        return driverShareId;
    }

    public void setDriverShareId(Long driverShareId) {
        this.driverShareId = driverShareId;
    }

    public Integer getConsumeSeat() {
        return consumeSeat;
    }

    public void setConsumeSeat(Integer consumeSeat) {
        this.consumeSeat = consumeSeat;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }
}