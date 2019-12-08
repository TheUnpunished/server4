package ru.kpfu.icmit.server4.util.soap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlList<T> extends Content {

    @XmlElementWrapper(name = "items")
    @XmlElement(name = "item")
    private List<T> list;
}
