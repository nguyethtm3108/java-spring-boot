package com.api.domain.service;

public interface DeleteService<S, T> {
  T execute(S request);
}
