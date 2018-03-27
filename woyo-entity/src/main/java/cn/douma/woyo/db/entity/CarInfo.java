package cn.douma.woyo.db.entity;

public class CarInfo {
    private Long id;

    private String carType;

    private String carNo;

    private String carVin;

    private Integer carAge;

    private Integer personNum;

    private Integer cargoNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getCarVin() {
        return carVin;
    }

    public void setCarVin(String carVin) {
        this.carVin = carVin == null ? null : carVin.trim();
    }

    public Integer getCarAge() {
        return carAge;
    }

    public void setCarAge(Integer carAge) {
        this.carAge = carAge;
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
}