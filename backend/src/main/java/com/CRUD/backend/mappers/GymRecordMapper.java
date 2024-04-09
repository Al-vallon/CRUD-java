package com.CRUD.backend.mappers;

import com.CRUD.backend.dto.GymRecordDTO;
import com.CRUD.backend.entities.GymRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


import java.util.List;

@Mapper(componentModel = "spring")

public interface GymRecordMapper {

    GymRecord toGymRecord(GymRecordDTO gymRecordDTO);

    GymRecordDTO toGymRecordDTO(GymRecord gymRecord);

    List<GymRecordDTO> toGymRecordDTOS(List<GymRecord> gymRecords);

    @Mapping(target="id", ignore= true)
void putGymRecord(@MappingTarget GymRecord gymRecord, GymRecordDTO gymRecordDTO);



}
