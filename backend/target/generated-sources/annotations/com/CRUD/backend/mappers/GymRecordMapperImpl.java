package com.CRUD.backend.mappers;

import com.CRUD.backend.dto.GymRecordDTO;
import com.CRUD.backend.entities.GymRecord;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-08T14:36:56+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Amazon.com Inc.)"
)
@Component
public class GymRecordMapperImpl implements GymRecordMapper {

    @Override
    public GymRecord toGymRecord(GymRecordDTO gymRecordDTO) {
        if ( gymRecordDTO == null ) {
            return null;
        }

        GymRecord gymRecord = new GymRecord();

        gymRecord.setId( gymRecordDTO.getId() );
        gymRecord.setExercise( gymRecordDTO.getExercise() );
        gymRecord.setWeight( gymRecordDTO.getWeight() );

        return gymRecord;
    }

    @Override
    public GymRecordDTO toGymRecordDTO(GymRecord gymRecord) {
        if ( gymRecord == null ) {
            return null;
        }

        GymRecordDTO gymRecordDTO = new GymRecordDTO();

        gymRecordDTO.setId( gymRecord.getId() );
        gymRecordDTO.setExercise( gymRecord.getExercise() );
        gymRecordDTO.setWeight( gymRecord.getWeight() );

        return gymRecordDTO;
    }

    @Override
    public List<GymRecordDTO> toGymRecordDTOS(List<GymRecord> gymRecords) {
        if ( gymRecords == null ) {
            return null;
        }

        List<GymRecordDTO> list = new ArrayList<GymRecordDTO>( gymRecords.size() );
        for ( GymRecord gymRecord : gymRecords ) {
            list.add( toGymRecordDTO( gymRecord ) );
        }

        return list;
    }
}
