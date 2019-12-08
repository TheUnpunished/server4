package ru.kpfu.icmit.server4.controller;

import org.springframework.web.bind.annotation.*;
import ru.kpfu.icmit.server4.model.BaseEntity;
import ru.kpfu.icmit.server4.util.soap.Envelope;

public interface GenericController<T extends BaseEntity> {

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public Envelope getAll();

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Envelope delete(@RequestBody Envelope envelope);

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Envelope add(@RequestBody Envelope envelope);

    @RequestMapping(value = "/getOneById", method = RequestMethod.GET)
    @ResponseBody
    public Envelope getOneById(@RequestParam(name = "id", defaultValue = "-1") String id);

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    @ResponseBody
    public Envelope update(@RequestBody Envelope envelope);

}
