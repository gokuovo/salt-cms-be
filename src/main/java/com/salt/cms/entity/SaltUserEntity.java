package com.salt.cms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@TableName("salt_user")
@Data
@EqualsAndHashCode(callSuper = false)
public class SaltUserEntity {
    private String user;
    private String password;
    private String noti;
}
