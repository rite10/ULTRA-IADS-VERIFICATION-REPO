package com.nit.winch.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Winch_Status")
@Data
public class WinchStatusModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serialNumber;
    private boolean ppcConnectionStatus;
    private Integer towDepthZero;
    private Long elapasedTime;
    private Integer scope;
    private Long cableTension;
    private boolean winchStatus;
    private Integer discreteStatus;

}
 