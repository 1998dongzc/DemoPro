package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

@Mapper
public interface TestMapper {

    @InsertProvider(type = sql.class,method = "insert")
    int insert(@Param("name")String name);

    @SelectProvider(type = sql.class,method = "selectById")
    User  selectById(@Param("id") Integer id);

    class sql {
        String tname = "test_tbl";

        public String insert() {
            return new SQL() {{
                INSERT_INTO(tname);
                VALUES("name", "#{name}");
            }}.toString();
        }

        public String selectById(){
            return new SQL(){{
                SELECT("*");
                FROM(tname);
                WHERE("id=#{id}");
            }}.toString();
        }
    }

}
