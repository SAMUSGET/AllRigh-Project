package com.icia.right.dao;

import com.icia.right.dto.RESERVE;
import com.icia.right.dto.REVIEW;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RDAO {
    int pReserve(RESERVE RESERVE);

    List<RESERVE> rList(String rId);

    RESERVE rView(int rNo);

    int reWrite(REVIEW review);

    int minus(String rPcode);

    int rDelete(RESERVE reserve);
}
