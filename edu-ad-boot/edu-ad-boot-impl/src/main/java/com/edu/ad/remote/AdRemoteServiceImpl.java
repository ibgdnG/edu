package com.edu.ad.remote;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.edu.ad.entity.PromotionAd;
import com.edu.ad.entity.PromotionSpace;
import com.edu.ad.service.IPromotionAdService;
import com.edu.ad.service.IPromotionSpaceService;
import edu.common.ConvertUtil;
import org.edu.ad.dto.PromotionAdDTO;
import org.edu.ad.dto.PromotionSpaceDTO;
import org.edu.ad.remote.AdRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/ad")
public class AdRemoteServiceImpl implements AdRemoteService {

    @Autowired
    private IPromotionSpaceService promotionSpaceService;

    @Resource
    private IPromotionAdService promotionAdService;

    @Override
    @GetMapping("/space/getAllSpaces")
    public List<PromotionSpaceDTO> getAllSpaces() {
        return ConvertUtil.convertList(promotionSpaceService.list(), PromotionSpaceDTO.class);
    }

    /**
     * 通过位置获取广告信息
     *
     * @param spaceKeys 位置信息
     * @return List<PromotionSpaceDTO>
     */
    @Override
    @GetMapping("/getAdBySpaceKey")
    public List<PromotionSpaceDTO> getAdBySpaceKey(String[] spaceKeys) {

        List<PromotionSpaceDTO> promotionSpaceDTOList = new ArrayList<>();
        QueryWrapper<PromotionSpace> promotionSpaceQueryWrapper;
        QueryWrapper<PromotionAd> promotionAdQueryWrapper;
        PromotionSpace promotionSpace;

        for (String spaceKey : spaceKeys) {
            promotionSpaceQueryWrapper = new QueryWrapper<>();
            promotionSpaceQueryWrapper.eq("spaceKey", spaceKey);
            // 获取广告位对象
            promotionSpace = promotionSpaceService.getOne(promotionSpaceQueryWrapper);

            // 获取当前广告位对应的信息
            promotionAdQueryWrapper = new QueryWrapper<>();
            Date now = new Date();
            promotionAdQueryWrapper.eq("spaceId", promotionSpace.getId());
            promotionAdQueryWrapper.eq("status", 1);
            promotionAdQueryWrapper.lt("startTime", now);
            promotionAdQueryWrapper.gt("endTime", now);
            List<PromotionAd> promotionAdList = promotionAdService.list(promotionAdQueryWrapper);

            // 转化为 PromotionSpaceDTO 对象
            PromotionSpaceDTO promotionSpaceDTO = ConvertUtil.convert(promotionSpace, PromotionSpaceDTO.class);
            Objects.requireNonNull(promotionSpaceDTO).setPromotionAdDTOList(ConvertUtil.convertList(promotionAdList, PromotionAdDTO.class));
            promotionSpaceDTOList.add(promotionSpaceDTO);
        }
        return promotionSpaceDTOList;
    }
}
