package ru.kpfu.icmit.server4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.icmit.server4.model.Organization;
import ru.kpfu.icmit.server4.service.OrganizationService;
import ru.kpfu.icmit.server4.util.soap.lists.OrgranizationList;

@RequestMapping("/organization")
public class OrganizationController extends AbstractController<Organization, OrganizationService, OrgranizationList> {

    protected OrganizationController(OrganizationService service) {
        super(service);
    }

}
