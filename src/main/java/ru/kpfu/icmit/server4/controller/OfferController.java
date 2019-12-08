package ru.kpfu.icmit.server4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.icmit.server4.model.Offer;
import ru.kpfu.icmit.server4.service.OfferService;

@Controller
@RequestMapping("/offer")
public class OfferController extends AbstractController<Offer, OfferService> {

    protected OfferController(OfferService service) {
        super(service);
    }
}
