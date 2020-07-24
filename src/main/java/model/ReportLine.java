package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import model.db.Post;

@Data
@AllArgsConstructor
public class ReportLine {

    private Post post;
    private int likesCount;
}
