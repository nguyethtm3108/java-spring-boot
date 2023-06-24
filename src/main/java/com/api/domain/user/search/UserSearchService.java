package com.api.domain.user.search;

import com.api.domain.entity.User;
import com.api.domain.repository.UserRepository;
import com.api.domain.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import java.util.List;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserSearchService implements SearchService<UserSearchResponse> {

  private final UserRepository userRepository;

  @Override
  public List<UserSearchResponse> execute(String account, Integer page, Integer size) {
    List<User> listUser;
    if (page == null && size == null) {
      listUser = userRepository.findAll();
    } else {
      RowBounds rowBounds = new RowBounds(page, size);
      listUser = userRepository.search(rowBounds);
    }
    return listUser.stream().map(UserSearchResponse::of).toList();
  }
}
