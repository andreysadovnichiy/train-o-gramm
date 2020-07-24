package services;

import model.db.Picture;
import model.db.User;
import services.filters.Filter;
import services.filters.impl.MakeGrayPictureFilter;
import services.filters.impl.RotateLeftPictureFilter;

import java.util.Arrays;
import java.util.List;

public class PreparationDelegate {
    private PreparationService preparationService;
    private PublishingService publishingService;

    public void runPreparation(User user, Picture picture) {
        List<Filter> filters = Arrays.asList(
                new MakeGrayPictureFilter(),
                new RotateLeftPictureFilter()
        );

        preparationService.prepare(picture, filters);
        publishingService.publishPost(user, picture);
    }
}
