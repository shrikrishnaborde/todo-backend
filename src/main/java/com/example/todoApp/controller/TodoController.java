package com.example.todoApp.controller;

import com.example.todoApp.model.Todo;
import com.example.todoApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "http://mysql-dem-bucket-shree.s3-website-ap-southeast-2.amazonaws.com")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getTodos(){
        return todoService.getTodoList();
    }
}
