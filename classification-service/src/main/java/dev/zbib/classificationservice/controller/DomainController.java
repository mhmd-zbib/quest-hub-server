package dev.zbib.classificationservice.controller;

import dev.zbib.classificationservice.model.request.DomainRequest;
import dev.zbib.classificationservice.service.DomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domain")
@RequiredArgsConstructor
public class DomainController {

    private final DomainService domainService;

    @PostMapping
    public ResponseEntity<String> createDomain(@RequestBody DomainRequest domainRequest) {
        domainService.createDomain(domainRequest);
        return ResponseEntity.ok("Domain created");
    }
}
