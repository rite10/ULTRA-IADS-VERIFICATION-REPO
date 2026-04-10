package com.nit.winch.controller;

import com.nit.winch.model.WinchStatusModel;
import com.nit.winch.service.WinchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/winch")
public class WinchServiceController {

    WinchServiceImpl winchService;

    @Autowired
    WinchServiceController( WinchServiceImpl winchService){
        this.winchService=winchService;
    }
    @PostMapping("/save")
    public WinchStatusModel save(@RequestBody WinchStatusModel status){
        return winchService.saveWinchStatusData(status);
    }
}
