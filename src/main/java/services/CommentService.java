package services;

import model.db.Comment;
import model.db.Post;

public interface CommentService {

    void addComment(Post post, Comment comment);
}
