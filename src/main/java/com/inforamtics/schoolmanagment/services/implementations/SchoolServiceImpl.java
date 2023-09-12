package com.inforamtics.schoolmanagment.services.implementations;

import com.inforamtics.schoolmanagment.data.entity.School;
import com.inforamtics.schoolmanagment.data.entity.Teacher;
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

    @Override
    public School getSchool(long id) {
        return schoolRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid school id:"+ id));
    }

    @Override
    public School create(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public School updateSchool(long id, School school) {
        school.setId(id);
        return schoolRepository.save(school);
    }

    @Override
    public void deleteSchool(long id) {
        schoolRepository.deleteById(id);
    }

    @Override
    public List<School> getSchoolsByMaxNumberOfStudents(int maxNumberOfStudents) {
        return schoolRepository.findAllByMaxNumberOfStudents(maxNumberOfStudents);
    }

    @Override
    public List<School> getSchoolsByName(String name) {
        return schoolRepository.findAllByName(name);
    }

    @Override
    public List<School> getSchoolsByNameAndMaxNumberOfStudents(String name, int maxstudents) {
        return schoolRepository.findAllByNameAndMaxNumberOfStudents(name, maxstudents);
    }

    @Override
    public List<School> getAllHighSchools() {
        return schoolRepository.findAllHighSchools();
    }

    @Override
    public List<Teacher> getAllTeachersBySchoolId(long id) {
        School school = getSchool(id);
        return school.getTeachers();
    }
}
