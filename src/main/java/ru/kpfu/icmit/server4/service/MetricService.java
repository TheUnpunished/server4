package ru.kpfu.icmit.server4.service;

import ru.kpfu.icmit.server4.model.Metric;

import java.util.List;

public interface MetricService {
    List<Metric> getMetrics();
    Metric addMetric(Metric metric);
    Metric updateMetric(Metric metric);
    void deleteMetric(Metric metric);
    Metric getMetricById(Long id);
}
