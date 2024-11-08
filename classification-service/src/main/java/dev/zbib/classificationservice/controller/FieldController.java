package dev.zbib.classificationservice.controller;

import dev.zbib.classificationservice.model.request.FieldRequest;
import dev.zbib.classificationservice.service.FieldService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/field")
@RestController
@RequiredArgsConstructor
public class FieldController {

    private final FieldService fieldService;

    @PostMapping
    public ResponseEntity<String> createField(@RequestBody FieldRequest fieldRequest) {
        fieldService.createField(fieldRequest);
        return ResponseEntity.ok("Field created");
    }

}

