package org.edu.ad.remote;

import org.edu.ad.dto.PromotionSpaceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "edu-ad", path = "/ad")
public interface AdRemoteService {

    @GetMapping("/space/getAllSpaces")
    List<PromotionSpaceDTO> getAllSpaces();

}
