package services.impl;

import dao.LikeDao;
import model.db.Like;
import model.db.Post;
import model.db.User;
import services.LikeService;

public class LikeServiceImpl implements LikeService {
    private LikeDao likeDao;

    @Override
    public void likePost(Post post, User whoLikes) {
        likeDao.save(new Like(post, whoLikes));
    }
}
