package cn.keepingthepiggy.dataModel;

import java.util.Date;

public class NodeInfo {
    private String nodeId;

    private Integer urzid;

    private Integer classify;

    private String preNodeId;

    private String nextNodeId;

    private Integer tier;

    private String title;

    private String tag;

    private String pictureUrl;

    private String multimediaUrl;

    private String fileUrl;

    private Date createTime;

    private Date updateTime;

    private Integer visibility;

    private String readableUrzid;

    private String excludeUrzid;

    private Integer delete;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public Integer getUrzid() {
        return urzid;
    }

    public void setUrzid(Integer urzid) {
        this.urzid = urzid;
    }

    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    public String getPreNodeId() {
        return preNodeId;
    }

    public void setPreNodeId(String preNodeId) {
        this.preNodeId = preNodeId == null ? null : preNodeId.trim();
    }

    public String getNextNodeId() {
        return nextNodeId;
    }

    public void setNextNodeId(String nextNodeId) {
        this.nextNodeId = nextNodeId == null ? null : nextNodeId.trim();
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public String getMultimediaUrl() {
        return multimediaUrl;
    }

    public void setMultimediaUrl(String multimediaUrl) {
        this.multimediaUrl = multimediaUrl == null ? null : multimediaUrl.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public String getReadableUrzid() {
        return readableUrzid;
    }

    public void setReadableUrzid(String readableUrzid) {
        this.readableUrzid = readableUrzid == null ? null : readableUrzid.trim();
    }

    public String getExcludeUrzid() {
        return excludeUrzid;
    }

    public void setExcludeUrzid(String excludeUrzid) {
        this.excludeUrzid = excludeUrzid == null ? null : excludeUrzid.trim();
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}