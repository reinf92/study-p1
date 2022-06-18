package com.stc.studyp1.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("UserVO")
public class UserVO {

    private String userId;
    private String userPwd;
    private String userNm;
    private String userEml;
    private String userTelno;
}
