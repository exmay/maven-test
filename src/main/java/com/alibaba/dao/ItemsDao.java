package com.alibaba.dao;

import com.alibaba.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao {
    @Select("select * from items where id = #{id}")
    Items findByID(Integer id);
}
