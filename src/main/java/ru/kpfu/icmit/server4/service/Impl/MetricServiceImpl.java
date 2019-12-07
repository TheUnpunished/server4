package ru.kpfu.icmit.server4.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.kpfu.icmit.server4.model.Metric;
import ru.kpfu.icmit.server4.repository.MetricRepository;
import ru.kpfu.icmit.server4.service.MetricService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class MetricServiceImpl implements MetricService {

    @Autowired
    private MetricRepository metricRepository;

    @Override
    public List<Metric> getMetrics() {
        return StreamSupport
                .stream(metricRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Metric addMetric(Metric metric) {
        return metricRepository.save(metric);
    }

    @Override
    public Metric updateMetric(Metric metric) {
        return metricRepository.save(metric);
    }

    @Override
    public void deleteMetric(Metric metric) {
        metricRepository.delete(metric);
    }

    @Override
    public Metric getMetricById(Long id) {
        return metricRepository.findById(id).get();
    }
}
