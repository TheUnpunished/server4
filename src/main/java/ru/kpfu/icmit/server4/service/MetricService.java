package ru.kpfu.icmit.server4.service;

import ru.kpfu.icmit.server4.model.Metric;

import java.util.List;

public interface MetricService {
    List<Metric> getMetrics();
    Metric addMetric(Metric metric);
    Metric updateMetric(Long id, Metric metric);
    void deleteMetric(Long id);
    Metric getMetric(Long id);
}
