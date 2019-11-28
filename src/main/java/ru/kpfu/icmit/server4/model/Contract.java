package ru.kpfu.icmit.server4.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contract{
    private Long id;
    private Demand demand;
    private Offer offer;
    private Nomenclature nomenclature;
    private Organization demandingOrg;
    private Organization offeringOrg;
    private Integer totalCount;
    private Double totalPrice;
}
