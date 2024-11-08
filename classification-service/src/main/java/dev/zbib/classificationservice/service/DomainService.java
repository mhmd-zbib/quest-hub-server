package dev.zbib.classificationservice.service;

import dev.zbib.classificationservice.model.entity.Domain;
import dev.zbib.classificationservice.model.request.DomainRequest;
import dev.zbib.classificationservice.repository.DomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DomainService {

    private final DomainRepository domainRepository;


    public void createDomain(DomainRequest request) {
        Domain domain = Domain.builder()
                .name(request.getName())
                .description(request.getDescription())
                .createdById(request.getCreatedById())
                .build();
        domainRepository.save(domain);
    }

    public void deleteDomain(Domain domain) {
        domainRepository.delete(domain);
    }

    public List<Domain> getAllDomains() {
        return domainRepository.findAll();
    }

    public Domain getDomainById(Long id) {
        return domainRepository.findById(id)
                .orElse(null);
    }

}


