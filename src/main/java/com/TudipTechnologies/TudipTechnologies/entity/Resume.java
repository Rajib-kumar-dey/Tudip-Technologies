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
@Table(name = "Resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

        private int resumeId;
        private int applicantId;
        private byte[] resumeFile;
        private Date dateCreated;

    }


