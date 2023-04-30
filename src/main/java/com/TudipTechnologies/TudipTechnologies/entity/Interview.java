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
@Table(name = "Interview")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int interviewId;
        private int jobId;
        private int applicantId;
        private Date interviewDate;
        private String interviewerName;
        private String interviewerEmail;
        private String interviewerPhoneNumber;

}
