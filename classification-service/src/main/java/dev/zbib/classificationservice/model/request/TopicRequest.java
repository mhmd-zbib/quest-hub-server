package dev.zbib.classificationservice.model.request;

import lombok.Getter;

@Getter
public class TopicRequest {

    private String name;
    private String description;
    private Long createdById;
    private Long fieldId;

}
