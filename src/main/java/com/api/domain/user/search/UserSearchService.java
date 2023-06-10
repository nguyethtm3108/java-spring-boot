package com.api.domain.user.search;

import com.api.domain.entity.User;
import com.api.domain.repository.UserRepository;
import com.api.domain.service.SearchService;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserSearchService
    implements SearchService<UserSearchRequest, UserSearchResponse> {

  private final UserRepository userRepository;

  @Override
  public List<UserSearchResponse> execute(UserSearchRequest request) {
    List<User> listUser = userRepository.findAll();
    return listUser.stream().map(UserSearchResponse::of).toList();
  }
}
