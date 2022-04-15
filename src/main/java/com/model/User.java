package com.model;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
* TODO
*
* @author chenfan
* @since 1.0.0 2022/4/13 19:50
*/
@Data
@TableName(value = "t_user")
@AllArgsConstructor
public class User {
    @TableField(value = "t_id")
    private Integer tId;

    @TableField(value = "t_name")
    private String tName;

    @TableField(value = "t_age")
    private Integer tAge;
}