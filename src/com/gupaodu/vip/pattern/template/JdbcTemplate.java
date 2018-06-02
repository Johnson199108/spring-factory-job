package com.gupaodu.vip.pattern.template;

import com.gupaodu.vip.pattern.template.entity.Member;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 创建人：zhj
 * 时间： 2018/5/24
 */
public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private Connection getConnection() throws Exception{
        return this.dataSource.getConnection();
    }

    private PreparedStatement CreatePreparedStatement(Connection conn,String sql) throws Exception{
        return conn.prepareStatement(sql);
    }

    private ResultSet executeQuery(PreparedStatement pstmt, Object[] values) throws SQLException {
        for(int i=0;i<values.length;i++){
            pstmt.setObject(i,values[i]);
        }
        return pstmt.executeQuery();
    }

    private void closeStatment(Statement stmt) throws Exception{
        stmt.close();
    }

    private void closeResultSet(ResultSet rs) throws Exception{
        rs.close();
    }

    private void closeConnection(Connection conn) throws Exception{
        //通常把它放到连接器回收
    }

    private List<?> parseResultSet(ResultSet rs,RowMapper rowMapper)throws Exception{
        List<Object> result=new ArrayList<Object>();
        int rowNum=1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum++));
        }
        return result;
    }

    public List<?> executeQuery(String sql,RowMapper<?> rowMapper, Object[] values) throws Exception {
        //获取连接
        Connection conn = this.getConnection();
        //创建语句集
        PreparedStatement pstmt = this.CreatePreparedStatement(conn,sql);
        //执行语句集，并且获取结果集
        ResultSet rs = this.executeQuery(pstmt,values);
        //解析结果集
        List<?> result = this.parseResultSet(rs, rowMapper);

        //关闭结果集
        this.closeResultSet(rs);
        //关闭语句集
        this.closeStatment(pstmt);
        //关闭连接
        this.closeConnection(conn);
        return result;
    }

    //public abstract Object processResult(ResultSet rs,int rowNum) throws SQLException;
}
