package services.filters;

import model.db.Picture;

public interface Filter {

    void apply(Picture picture);
}
