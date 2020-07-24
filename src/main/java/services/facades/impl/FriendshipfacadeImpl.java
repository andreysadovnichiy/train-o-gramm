package services.facades.impl;

import lombok.AllArgsConstructor;
import model.NewFriendshipNotification;
import model.db.User;
import services.FriendshipService;
import services.NotificationService;
import services.facades.Friendshipfacade;

@AllArgsConstructor
public class FriendshipfacadeImpl implements Friendshipfacade {
    private FriendshipService friendshipService;
    private NotificationService notificationService;

    @Override
    public void addToFriends(User owner, User newFriend) {
        friendshipService.addToFriends(owner, newFriend);
        notificationService.sendNotification(new NewFriendshipNotification(owner, newFriend));
    }
}
