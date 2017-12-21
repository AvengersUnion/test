package com.jump.pojo;

public class Business {
    private Integer businessId;

    private String businessTitle;

    private String businessPic;

    private String businessSimple;

    private Integer businessFront;

    private Long businessDec;

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessTitle() {
        return businessTitle;
    }

    public void setBusinessTitle(String businessTitle) {
        this.businessTitle = businessTitle == null ? null : businessTitle.trim();
    }

    public String getBusinessPic() {
        return businessPic;
    }

    public void setBusinessPic(String businessPic) {
        this.businessPic = businessPic == null ? null : businessPic.trim();
    }

    public String getBusinessSimple() {
        return businessSimple;
    }

    public void setBusinessSimple(String businessSimple) {
        this.businessSimple = businessSimple == null ? null : businessSimple.trim();
    }

    public Integer getBusinessFront() {
        return businessFront;
    }

    public void setBusinessFront(Integer businessFront) {
        this.businessFront = businessFront;
    }

    public Long getBusinessDec() {
        return businessDec;
    }

    public void setBusinessDec(Long businessDec) {
        this.businessDec = businessDec;
    }
}