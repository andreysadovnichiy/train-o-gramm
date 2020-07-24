package services.impl;

import model.db.Picture;
import model.db.Post;
import model.db.User;
import services.PostService;
import services.PublishingService;

import java.time.LocalDate;

public class PublishingServiceImpl implements PublishingService {
    private PostService postService;

    @Override
    public Post publishPost(User author, Picture picture) {
        Post newPost = new Post();
        newPost.setAuthor(author);
        newPost.setPic(picture);
        newPost.setPubDate(LocalDate.now());

        return postService.save(newPost);
    }
}
