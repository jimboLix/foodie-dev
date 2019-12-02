package com.jimbolix.mapper.basic;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Auther: ruihui.li
 * @Date: 2019/12/2 20:04
 * @Description:
 */
public interface BasicMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
