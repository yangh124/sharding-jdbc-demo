package com.yh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : yh
 * @date : 2021/2/8 20:28
 */
@Data
@TableName("t_udict")
public class Udict implements Serializable {

    private static final long serialVersionUID = 2501797396786291613L;
    private Long udictId;

    private String ustatus;

    private String uvalue;
}
