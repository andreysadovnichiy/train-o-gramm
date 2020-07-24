package services;

import model.CommentNotification;
import model.LikeNotification;
import model.NewFriendshipNotification;

public interface NotificationService {

    void sendNotification(CommentNotification commentNotification);

    void sendNotification(NewFriendshipNotification newFriendshipNotification);

    void sendNotification(LikeNotification likeNotification);
}
