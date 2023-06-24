package com.api.domain.service;

import java.util.List;

public interface SearchService<T> {

  List<T> execute(String name, Integer page, Integer size);
}
