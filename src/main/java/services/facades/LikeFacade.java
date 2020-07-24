package services.facades;

import model.db.Post;
import model.db.User;

public interface LikeFacade {

    void likePost(Post post, User whoLikes);
}
