package com.nowcoder.Dao;

import org.apache.ibatis.annotations.Insert;
import com.nowcoder.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    @Insert({"insert into tb_user (name,password,salt,head_url) values(#{name},#{password},#{salt},#{headUrl})"})

    int addUser(User user);


}
