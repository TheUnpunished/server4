package ru.kpfu.icmit.server4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.icmit.server4.model.Nomenclature;
import ru.kpfu.icmit.server4.model.NomenclatureList;
import ru.kpfu.icmit.server4.model.soap.Body;
import ru.kpfu.icmit.server4.model.soap.Envelope;
import ru.kpfu.icmit.server4.service.Impl.NomenclatureServiceImpl;
import ru.kpfu.icmit.server4.service.NomenclatureService;
import ru.kpfu.icmit.server4.util.MyDateFormat;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class NomenclatureController {

    private SimpleDateFormat simpleDateFormat = MyDateFormat.format;

    @Autowired
    private NomenclatureService nomenclatureService;

    @RequestMapping(value = "/nomenclature/add", method = RequestMethod.POST)
    @ResponseBody
    public Envelope addNomenclature(@RequestBody Envelope envelope) {

        if (envelope != null) {
            Nomenclature nomenclature = (Nomenclature) envelope.getBody().getContent();
            nomenclature.setModifyDate(new Timestamp(System.currentTimeMillis()));
            nomenclature = nomenclatureService.addNomenclature(nomenclature);
            envelope.getBody().setContent(nomenclature);
        }
        return envelope;
    }

    @RequestMapping(value = "/nomenclature/getAll", method = RequestMethod.POST)
    @ResponseBody
    public Envelope addNomenclature(@RequestParam(name = "datefrom") String datefrom) {

        Timestamp timestamp = null;
        try {
            timestamp = new Timestamp(simpleDateFormat.
                    parse("2019-01-01T00:00:00.0+03:00").getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<Nomenclature> nomenclatures = nomenclatureService.getNomenclaturesByModifyDateAfter(timestamp);

        Envelope envelope = new Envelope();
        Body body = new Body();

        NomenclatureList nomenclatureList = new NomenclatureList(nomenclatures);
        body.setContent(nomenclatureList);
        envelope.setBody(body);

        return envelope;
    }

}