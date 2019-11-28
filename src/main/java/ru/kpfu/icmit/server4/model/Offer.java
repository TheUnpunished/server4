package ru.kpfu.icmit.server4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Offer{
    private Long id;
    private Nomenclature nomenclature;
    private Double price;
    private Integer count;
}
