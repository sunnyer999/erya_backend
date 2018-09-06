package com.veritas.automation.microservices.track.helpcenter.web;

import com.veritas.automation.microservices.track.helpcenter.domain.IssueEntity;
import com.veritas.automation.microservices.track.helpcenter.service.ReportIssueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/7/2017
 * @version 1.0
 */
@RestController
public class ReportIssueController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final ReportIssueService reportIssueService;

    @Autowired
    public ReportIssueController(ReportIssueService reportIssueService) {
        this.reportIssueService = reportIssueService;
    }


    @PostMapping("/issue")
    public String postReportIssue(@RequestBody IssueEntity issueEntity) {
        try {
            reportIssueService.postReportIssue(issueEntity);
        } catch (Exception e) {
            log.error("Post IssueEntity Error", e);
        }
        return "success";
    }


    @GetMapping("/issues")
    public List<IssueEntity> getReportIssues() {
        List<IssueEntity> issueList = null;
        try {
            issueList = reportIssueService.getIssueList();
        } catch (Exception e) {
            log.error("", e);
        }

        return issueList;
    }

}
