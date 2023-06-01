package org.edu.ad.dto;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author ice
 * @since 2023-05-19
 */
public class PromotionAdDTO {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 广告名
     */
    private String name;

    /**
     * 广告位id
     */
    private Integer spaceId;

    /**
     * 精确搜索关键词
     */
    private String keyword;

    /**
     * 静态广告的内容
     */
    private String htmlContent;

    /**
     * 文字
     */
    private String text;

    /**
     * 链接
     */
    private String link;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    /**
     * 优先级
     */
    private Integer priority;

    private String img;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSpaceId() {
        return spaceId;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public String getText() {
        return text;
    }

    public String getLink() {
        return link;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getPriority() {
        return priority;
    }

    public String getImg() {
        return img;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "PromotionAdDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", spaceId=" + spaceId +
                ", keyword='" + keyword + '\'' +
                ", htmlContent='" + htmlContent + '\'' +
                ", text='" + text + '\'' +
                ", link='" + link + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", priority=" + priority +
                ", img='" + img + '\'' +
                '}';
    }
}
