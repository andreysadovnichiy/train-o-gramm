package services;

import model.db.Post;
import model.db.User;

public interface LikeService {

    void likePost(Post post, User whoLikes);
}
