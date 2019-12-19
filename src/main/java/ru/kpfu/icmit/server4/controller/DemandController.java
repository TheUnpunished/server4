package ru.kpfu.icmit.server4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.icmit.server4.model.Demand;
import ru.kpfu.icmit.server4.service.DemandService;
import ru.kpfu.icmit.server4.util.soap.lists.DemandList;

@Controller
@RequestMapping("/demand")
public class DemandController extends AbstractController<Demand, DemandService, DemandList> {

    protected DemandController(DemandService service) {
        super(service);
    }

}
