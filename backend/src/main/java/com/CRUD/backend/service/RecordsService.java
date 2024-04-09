package com.CRUD.backend.service;

import com.CRUD.backend.dto.GymRecordDTO;
import com.CRUD.backend.entities.GymRecord;
import com.CRUD.backend.exceptions.AppException;
import com.CRUD.backend.mappers.GymRecordMapper;
import com.CRUD.backend.repository.GymRecordsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RecordsService {
    private final GymRecordsRepository gymRecordsRepository;
    private final GymRecordMapper gymRecordMapper;

    public List<GymRecordDTO> allRecords() {

        return gymRecordMapper.toGymRecordDTOS(gymRecordsRepository.findAll());
    }

    public GymRecordDTO createGymRecords(GymRecordDTO gymRecordDTO) {
        GymRecord gymRecord = gymRecordMapper.toGymRecord(gymRecordDTO);
        GymRecord createdGymRecord = gymRecordsRepository.save(gymRecord);
        return gymRecordMapper.toGymRecordDTO(createdGymRecord);
    }

    public GymRecordDTO deleteGymRecord(Long id) {
        GymRecord gymRecord = gymRecordsRepository.findById(id)
                .orElseThrow(() -> new AppException("Gym status doesn't found", HttpStatus.NOT_FOUND));
        GymRecordDTO gymRecordDTO = gymRecordMapper.toGymRecordDTO(gymRecord);
        gymRecordsRepository.deleteById(id);
        return  gymRecordDTO;
    }


    public GymRecordDTO putGymRecord(Long id,GymRecordDTO gymRecordDTO) {
        GymRecord gymRecord = gymRecordsRepository.findById(id)
                .orElseThrow(() -> new AppException("Gym status doesn't found", HttpStatus.NOT_FOUND));

        gymRecordMapper.putGymRecord(gymRecord,gymRecordDTO);

        GymRecord savedGymRecord = gymRecordsRepository.save(gymRecord);

        return gymRecordMapper.toGymRecordDTO(savedGymRecord);
    }

}
