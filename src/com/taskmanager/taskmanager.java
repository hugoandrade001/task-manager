package com.taskmanager;

import java.util.List;

public class taskmanager {
    private List<task> tasks;

    public taskmanager(List<task> tasks) {
        this.tasks = tasks;
    }

    public List<task> getTasks() {
        return tasks;
    }

    public void setTasks(List<task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(task task) {
        tasks.add(task);
    }
    public void deleteTask(task task) {
        tasks.remove(task);
    }
    public void listTask(task task){
        for (task task1 : tasks) {
            System.out.println("Title: " + task.getTitle() + "Completed: " + task.getDescription());
        }
    }
}
