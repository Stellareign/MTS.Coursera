package org.application.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    LocalDate creationDate;
    private String createAuthor;
    LocalDate updateDate;
    private String updateAuthor;
    LocalDate deletionDate;
    private String deletionAuthor;
    private String textContent;
    private String videoContent;
    private String docContent;
    private String audioContent;
    private List<Task> tasks;

    //************************************

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Theme theme = (Theme) o;
        return id == theme.id && Objects.equals(title, theme.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
