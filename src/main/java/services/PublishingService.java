package services;

import model.db.Picture;
import model.db.Post;
import model.db.User;

public interface PublishingService {

    Post publishPost(User author, Picture picture);
}
