package com.icia.right.dao;

import com.icia.right.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MDAO {
    int mJoin(MEMBER member);

    String idOverlap(String mId);

    MEMBER mLogin(MEMBER member);

    int qWrite(QUESTION question);


    MEMBER mView(String mId);

    QUESTION mqView(int qNo);

    List<QUESTION> mqList(String qId);

    int mModify(MEMBER member);

    int mDelete(String mId);

    List<FAVORITE> mfList(String fId);

    int mfDelete(FAVORITE favorite);

    List<PARKINGLOT> plist();

    List<REVIEW> revList(String reId);

    REVIEW revView(int reNo);

    int qModify(QUESTION question);

    int qDelete(int qNo);

    int reModify(REVIEW review);

    int reDelete(REVIEW review);

    List<EXPIRATION> eList(String eId);

    EXPIRATION eView(int eNo);
}
