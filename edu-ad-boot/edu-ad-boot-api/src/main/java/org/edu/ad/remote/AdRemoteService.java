package org.edu.ad.remote;

import org.edu.ad.dto.PromotionSpaceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "edu-ad", path = "/ad")
public interface AdRemoteService {

    @GetMapping("/space/getAllSpaces")
    List<PromotionSpaceDTO> getAllSpaces();

    /**
     * 通过位置获取广告信息
     *
     * @param spaceKeys 位置信息
     * @return List<PromotionSpaceDTO>
     */
    @GetMapping("/getAdBySpaceKey")
    List<PromotionSpaceDTO> getAdBySpaceKey(@RequestParam("spaceKey") String[] spaceKeys);
}
