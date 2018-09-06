package com.veritas.automation.microservices.track.helpcenter.service;

import com.veritas.automation.microservices.track.helpcenter.domain.IssueEntity;
import com.veritas.automation.microservices.track.helpcenter.repository.ReportIssueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/7/2017
 * @version 1.0
 */
@Service("reportIssueService")
public class ReportIssueService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ReportIssueRepository reportIssueRepository;

    @Autowired
    public ReportIssueService(ReportIssueRepository reportIssueRepository) {
        this.reportIssueRepository = reportIssueRepository;
    }


    public void postReportIssue(IssueEntity issueEntity) {
        try {
            reportIssueRepository.save(issueEntity);
        } catch (Exception e) {
            logger.error("", e);
        }
    }


    public List<IssueEntity> getIssueList() {
        List<IssueEntity> issuesList = new ArrayList<IssueEntity>();
        try {
            issuesList = reportIssueRepository.findAll();
        } catch (Exception e) {
            logger.error("", e);
        }
        return issuesList;
    }

}
