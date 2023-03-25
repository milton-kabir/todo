package com.example.application.endpoints;

import java.util.List;

import dev.hilla.Endpoint;
import lombok.RequiredArgsConstructor;

import com.example.application.Todo;
import com.example.application.TodoRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Endpoint
@AnonymousAllowed
@RequiredArgsConstructor
public class TodoEndpoints {
  private final TodoRepository todoRepository;

  public List<Todo> findAll() {
    return todoRepository.findAll();
  }

  public Todo add(String task) {
    return todoRepository.save(new Todo(task));
  }

  public Todo update(Todo todo) {
    return todoRepository.save(todo);
  }
}
