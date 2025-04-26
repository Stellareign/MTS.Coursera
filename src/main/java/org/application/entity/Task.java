package org.application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.application.enums.Group;
import org.application.enums.TaskType;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private int id;
    private TaskType taskType;
    private String title;
    private String description;
    private LocalDate createDate;
    private String author;
    private LocalDate updateDate;
    private String updateAuthor;
    private LocalDate deleteDate;
    private String deleteAuthor;
    private String textContent;
    private String videoContent;
    private String docContent;
    private String audioContent;
    private List<Group> groups;
    private List<Course>courses;
    private String chat;

    //*************************************************************
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(title, task.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
