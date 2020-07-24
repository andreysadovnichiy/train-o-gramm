package services;

import model.db.User;

import java.util.List;

public interface HasLikeNotificationRecipients {

    List<User> getLikeNotificationRecipients();
}
