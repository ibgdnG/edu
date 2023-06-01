package org.edu.ad.controller;

import edu.common.ResponseDTO;
import org.edu.ad.remote.AdRemoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ad")
public class AdController {

    @Resource
    private AdRemoteService adRemoteService;

    @RequestMapping("/space/getAllSpaces")
    public ResponseDTO getAllSpaces() {
        return ResponseDTO.success(adRemoteService.getAllSpaces());
    }
}
