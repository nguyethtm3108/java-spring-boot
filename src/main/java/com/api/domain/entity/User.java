package com.api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class User {
  private Long id;
  private String firstName;
  private String lastName;
  private String account;
  private String phone;
  private Integer gender;
}
