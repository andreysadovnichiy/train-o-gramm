package services;

import model.db.User;

public interface FriendshipService {

    void addToFriends(User user, User newFriend);
}
