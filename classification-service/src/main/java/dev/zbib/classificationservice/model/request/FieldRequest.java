package dev.zbib.classificationservice.model.request;

import lombok.Getter;

@Getter
public class FieldRequest {
    private String name;
    private String description;
    private Long createdById;
    private Long domainId;
}
