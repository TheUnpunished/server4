package ru.kpfu.icmit.server4.util.soap.lists;

import lombok.NoArgsConstructor;
import ru.kpfu.icmit.server4.model.Contract;
import ru.kpfu.icmit.server4.util.soap.XmlList;

import java.util.List;

@NoArgsConstructor
public class ContractList extends XmlList<Contract> {

    public ContractList(List<Contract> list){
        super(list);
    }

}
