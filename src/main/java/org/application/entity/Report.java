package org.application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {
    private int id;
    private Course course;
    private int rateOfCourse;
    private List<User> users;
    private int  assessment;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return id == report.id && Objects.equals(course, report.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course);
    }
}
