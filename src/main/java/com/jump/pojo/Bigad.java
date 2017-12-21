package com.jump.pojo;

public class Bigad {
    private Integer bigadId;

    private String bigadPic;

    private Integer bigadFront;

    public Integer getBigadId() {
        return bigadId;
    }

    public void setBigadId(Integer bigadId) {
        this.bigadId = bigadId;
    }

    public String getBigadPic() {
        return bigadPic;
    }

    public void setBigadPic(String bigadPic) {
        this.bigadPic = bigadPic == null ? null : bigadPic.trim();
    }

    public Integer getBigadFront() {
        return bigadFront;
    }

    public void setBigadFront(Integer bigadFront) {
        this.bigadFront = bigadFront;
    }
}