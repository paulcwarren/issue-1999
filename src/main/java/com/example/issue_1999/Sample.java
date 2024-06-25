package com.example.issue_1999;

import org.springframework.content.commons.annotations.ContentId;
import org.springframework.content.commons.annotations.ContentLength;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document("Sample")
@Getter
@Setter
public class Sample {
    @Id
    private String id;
    @ContentId
    private String contentId;
    @ContentLength
    private long contentLength;
}