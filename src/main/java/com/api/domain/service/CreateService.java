package com.api.domain.service;

public interface CreateService<S, T> {

  T execute(S request);
}
