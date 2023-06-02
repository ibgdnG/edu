package org.edu.ad.dto;

import java.util.Date;
import java.util.List;

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

    private List<PromotionAdDTO> promotionAdDTOList;

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

    public List<PromotionAdDTO> getPromotionAdDTOList() {
        return promotionAdDTOList;
    }

    public void setPromotionAdDTOList(List<PromotionAdDTO> promotionAdDTOList) {
        this.promotionAdDTOList = promotionAdDTOList;
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
                ", promotionAdDTOList=" + promotionAdDTOList +
                '}';
    }
}
