package ru.kpfu.icmit.server4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.icmit.server4.model.Offer;
import ru.kpfu.icmit.server4.service.OfferService;
import ru.kpfu.icmit.server4.util.soap.lists.OfferList;

@RequestMapping("/offer")
public class OfferController extends AbstractController<Offer, OfferService, OfferList> {

    protected OfferController(OfferService service) {
        super(service);
    }
}
