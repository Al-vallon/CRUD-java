package com.CRUD.backend.mappers;

import com.CRUD.backend.dto.GymRecordDTO;
import com.CRUD.backend.entities.GymRecord;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface GymRecordMapper {
    GymRecord toGymRecord(GymRecordDTO gymRecordDTO);

    GymRecordDTO toGymRecordDTO(GymRecord gymRecord);

    List<GymRecordDTO> toGymRecordDTOS(List<GymRecord> gymRecords);
}
