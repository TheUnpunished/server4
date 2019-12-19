package ru.kpfu.icmit.server4.util.soap.lists;

import lombok.NoArgsConstructor;
import ru.kpfu.icmit.server4.model.Metric;
import ru.kpfu.icmit.server4.util.soap.XmlList;

import java.util.List;

@NoArgsConstructor
public class MetricList extends XmlList<Metric> {

    public MetricList(List<Metric> list){
        super(list);
    }
}
