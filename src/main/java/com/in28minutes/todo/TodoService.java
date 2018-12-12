package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>(); 
	static {
		todos.add(new Todo("Learn Web Application Development", "study"));
		todos.add(new Todo("Learn Spring MVC", "study"));
		todos.add(new Todo("Learn Spring Rest Services", "study"));
	}
	
	public List<Todo> retrieveTodos() {
		return todos;
	}
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	public void deleteTodo(String todo, String category) {
		todos.remove(new Todo(todo, category));
	}
}
