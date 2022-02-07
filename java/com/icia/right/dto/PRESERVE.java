package com.icia.right.dto;


import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("preserve")
public class PRESERVE {
    private String rId;
    private String rVehicleNO;
    private String rTime;
    private String rPcode;
}
