package com.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
* TODO
*
* @author chenfan
* @since 1.0.0 2022/4/13 19:50
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selectByAll(User user);

}