package ru.kpfu.icmit.server4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.icmit.server4.model.Organization;
import ru.kpfu.icmit.server4.service.OrganizationService;

@Controller
@RequestMapping("/organization")
public class OrganizationController extends AbstractController<Organization, OrganizationService> {

    protected OrganizationController(OrganizationService service) {
        super(service);
    }
}
