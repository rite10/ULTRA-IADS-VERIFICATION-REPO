package com.nit.winch.service;

import com.nit.winch.model.WinchStatusModel;
import com.nit.winch.repository.WinchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WinchServiceImpl implements WinchServiceInterface {

    WinchRepository winchRepository;

    @Autowired
    WinchServiceImpl(WinchRepository winchRepository){
          this.winchRepository= winchRepository;
    }

    @Override
    public WinchStatusModel saveWinchStatusData(WinchStatusModel statusModel){
        return winchRepository.save(statusModel);
    }
}
