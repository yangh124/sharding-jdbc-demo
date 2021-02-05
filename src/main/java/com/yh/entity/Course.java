package com.yh.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author : yh
 * @date : 2021/2/5 13:39
 */
@Data
public class Course {

    /**
     * 主键
     */
    @TableId
    private Long cid;

    private String cname;

    private Long userId;

    private String cstatus;
}
