package com.inforamtics.schoolmanagment.services.implementations;

import com.inforamtics.schoolmanagment.data.entity.School;
import com.inforamtics.schoolmanagment.data.repository.SchoolRepository;
import com.inforamtics.schoolmanagment.services.SchoolService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Override
    public List<School> getSchools() {
        return schoolRepository.findAll();
    }
}
