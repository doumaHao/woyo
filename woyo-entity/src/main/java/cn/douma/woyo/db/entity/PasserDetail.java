package cn.douma.woyo.db.entity;

public class PasserDetail {
    private Long id;

    private Long passerShareId;

    private String idno;

    private String name;

    private String priceStatus;

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

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPriceStatus() {
        return priceStatus;
    }

    public void setPriceStatus(String priceStatus) {
        this.priceStatus = priceStatus == null ? null : priceStatus.trim();
    }
}