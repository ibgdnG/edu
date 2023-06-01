package com.edu.ad.remote;

import com.edu.ad.service.IPromotionSpaceService;
import edu.common.ConvertUtil;
import org.edu.ad.dto.PromotionSpaceDTO;
import org.edu.ad.remote.AdRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ad")
public class AdRemoteServiceImpl implements AdRemoteService {

    @Autowired
    private IPromotionSpaceService promotionSpaceService;

    @Override
    @GetMapping("/space/getAllSpaces")
    public List<PromotionSpaceDTO> getAllSpaces() {
        return ConvertUtil.convertList(promotionSpaceService.list(), PromotionSpaceDTO.class);
    }
}
