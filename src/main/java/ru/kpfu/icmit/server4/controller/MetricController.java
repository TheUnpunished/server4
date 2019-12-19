package ru.kpfu.icmit.server4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.icmit.server4.model.Metric;
import ru.kpfu.icmit.server4.service.MetricService;
import ru.kpfu.icmit.server4.util.soap.lists.MetricList;

@Controller
@RequestMapping("/metric")
public class MetricController extends AbstractController<Metric, MetricService, MetricList>{

    protected MetricController(MetricService service) {
        super(service);
    }

}
