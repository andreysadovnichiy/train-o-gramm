package services.facades;

import model.db.Comment;
import model.db.Post;

public interface CommentsFacade {

    void addComment(Post post, Comment comment);
}
