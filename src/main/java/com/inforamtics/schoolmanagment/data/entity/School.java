package com.inforamtics.schoolmanagment.data.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "school")
public class School extends BaseEntity{

    private String name;

    private int maxNumberOFStudents;
}
