package ru.kpfu.icmit.server4.util.soap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.icmit.server4.model.*;
import ru.kpfu.icmit.server4.util.soap.lists.*;

import javax.xml.bind.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Body {

    @XmlElements(value = {
            @XmlElement(name = "nomenclature", type = Nomenclature.class),
            @XmlElement(name = "contract", type = Contract.class),
            @XmlElement(name = "demand", type = Demand.class),
            @XmlElement(name = "metric", type = Metric.class),
            @XmlElement(name = "offer", type = Offer.class),
            @XmlElement(name = "organization", type = Organization.class),
            @XmlElement(name = "nomenclatures", type = NomenclatureList.class),
            @XmlElement(name = "contracts", type = ContractList.class),
            @XmlElement(name = "demands", type = DemandList.class),
            @XmlElement(name = "metrics", type = MetricList.class),
            @XmlElement(name = "offers", type = Offer.class),
            @XmlElement(name = "organizations", type = OrgranizationList.class)
    })

    private Content content;


    @Override
    public String toString() {
        return "Body{" +
                "content=" + content +
                '}';
    }
}
