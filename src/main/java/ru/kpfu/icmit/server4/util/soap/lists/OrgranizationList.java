package ru.kpfu.icmit.server4.util.soap.lists;

import lombok.NoArgsConstructor;
import ru.kpfu.icmit.server4.model.Organization;
import ru.kpfu.icmit.server4.util.soap.XmlList;

import java.util.List;

@NoArgsConstructor
public class OrgranizationList extends XmlList<Organization> {

    public OrgranizationList(List<Organization> list){
        super(list);
    }
}
