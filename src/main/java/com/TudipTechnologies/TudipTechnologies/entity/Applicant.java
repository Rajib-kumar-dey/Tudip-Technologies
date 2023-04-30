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
@Table(name = "Applicant")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int applicantId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private int resumeId;
    private Date dateApplied;

}

