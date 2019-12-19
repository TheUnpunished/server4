package ru.kpfu.icmit.server4.util.soap.lists;

import lombok.NoArgsConstructor;
import ru.kpfu.icmit.server4.model.Offer;
import ru.kpfu.icmit.server4.util.soap.XmlList;

import java.util.List;

@NoArgsConstructor
public class OfferList extends XmlList<Offer> {

    public OfferList(List<Offer> list){
        super(list);
    }
}
