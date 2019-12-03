package ru.kpfu.icmit.server4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.icmit.server4.model.soap.Content;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Demand extends Content {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "demandIdGenerator")
    @SequenceGenerator(name = "demandIdGenerator", sequenceName = "demand_seq", allocationSize = 1)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "fk_demand_nomenclature")
    private Nomenclature nomenclature;
    private Integer count;
}
