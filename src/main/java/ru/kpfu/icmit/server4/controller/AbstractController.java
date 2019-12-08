package ru.kpfu.icmit.server4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import ru.kpfu.icmit.server4.model.BaseEntity;
import ru.kpfu.icmit.server4.service.CrudService;
import ru.kpfu.icmit.server4.util.soap.Body;
import ru.kpfu.icmit.server4.util.soap.Envelope;
import ru.kpfu.icmit.server4.util.soap.XmlList;

import java.util.List;
import java.util.Optional;

public class AbstractController<T extends BaseEntity, S extends CrudService<T>> implements GenericController<T>{

    protected final S service;


    @Autowired
    protected AbstractController(S service){
        this.service = service;
    }

    @Override
    public Envelope getAll() {
        Body body = new Body();
        Envelope envelope = new Envelope();
        List<T> list = service.getAll();
        XmlList<T> xmlList = new XmlList<>(list);
        body.setContent(xmlList);
        envelope.setBody(body);
        return envelope;
    }

    @Override
    public Envelope delete(Envelope envelope) {
        if(envelope != null){
            T item = (T) envelope.getBody().getContent();
            service.delete(item);
            return envelope;
        }
        else{
            return new Envelope();
        }
    }

    @Override
    public Envelope add(Envelope envelope) {
        if(envelope != null){
            T item = (T) envelope.getBody().getContent();
            service.add(item);
            return envelope;
        }
        else {
            return new Envelope();
        }
    }

    @Override
    public Envelope getOneById(String id) {
        Long idLong = Long.parseLong(id);
        Envelope envelope = new Envelope();
        Body body = new Body();
        if(idLong != -1){
            Optional<T> item = service.getOneById(idLong);
            if(item.isPresent()){
                body.setContent(item.get());
            }
        }
        envelope.setBody(body);
        return envelope;
    }

    @Override
    public Envelope update(Envelope envelope) {
        if(envelope != null){
            T item = (T) envelope.getBody().getContent();
            service.add(item);
            return envelope;
        }
        else {
            return new Envelope();
        }
    }
}
