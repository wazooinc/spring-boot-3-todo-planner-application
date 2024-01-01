package com.example.springboot3todoapplication.services;

import com.example.springboot3todoapplication.models.StatusType;
import com.example.springboot3todoapplication.models.Todo;
import com.example.springboot3todoapplication.repositories.TodoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class TodoService {

    final TodoRepository todoRepository;

    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    public List<Todo> getAllByStatus(StatusType status) {
        return todoRepository.findByStatus(status);
    }

    public Todo getById(Long id) {
        return todoRepository.findById(id).orElseThrow();
    }

    public Todo save(Todo newTodo) {
        if (newTodo.getId() == null) {
            newTodo.setCreatedAt(LocalDateTime.now());
        }

        newTodo.setUpdatedAt(LocalDateTime.now());

        return todoRepository.save(newTodo);
    }
}
