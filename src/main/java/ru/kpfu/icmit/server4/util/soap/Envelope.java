package ru.kpfu.icmit.server4.util.soap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Envelope {

    private Header header;
    private Body body;

    @Override
    public String toString() {
        return "Envelope{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}
