package com.example.springboot3todoapplication.controllers;

import com.example.springboot3todoapplication.models.StatusType;
import com.example.springboot3todoapplication.models.Todo;
import com.example.springboot3todoapplication.services.TodoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class TodoFormController {

    final TodoService todoService;

    @PostMapping("/todos/new")
    public String createTodoItem(@Valid Todo newTodo) {

        newTodo.setStatus(StatusType.BACKLOG);

        todoService.save(newTodo);
        return "redirect:/";
    }
}
