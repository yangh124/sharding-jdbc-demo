package com.yh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : yh
 * @date : 2021/2/8 19:51
 */
@TableName("t_user")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 7144504617009064003L;
    private Long userId;

    private String username;

    private String ustatus;
}
