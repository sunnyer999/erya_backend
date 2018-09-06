package com.veritas.automation.microservices.track.helpcenter.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/7/2017
 * @version 1.0
 */
@Document(collection = "report_issue")
public class IssueEntity {
    private String title;
    private String comment;
    private String tag;
    private Date createTime = new Date();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
