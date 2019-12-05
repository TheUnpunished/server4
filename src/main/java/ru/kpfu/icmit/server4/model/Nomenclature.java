package ru.kpfu.icmit.server4.model;

import lombok.*;
import ru.kpfu.icmit.server4.model.soap.Content;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Nomenclature extends Content {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nomenclatureIdGenerator")
    @SequenceGenerator(name = "nomenclatureIdGenerator", sequenceName = "nomenclature_seq", allocationSize=1)
    private Long id;
    private UUID uid;
    private String productName;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp createDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp modifyDate;

    @ManyToOne
    @JoinColumn(name = "fk_nomenclature_metric")
    private Metric metric;
    private Boolean relevant;

    public Nomenclature(String productName, Metric metric) {
        this.uid = UUID.randomUUID();
        this.createDate = new Timestamp(System.currentTimeMillis());
        this.modifyDate = new Timestamp(System.currentTimeMillis());
        this.productName = productName;
        this.metric = metric;
        this.relevant = true;
    }
}
