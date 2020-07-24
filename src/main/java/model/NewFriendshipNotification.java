package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import model.db.User;

@Data
@AllArgsConstructor
public class NewFriendshipNotification {
    private User owner;
    private User newFriend;
}
