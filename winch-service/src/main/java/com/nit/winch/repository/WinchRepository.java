package com.nit.winch.repository;

import com.nit.winch.model.WinchStatusModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WinchRepository extends JpaRepository<WinchStatusModel,Long> {

}
