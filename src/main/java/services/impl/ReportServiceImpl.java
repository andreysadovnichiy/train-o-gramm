package services.impl;

import model.Report;
import model.ReportLine;
import model.db.User;
import services.PostService;
import services.ReportService;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ReportServiceImpl implements ReportService {
    private PostService postService;

    @Override
    public Report buildReport(User user) {
        List<ReportLine> reportLines = postService.findAll(user).stream()
                .map(post -> new ReportLine(post, post.getLikes()))
                .collect(toList());

        return new Report(reportLines);
    }

    @Override
    public Report buildSponsoredReport(User user) {

        return null;
    }
}
