package services;

import services.filters.Filter;
import model.db.Picture;

import java.util.List;

public interface PreparationService {

    void prepare(Picture source, List<Filter> filters);
}
