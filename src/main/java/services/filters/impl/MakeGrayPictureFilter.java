package services.filters.impl;

import model.db.Picture;
import services.filters.Filter;

public class MakeGrayPictureFilter implements Filter {

    public void apply(Picture picture) {
        System.out.println("Apply filter MakeGray");
    }
}
