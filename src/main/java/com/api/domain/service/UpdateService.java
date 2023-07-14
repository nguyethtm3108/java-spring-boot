package com.api.domain.service;

public interface UpdateService <S, T> {
  T execute(S request);
}
