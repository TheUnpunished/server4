package ru.kpfu.icmit.server4.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kpfu.icmit.server4.model.Contract;

public interface ContractRepository extends CrudRepository<Contract, Long> {
}
