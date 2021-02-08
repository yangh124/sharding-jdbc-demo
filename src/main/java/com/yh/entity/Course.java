package com.yh.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : yh
 * @date : 2021/2/5 13:39
 */
@Data
public class Course implements Serializable {

    private static final long serialVersionUID = 8668781712219573853L;
    /**
     * 主键
     */
    @TableId
    private Long cid;

    private String cname;

    private Long userId;

    private String cstatus;
}
