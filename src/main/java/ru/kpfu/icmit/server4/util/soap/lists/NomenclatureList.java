package ru.kpfu.icmit.server4.util.soap.lists;

import lombok.NoArgsConstructor;
import ru.kpfu.icmit.server4.model.Nomenclature;
import ru.kpfu.icmit.server4.util.soap.XmlList;

import java.util.List;

@NoArgsConstructor
public class NomenclatureList extends XmlList<Nomenclature> {

    public NomenclatureList(List<Nomenclature> list){
        super(list);
    }
}
