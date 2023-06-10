package com.api.domain.repository;

import com.api.domain.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

  List<User> findAll();
}
