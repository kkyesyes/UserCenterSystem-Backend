package com.kk.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author SK
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 4452241387830383135L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}
