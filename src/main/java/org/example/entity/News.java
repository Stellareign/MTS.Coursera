package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {
    private int id;
    private String title;
    private String description;
    private LocalDate createDate;
    private String newsAuthor;
    private String newsContent;
    private LocalDate updateDate;
    private String updateAuthor;

    //*********************************


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id == news.id && Objects.equals(title, news.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
