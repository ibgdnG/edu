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
public class PromotionSpaceDTO {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 广告位key
     */
    private String spaceKey;

    private Date createTime;

    private Date updateTime;

    private Integer isDel;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpaceKey() {
        return spaceKey;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpaceKey(String spaceKey) {
        this.spaceKey = spaceKey;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "PromotionSpaceDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", spaceKey='" + spaceKey + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDel=" + isDel +
                '}';
    }
}
