package com.api.domain.user.search;

import com.api.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSearchResponse {
  private Long id;
  private String firstName;
  private String lastName;
  private String account;
  private String phone;
  private String username;
  private Integer gender;

  public static UserSearchResponse of(User user) {
    return UserSearchResponse.builder()
        .id(user.getId())
        .username(user.getFirstName() + user.getLastName())
        .phone(user.getPhone())
        .gender(user.getGender())
//        .gender(user.getGender() == 1 ? 'Male' : 'Female')
        .build();
  }
}
