package dev.zbib.classificationservice.model.request;

import lombok.Getter;

@Getter
public class DomainRequest {
    private String name;
    private String description;
    private Long createdById;
}
