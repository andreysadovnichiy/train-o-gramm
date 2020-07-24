package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import model.db.User;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LikeNotification extends CommentNotification {
    private User author;
    private User whoLikes;
}
