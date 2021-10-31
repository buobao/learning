package com.turman.learning.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
