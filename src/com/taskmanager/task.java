package com.taskmanager;

import java.time.LocalDate;

public class task {
    private String title;
    private String description;
    private String status; // true for completed, false for pending
    private LocalDate dueDate;

    public task(String title, String description, String status, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public void markAsComplete() {
        this.status = "Concluída"; // Corrigido para 'Concluída'
    }
    public void editTask(String newTitle, String newDescription, String newStatus, LocalDate newDueDate) {
        if (newTitle != null && !newTitle.isEmpty()) {
            this.title = newTitle;
        }
        if (newDescription != null && !newDescription.isEmpty()) {
            this.description = newDescription;
        }
        if (newStatus != null && !newStatus.isEmpty()) {
            this.status = newStatus;
        }
        if (newDueDate != null) {
            this.dueDate = newDueDate;
        }
    }
}
