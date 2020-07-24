package services.impl;

import dao.FriendshipDao;
import model.db.Friendship;
import model.db.User;
import services.FriendshipService;

public class FriendshipServiceImpl implements FriendshipService {
    private FriendshipDao friendshipDao;

    @Override
    public void addToFriends(User owner, User newFriend) {
        friendshipDao.save(new Friendship(owner, newFriend));

        friendshipDao.save(new Friendship(newFriend, owner));
    }
}
