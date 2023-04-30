package com.TudipTechnologies.TudipTechnologies.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobId;
    private String jobTitle;
    private String jobDescription;
    private String department;
    private String location;
    private int experienceRequired;
    private String educationRequired;
    private double salaryRange;
    private Date datePosted;

}

