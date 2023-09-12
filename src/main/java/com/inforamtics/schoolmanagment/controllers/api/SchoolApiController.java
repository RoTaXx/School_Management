package com.inforamtics.schoolmanagment.controllers.api;

import com.inforamtics.schoolmanagment.data.entity.School;
import com.inforamtics.schoolmanagment.data.entity.Teacher;
import com.inforamtics.schoolmanagment.services.SchoolService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class SchoolApiController {

    private final SchoolService schoolService;

    @GetMapping(value = "/api/schools")
    public List<School> getSchools(){ return schoolService.getSchools();}

    @GetMapping("api/schools/{id}")
    public School getSchool(@PathVariable("id") long id){
        return schoolService.getSchool(id);
    }

    @PostMapping(value = "/api/schools")
    public School createSchool(@RequestBody School school) {
        return schoolService.create( school);
    }

    @PutMapping(value= "api/schools/{id}")
    public School updateSchool(@PathVariable("id") long id, @RequestBody School school){
        return schoolService.updateSchool(id, school);
    }

    @DeleteMapping(value = "api/school/{id}")
    public void deleteSchool(@PathVariable long id){
        schoolService.deleteSchool(id);
    }

    @GetMapping("/api/schools/max-students/{maxStudents}")
    public List<School> getSchoolsByMaxNumberOfStudents(@PathVariable int maxStudents) {
        return schoolService.getSchoolsByMaxNumberOfStudents(maxStudents);
    }

    @GetMapping("/api/schools/names/{name}")
    public List<School> getSchoolsByMaxNumberOfStudents(@PathVariable String name) {
        return schoolService.getSchoolsByName(name);
    }

    @GetMapping("/api/schools/names/{name}/max-students/{maxStudents}")
    public List<School> getSchoolsByMaxNumberOfStudents(@PathVariable String name, @PathVariable int maxStudents) {
        return schoolService.getSchoolsByNameAndMaxNumberOfStudents(name, maxStudents);
    }

    @GetMapping("/api/highschools")
    public List<School> getHighSchools() {
        return schoolService.getAllHighSchools();
    }

    @GetMapping("/api/schools/{id}/teachers")
    public List<Teacher> getSchoolTeachers(@PathVariable long id) {
        return schoolService.getAllTeachersBySchoolId(id);
    }
}
