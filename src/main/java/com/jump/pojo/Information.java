package com.jump.pojo;

public class Information {
    private Integer infoId;

    private String infoTitle;

    private String infoPic;

    private String infoCreateTime;

    private String infoKeyword;

    private Integer infoFront;

    private Long infoDec;

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle == null ? null : infoTitle.trim();
    }

    public String getInfoPic() {
        return infoPic;
    }

    public void setInfoPic(String infoPic) {
        this.infoPic = infoPic == null ? null : infoPic.trim();
    }

    public String getInfoCreateTime() {
        return infoCreateTime;
    }

    public void setInfoCreateTime(String infoCreateTime) {
        this.infoCreateTime = infoCreateTime == null ? null : infoCreateTime.trim();
    }

    public String getInfoKeyword() {
        return infoKeyword;
    }

    public void setInfoKeyword(String infoKeyword) {
        this.infoKeyword = infoKeyword == null ? null : infoKeyword.trim();
    }

    public Integer getInfoFront() {
        return infoFront;
    }

    public void setInfoFront(Integer infoFront) {
        this.infoFront = infoFront;
    }

    public Long getInfoDec() {
        return infoDec;
    }

    public void setInfoDec(Long infoDec) {
        this.infoDec = infoDec;
    }
}