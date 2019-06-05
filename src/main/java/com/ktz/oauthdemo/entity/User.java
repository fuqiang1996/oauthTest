package com.ktz.oauthdemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class User implements Serializable{
    private Long id; //编号
    private String username; //用户名
    private String password; //密码
    private String salt; //加密密码的盐
}
