package com.stephen.learning.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: jack
 * @Date: 2018/11/3 11:12
 * @Description:
 */
@Data
@Builder
public class User implements Serializable {
    private String name;
    private String sex;
    private String email;
    private int age;
}
