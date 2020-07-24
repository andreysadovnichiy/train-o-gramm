package services.facades;

import model.db.User;

public interface Friendshipfacade {

    void addToFriends(User user, User newFriend);
}
