package ru.kpfu.icmit.server4.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.icmit.server4.model.Contract;
import ru.kpfu.icmit.server4.repository.ContractRepository;
import ru.kpfu.icmit.server4.service.ContractService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractRepository contractRepository;

    @Override
    public List<Contract> getContracts() {
        return StreamSupport
                .stream(contractRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Contract addContract(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public Contract updateContract(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public void deleteContract(Contract contract) {
        contractRepository.delete(contract);
    }

    @Override
    public Contract getContractById(Long id) {
        return contractRepository.findById(id).get();
    }
}
