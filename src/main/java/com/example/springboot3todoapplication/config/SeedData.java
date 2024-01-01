package com.example.springboot3todoapplication.config;

import com.example.springboot3todoapplication.models.StatusType;
import com.example.springboot3todoapplication.models.Todo;
import com.example.springboot3todoapplication.services.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SeedData implements CommandLineRunner {

    final TodoService todoService;

    @Override
    public void run(String... args) throws Exception {

        List<Todo> todos = todoService.getAll();
        if (todos.isEmpty()) {

            Todo todo1 = Todo.builder().description("todo 1 in backlog").status(StatusType.BACKLOG).build();
            Todo todo2 = Todo.builder().description("todo 2 in doing").status(StatusType.DOING).build();
            Todo todo3 = Todo.builder().description("todo 3 in done").status(StatusType.DONE).build();

            todoService.save(todo1);
            todoService.save(todo2);
            todoService.save(todo3);

        }

    }
}

