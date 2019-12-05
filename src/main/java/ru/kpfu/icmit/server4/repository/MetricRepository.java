package ru.kpfu.icmit.server4.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kpfu.icmit.server4.model.Metric;

public interface MetricRepository extends CrudRepository<Metric, Long> {
}
