package ru.kpfu.icmit.server4.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.icmit.server4.model.BaseEntity;
import ru.kpfu.icmit.server4.util.soap.Envelope;

import java.awt.*;

public interface GenericController<T extends BaseEntity> {

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Envelope getAll();

    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Envelope delete(@RequestBody Envelope envelope);

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Envelope add(@RequestBody Envelope envelope);

    @RequestMapping(value = "/getOneById", method = RequestMethod.GET, produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Envelope getOneById(@RequestParam(name = "id", defaultValue = "0") String id);

    @RequestMapping(value = "/get", method = RequestMethod.POST, produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Envelope update(@RequestBody Envelope envelope);

}
