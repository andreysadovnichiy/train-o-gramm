package services;

import model.db.Post;
import model.db.User;

import java.util.List;

public interface PostService {
    List<Post> findAll();

    List<Post> findAll(User user);

    List<Post> findRecommendations(User user);

    Post save(Post post);
}
