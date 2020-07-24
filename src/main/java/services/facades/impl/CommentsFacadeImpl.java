package services.facades.impl;

import services.facades.CommentsFacade;
import model.db.Comment;
import model.CommentNotification;
import model.db.Post;
import services.CommentService;
import services.NotificationService;

public class CommentsFacadeImpl implements CommentsFacade {
    private NotificationService notificationService;
    private CommentService commentService;

    @Override
    public void addComment(Post post, Comment comment) {
        commentService.addComment(post, comment);
        notificationService.sendNotification(new CommentNotification(post, comment));
    }
}
