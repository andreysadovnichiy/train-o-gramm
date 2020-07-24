package services.impl;

import model.db.Comment;
import model.db.Post;
import services.CommentService;

public class CommentServiceImpl implements CommentService {

    @Override
    public void addComment(Post post, Comment comment) {
        post.addComment(comment);
    }
}
