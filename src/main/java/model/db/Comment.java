package model.db;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    private User author;
    private String text;
    private LocalDateTime pubDate;
}
