package com.jump.pojo;

public class Lead {
    private Integer leadId;

    private String leadName;

    private Integer leadParentid;

    private String leadUrl;

    public Integer getLeadId() {
        return leadId;
    }

    public void setLeadId(Integer leadId) {
        this.leadId = leadId;
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName == null ? null : leadName.trim();
    }

    public Integer getLeadParentid() {
        return leadParentid;
    }

    public void setLeadParentid(Integer leadParentid) {
        this.leadParentid = leadParentid;
    }

    public String getLeadUrl() {
        return leadUrl;
    }

    public void setLeadUrl(String leadUrl) {
        this.leadUrl = leadUrl == null ? null : leadUrl.trim();
    }
}