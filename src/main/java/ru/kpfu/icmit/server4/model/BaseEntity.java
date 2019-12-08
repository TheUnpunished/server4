package ru.kpfu.icmit.server4.model;

import lombok.Data;
import ru.kpfu.icmit.server4.util.soap.Content;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.io.Serializable;

@MappedSuperclass
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class BaseEntity extends Content {

}
