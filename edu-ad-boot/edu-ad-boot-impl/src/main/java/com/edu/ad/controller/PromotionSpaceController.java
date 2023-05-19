package com.edu.ad.controller;


import com.edu.ad.entity.PromotionSpace;
import com.edu.ad.service.IPromotionSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ice
 * @since 2023-05-19
 */
@RestController
@RequestMapping("/ad/space")
public class PromotionSpaceController {

    @Autowired
    private IPromotionSpaceService promotionSpaceService;

    @RequestMapping("/getAllSpaces")
    public List<PromotionSpace> getAllSpaces() {
        return promotionSpaceService.list();
    }

}
