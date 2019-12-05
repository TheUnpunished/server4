package ru.kpfu.icmit.server4.service;

import ru.kpfu.icmit.server4.model.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> getContracts();
    Contract addContract(Contract contract);
    Contract updateContract(Long id, Contract contract);
    void deleteContract(Long id);
    Contract getContract(Long id);
}
