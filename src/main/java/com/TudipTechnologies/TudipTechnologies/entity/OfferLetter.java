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
@Table(name = "OfferLetter")
public class OfferLetter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int offerId;
        private int jobId;
        private int applicantId;
        private Date offerDate;
        private double offerSalary;
        private boolean offerAccepted;
        private Date dateAccepted;

    }
