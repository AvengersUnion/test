package com.jump.pojo;

public class Honor {
    private Integer honorId;

    private String honorTitle;

    private String honorPic;

    private String honorSimple;

    private Integer honorFront;

    private Long honorDec;

    public Integer getHonorId() {
        return honorId;
    }

    public void setHonorId(Integer honorId) {
        this.honorId = honorId;
    }

    public String getHonorTitle() {
        return honorTitle;
    }

    public void setHonorTitle(String honorTitle) {
        this.honorTitle = honorTitle == null ? null : honorTitle.trim();
    }

    public String getHonorPic() {
        return honorPic;
    }

    public void setHonorPic(String honorPic) {
        this.honorPic = honorPic == null ? null : honorPic.trim();
    }

    public String getHonorSimple() {
        return honorSimple;
    }

    public void setHonorSimple(String honorSimple) {
        this.honorSimple = honorSimple == null ? null : honorSimple.trim();
    }

    public Integer getHonorFront() {
        return honorFront;
    }

    public void setHonorFront(Integer honorFront) {
        this.honorFront = honorFront;
    }

    public Long getHonorDec() {
        return honorDec;
    }

    public void setHonorDec(Long honorDec) {
        this.honorDec = honorDec;
    }
}