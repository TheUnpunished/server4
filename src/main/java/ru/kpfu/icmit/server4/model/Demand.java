package ru.kpfu.icmit.server4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Demand {
    private Long id;
    private Nomenclature nomenclature;
    private Integer count;
}
