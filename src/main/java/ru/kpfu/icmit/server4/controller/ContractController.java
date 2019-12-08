package ru.kpfu.icmit.server4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.icmit.server4.model.Contract;
import ru.kpfu.icmit.server4.service.ContractService;

@Controller
@RequestMapping("/contract")
public class ContractController extends AbstractController<Contract, ContractService> {

    protected ContractController(ContractService service) {
        super(service);
    }
}
