package services.impl;

import services.filters.Filter;
import model.db.Picture;
import services.PreparationService;

import java.util.List;

public class PreparationServiceImpl implements PreparationService {

    @Override
    public void prepare(Picture source, List<Filter> filters) {
        for (Filter filter : filters) {
            filter.apply(source);
        }
    }
}
