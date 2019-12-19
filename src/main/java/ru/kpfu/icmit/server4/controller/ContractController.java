package ru.kpfu.icmit.server4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.icmit.server4.model.Contract;
import ru.kpfu.icmit.server4.service.ContractService;
import ru.kpfu.icmit.server4.util.soap.lists.ContractList;

@RequestMapping("/contract")
public class ContractController extends AbstractController<Contract, ContractService, ContractList> {

    protected ContractController(ContractService service) {
        super(service);
    }
}
