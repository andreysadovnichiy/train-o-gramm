package model.db;

import lombok.Data;
import services.HasLikeNotificationRecipients;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Data
public class Post implements HasLikeNotificationRecipients {
    private Picture pic;
    private User author;
    private int likes;
    private LocalDate pubDate;
    private List<Comment> comments;

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public List<User> getLikeNotificationRecipients() {
        return Collections.singletonList(getAuthor());
    }
}
