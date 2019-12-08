package ru.kpfu.icmit.server4.service;

import org.springframework.stereotype.Service;
import ru.kpfu.icmit.server4.model.Contract;
import ru.kpfu.icmit.server4.repository.ContractRepository;

@Service
public class ContractService extends CrudServiceImpl<Contract, ContractRepository> {

    public ContractService(ContractRepository genericRepository) {
        super(genericRepository);
    }
}
