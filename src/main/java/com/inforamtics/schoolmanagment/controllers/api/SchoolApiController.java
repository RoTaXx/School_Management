package com.inforamtics.schoolmanagment.controllers.api;

import com.inforamtics.schoolmanagment.data.entity.School;
import com.inforamtics.schoolmanagment.services.SchoolService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SchoolApiController {

    private final SchoolService schoolService;

    @GetMapping(value = "/api/schools")
    public List<School> getSchools(){ return schoolService.getSchools();}
}
