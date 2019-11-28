package ru.kpfu.icmit.server4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.icmit.server4.model.soap.Content;

import java.sql.Date;
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
    private Date createDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    private Metric metric;
    private Boolean relevant;

    public Nomenclature(String productName, Metric metric) {
        this.uid = UUID.randomUUID();
        this.createDate = Date.valueOf(LocalDate.now());
        this.modifyDate = Date.valueOf(LocalDate.now());
        this.productName = productName;
        this.metric = metric;
        this.relevant = true;
    }
}
