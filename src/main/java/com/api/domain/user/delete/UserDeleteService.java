package com.api.domain.user.delete;

import com.api.domain.entity.User;
import com.api.domain.repository.UserRepository;
import com.api.domain.service.CreateService;
import com.api.domain.service.DeleteOneService;
import com.api.domain.service.DeleteService;
import java.time.OffsetDateTime;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class UserDeleteService implements DeleteOneService<UserDeleteResponse> {

  private final UserRepository userRepository;

  @Override
  public UserDeleteResponse execute(Long id) {
    userRepository.delete(id);
    return UserDeleteResponse.response();
  }
}
