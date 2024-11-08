package dev.zbib.classificationservice.service;

import dev.zbib.classificationservice.model.entity.Domain;
import dev.zbib.classificationservice.model.entity.Field;
import dev.zbib.classificationservice.model.request.FieldRequest;
import dev.zbib.classificationservice.repository.FieldRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FieldService {

    private final FieldRepository fieldRepository;
    private final DomainService domainService;

    public void createField(FieldRequest request) {
        Domain domain = domainService.getDomainById(request.getDomainId());
        Field field = Field.builder()
                .name(request.getName())
                .domain(domain)
                .description(request.getDescription())
                .createdById(request.getCreatedById())
                .build();
        fieldRepository.save(field);
    }

    public Field getById(Long fieldId) {
        return fieldRepository.findById(fieldId)
                .orElse(null);
    }
}


