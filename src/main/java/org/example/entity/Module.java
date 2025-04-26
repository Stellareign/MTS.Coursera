package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Module {
    private int id;
    private String name;
    private String description;
    LocalDate creationDate;
    private String author;
    LocalDate changeDate;
    private String changeAuthor;
    LocalDate deletionDate;
    private String deletionAuthor;

    //***********************************

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Module module = (Module) o;
        return id == module.id && Objects.equals(name, module.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
