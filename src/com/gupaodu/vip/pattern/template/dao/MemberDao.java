package com.gupaodu.vip.pattern.template.dao;

import com.gupaodu.vip.pattern.template.JdbcTemplate;
import com.gupaodu.vip.pattern.template.RowMapper;
import com.gupaodu.vip.pattern.template.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 创建人：zhj
 * 时间： 2018/5/24
 */
public class MemberDao  {
    //不继承，为了解耦
    private JdbcTemplate JdbcTemplate=new JdbcTemplate(null);


    public List<?>query() throws Exception {
        String sql="select * from t_member ";
        return JdbcTemplate.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                        Member menber=new Member();
                        menber.setUsername(rs.getString("username"));
                        menber.setPassword(rs.getString("password"));
                        menber.setAddr(rs.getString("addr"));
                        return menber;
            }
        },null);
    }
}
