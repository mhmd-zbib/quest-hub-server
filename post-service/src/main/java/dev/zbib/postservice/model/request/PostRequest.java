package dev.zbib.postservice.model.request;

import lombok.Getter;

@Getter
public class PostRequest {
    private String content;
    private Long userId;
    private Long domainId;
    private Long fieldId;
    private Long topicId;
}
