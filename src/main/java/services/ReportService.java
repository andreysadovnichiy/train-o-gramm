package services;

import model.Report;
import model.db.User;

public interface ReportService {

    Report buildReport(User user);

    Report buildSponsoredReport(User user);
}
