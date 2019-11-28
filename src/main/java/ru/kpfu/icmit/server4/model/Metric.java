package ru.kpfu.icmit.server4.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Metric {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nomenclatureIdGenerator")
    @SequenceGenerator(name = "nomenclatureIdGenerator", sequenceName = "nomenclature_seq", allocationSize=1)
    private Long id;
    private String code;
    private String metricName;
}
