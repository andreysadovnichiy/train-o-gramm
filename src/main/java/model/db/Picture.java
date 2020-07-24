package model.db;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Picture {
    private byte[] content;
    private LocalDateTime created;
}
