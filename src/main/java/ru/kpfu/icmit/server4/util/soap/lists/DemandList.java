package ru.kpfu.icmit.server4.util.soap.lists;

import lombok.NoArgsConstructor;
import ru.kpfu.icmit.server4.model.Demand;
import ru.kpfu.icmit.server4.util.soap.XmlList;

import java.util.List;

@NoArgsConstructor
public class DemandList extends XmlList<Demand> {

    public DemandList(List<Demand> list){
        super(list);
    }
}
