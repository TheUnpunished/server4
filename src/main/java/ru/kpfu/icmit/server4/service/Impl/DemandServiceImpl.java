package ru.kpfu.icmit.server4.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.kpfu.icmit.server4.model.Demand;
import ru.kpfu.icmit.server4.repository.DemandRepository;
import ru.kpfu.icmit.server4.service.DemandService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DemandServiceImpl implements DemandService {

    @Autowired
    private DemandRepository demandRepository;

    @Override
    public List<Demand> getDemands() {
        return StreamSupport
                .stream(demandRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Demand addDemand(Demand demand) {
        return demandRepository.save(demand);
    }

    @Override
    public Demand updateDemand(Demand demand) {
        return demandRepository.save(demand);
    }

    @Override
    public void deleteDemand(Demand demand) {
        demandRepository.delete(demand);
    }

    @Override
    public Demand getDemandById(Long id) {
        return demandRepository.findById(id).get();
    }
}
