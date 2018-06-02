package com.gupaodu.vip.pattern.template;

import java.sql.ResultSet;

/**
 * 创建人：zhj
 * 时间： 2018/5/24
 */
public interface RowMapper<T> {
    public T mapRow(ResultSet rs,int rowNum) throws Exception;
}
