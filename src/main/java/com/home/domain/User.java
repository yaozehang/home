package com.home.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;

    private String name;

    private String password;

    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String updateBy;
}
