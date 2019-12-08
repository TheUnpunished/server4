package ru.kpfu.icmit.server4.service;

import org.springframework.stereotype.Service;
import ru.kpfu.icmit.server4.model.Demand;
import ru.kpfu.icmit.server4.repository.DemandRepository;

@Service
public class DemandService extends CrudServiceImpl<Demand, DemandRepository> {

    public DemandService(DemandRepository genericRepository) {
        super(genericRepository);
    }
}
