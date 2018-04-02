package cn.douma.woyo.db.entity;

import java.util.Date;

public class PasserShareInfo {
    private Long id;

    private String mainPasser;

    private String carType;

    private Integer needSeat;

    private Date needTime;

    private String needStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMainPasser() {
        return mainPasser;
    }

    public void setMainPasser(String mainPasser) {
        this.mainPasser = mainPasser == null ? null : mainPasser.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public Integer getNeedSeat() {
        return needSeat;
    }

    public void setNeedSeat(Integer needSeat) {
        this.needSeat = needSeat;
    }

    public Date getNeedTime() {
        return needTime;
    }

    public void setNeedTime(Date needTime) {
        this.needTime = needTime;
    }

    public String getNeedStatus() {
        return needStatus;
    }

    public void setNeedStatus(String needStatus) {
        this.needStatus = needStatus == null ? null : needStatus.trim();
    }
}