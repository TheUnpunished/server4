package ru.kpfu.icmit.server4.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.icmit.server4.model.Nomenclature;
import ru.kpfu.icmit.server4.service.NomenctlatureService;
import ru.kpfu.icmit.server4.util.MyDateFormat;
import ru.kpfu.icmit.server4.util.soap.Body;
import ru.kpfu.icmit.server4.util.soap.Envelope;
import ru.kpfu.icmit.server4.util.soap.XmlList;
import ru.kpfu.icmit.server4.util.soap.lists.NomenclatureList;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;
import java.util.UUID;


@Controller
@RequestMapping("/nomenclature")
public class NomenclatureController extends AbstractController<Nomenclature, NomenctlatureService, NomenclatureList> {

    protected NomenclatureController(NomenctlatureService service) {
        super(service);
    }

    private final SimpleDateFormat dateFormat = MyDateFormat.format;


    @RequestMapping(value = "/getOneByUid", method = RequestMethod.POST, produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Envelope getOneByUid(@RequestBody String uid){
        Envelope envelope = new Envelope();
        Body body = new Body();
        try{
            UUID uuid = UUID.fromString(uid);
            Optional<Nomenclature> nomenclature = service.getByUid(uuid);
            if(nomenclature.isPresent()){
                body.setContent(nomenclature.get());
            }
        }
        catch (IllegalArgumentException | NullPointerException e){
            e.printStackTrace();
        }
        envelope.setBody(body);
        return envelope;
    }

    @RequestMapping(value = "/getAllByModifyDateAfter", method = RequestMethod.POST, produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Envelope getAllByModifyDateAfter(@RequestBody String dateAfter){
        Envelope envelope = new Envelope();
        Body body = new Body();
        NomenclatureList xmlList = new NomenclatureList();
        try {
            Timestamp timestamp = new Timestamp(MyDateFormat.format.parse(dateAfter).getTime());
            xmlList.setList(service.getAllByModifyDateAfter(timestamp));
            body.setContent(xmlList);
        }
        catch (NullPointerException | ParseException e){
            e.printStackTrace();
        }
        envelope.setBody(body);
        return envelope;
    }

    @Override
    @ResponseBody
    public Envelope add(@RequestBody Envelope envelope){
        if(envelope != null){
            Nomenclature nomenclature = (Nomenclature) envelope.getBody().getContent();
            nomenclature.setCreateDate(new Timestamp(System.currentTimeMillis()));
            nomenclature.setModifyDate(new Timestamp(System.currentTimeMillis()));
            nomenclature.setUid(UUID.randomUUID());
            while (service.getByUid(nomenclature.getUid()).isPresent()){
                nomenclature.setUid(UUID.randomUUID());
            }
            service.add(nomenclature);
            return envelope;
        }
        else {
            return new Envelope();
        }
    }
}
