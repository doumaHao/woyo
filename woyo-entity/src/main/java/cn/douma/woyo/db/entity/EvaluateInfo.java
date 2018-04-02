package cn.douma.woyo.db.entity;

import java.util.Date;

public class EvaluateInfo {
    private Long id;

    private String evaluateType;

    private String idno;

    private String elavaterIdno;

    private Long driverOrderId;

    private Long passerOrder;

    private Integer evaluateScore;

    private Date evaluateTime;

    private String evaluateContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEvaluateType() {
        return evaluateType;
    }

    public void setEvaluateType(String evaluateType) {
        this.evaluateType = evaluateType == null ? null : evaluateType.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getElavaterIdno() {
        return elavaterIdno;
    }

    public void setElavaterIdno(String elavaterIdno) {
        this.elavaterIdno = elavaterIdno == null ? null : elavaterIdno.trim();
    }

    public Long getDriverOrderId() {
        return driverOrderId;
    }

    public void setDriverOrderId(Long driverOrderId) {
        this.driverOrderId = driverOrderId;
    }

    public Long getPasserOrder() {
        return passerOrder;
    }

    public void setPasserOrder(Long passerOrder) {
        this.passerOrder = passerOrder;
    }

    public Integer getEvaluateScore() {
        return evaluateScore;
    }

    public void setEvaluateScore(Integer evaluateScore) {
        this.evaluateScore = evaluateScore;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public String getEvaluateContent() {
        return evaluateContent;
    }

    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent == null ? null : evaluateContent.trim();
    }
}