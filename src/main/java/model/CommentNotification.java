package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.db.Comment;
import model.db.Post;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentNotification {
    private Post post;
    private Comment comment;
}
