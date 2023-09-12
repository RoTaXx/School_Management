package com.inforamtics.schoolmanagment.data.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "school")
public class School extends BaseEntity{

    private String name;

    private int maxNumberOfStudents;

    private boolean isHighSchool;

    @OneToMany(mappedBy = "school")
    @JsonIgnoreProperties("school")
    private List<Teacher> teachers;
}
