package ru.kpfu.icmit.server4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.icmit.server4.model.Metric;
import ru.kpfu.icmit.server4.service.MetricService;

@Controller
@RequestMapping("/metric")
public class MetricController extends AbstractController<Metric, MetricService> {

    protected MetricController(MetricService service) {
        super(service);
    }
}
