package com.example.todoApp.service;

import com.example.todoApp.model.Todo;
import com.example.todoApp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getTodoList(){
        return todoRepository.findAll();
    }
}
