package ru.kpfu.icmit.server4.util.soap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.icmit.server4.model.*;
import ru.kpfu.icmit.server4.util.soap.lists.NomenclatureList;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlList<T> extends Content {
    @XmlElements(value = {
            @XmlElement(name = "nomenclature", type = Nomenclature.class),
            @XmlElement(name = "contract", type = Contract.class),
            @XmlElement(name = "demand", type = Demand.class),
            @XmlElement(name = "metric", type = Metric.class),
            @XmlElement(name = "offer", type = Offer.class),
            @XmlElement(name = "organization", type = Organization.class)
    })
    List <T> list;

    public static XmlList fromList(List list){
        return new XmlList(list);
    }
}
