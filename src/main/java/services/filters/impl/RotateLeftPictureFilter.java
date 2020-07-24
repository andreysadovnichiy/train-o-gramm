package services.filters.impl;

import model.db.Picture;
import services.filters.Filter;

public class RotateLeftPictureFilter implements Filter {

    public void apply(Picture picture) {
        System.out.println("Apply filter RotateLeft");
    }
}
