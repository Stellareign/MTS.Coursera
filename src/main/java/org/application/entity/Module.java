package org.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
