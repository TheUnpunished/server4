package ru.kpfu.icmit.server4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.icmit.server4.model.soap.Content;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NomenclatureList extends Content {

    @XmlElementWrapper(name = "nomenclatures")
    @XmlElement(name = "nomenclature")
    private List<Nomenclature> nomenclatureList;


}
