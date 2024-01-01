package com.kk.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author SK
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -2644182422028248166L;

    private String userAccount;

    private String userPassword;
}
