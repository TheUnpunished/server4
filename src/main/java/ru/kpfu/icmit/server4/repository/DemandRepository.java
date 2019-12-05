package ru.kpfu.icmit.server4.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kpfu.icmit.server4.model.Demand;

public interface DemandRepository extends CrudRepository<Demand, Long> {
}
