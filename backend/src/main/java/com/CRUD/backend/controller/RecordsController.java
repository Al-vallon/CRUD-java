package com.CRUD.backend.controller;

import com.CRUD.backend.dto.GymRecordDTO;
import com.CRUD.backend.service.RecordsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor

public class RecordsController {

    private final RecordsService recordsService;

    @GetMapping("/gym/records")
    public ResponseEntity<List<GymRecordDTO>> allRecords() {
        return ResponseEntity.ok(recordsService.allRecords());
    }

    @PostMapping("/gym/records")
    public ResponseEntity<GymRecordDTO> createGymRecord(@RequestBody GymRecordDTO gymRecordDTO) {
        GymRecordDTO createdGymRecord = recordsService.createGymRecords(gymRecordDTO);
        return ResponseEntity.created(URI.create("/gym/records" + createdGymRecord.getId()))
                .body(createdGymRecord);
    }

    @DeleteMapping("/gym/records/{id}")
    public ResponseEntity<GymRecordDTO> deleteGymRecord(@PathVariable Long id) {
        return ResponseEntity.ok(recordsService.deleteGymRecord(id));
    }

    @PutMapping("/gym/records/{id}")
    public ResponseEntity<GymRecordDTO> updateGymRecord(@PathVariable Long id, @RequestBody GymRecordDTO gymRecordDTO) {
        return ResponseEntity.ok(recordsService.putGymRecord(id,gymRecordDTO));
    }



}
