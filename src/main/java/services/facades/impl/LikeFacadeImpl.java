package services.facades.impl;

import model.LikeNotification;
import model.db.Post;
import model.db.User;
import services.LikeService;
import services.NotificationService;
import services.facades.LikeFacade;

public class LikeFacadeImpl implements LikeFacade {
    private LikeService likeService;
    private NotificationService notificationService;

    @Override
    public void likePost(Post post, User whoLikes) {
        likeService.likePost(post, whoLikes);

        for (User recipient : post.getLikeNotificationRecipients()) {
            notificationService.sendNotification(new LikeNotification(recipient, whoLikes));
        }

    }
}
