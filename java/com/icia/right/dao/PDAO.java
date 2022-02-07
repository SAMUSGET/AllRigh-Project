package com.icia.right.dao;

import com.icia.right.dto.FAVORITE;
import com.icia.right.dto.PARKINGLOT;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PDAO {

    List<PARKINGLOT> pList();

    PARKINGLOT pView(String pCode);

    int pFavorite(FAVORITE favorite);

    PARKINGLOT pView2(String pName);
}
