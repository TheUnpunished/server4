package ru.kpfu.icmit.server4.service;

import ru.kpfu.icmit.server4.model.Demand;

import java.util.List;

public interface DemandService {
    List<Demand> getDemands();
    Demand addDemand(Demand demand);
    Demand updateDemand(Long id, Demand demand);
    void deleteDemand(Long id);
    Demand getDemand(Long id);
}
