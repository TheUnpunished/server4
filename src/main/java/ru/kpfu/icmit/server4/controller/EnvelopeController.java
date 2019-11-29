package ru.kpfu.icmit.server4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.icmit.server4.model.Nomenclature;
import ru.kpfu.icmit.server4.model.NomenclatureList;
import ru.kpfu.icmit.server4.model.soap.Body;
import ru.kpfu.icmit.server4.model.soap.Envelope;
import ru.kpfu.icmit.server4.service.NomenclatureService;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

@Controller
public class EnvelopeController {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SXXX");

    @Autowired
    private NomenclatureService nomenclatureService;

    @RequestMapping(value = "/addnomenclature", method = RequestMethod.POST)
    @ResponseBody
    public Envelope addNomenclature(@RequestBody Envelope envelope) {

        System.out.println("envelope: " + envelope);

        if (envelope != null) {
            Nomenclature nomenclature = (Nomenclature) envelope.getBody().getContent();

            nomenclature.setCreateDate(new Timestamp(System.currentTimeMillis()));
            nomenclature.setModifyDate(new Timestamp(System.currentTimeMillis()));
            nomenclature = nomenclatureService.save(nomenclature);
            envelope.getBody().setContent(nomenclature);
        }
        return envelope;
    }

    @RequestMapping(value = "/getnomenclature", method = RequestMethod.POST)
    @ResponseBody
    public Envelope addNomenclature(@RequestParam(name = "datefrom") String datefrom) {

        Date date = null;
        try {
            date = new Date(simpleDateFormat.
                    parse("2019-01-01T00:00:00.0+03:00").getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<Nomenclature> nomenclatures = nomenclatureService.getNomenclature(date);

        System.out.println("nomenclatures" + nomenclatures);

        Envelope envelope = new Envelope();
        Body body = new Body();

        NomenclatureList nomenclatureList = new NomenclatureList(nomenclatures);
        body.setContent(nomenclatureList);
        envelope.setBody(body);

        return envelope;
    }

}