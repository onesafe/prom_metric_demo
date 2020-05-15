package com.example.metric.demo.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyiping on 2020/5/15 12:28 PM.
 */
@RestController
@Slf4j
public class MetricController {

    @Autowired
    MeterRegistry registry;


    @GetMapping("/v1/metrics")
    public String getMetric() {

        Counter counter = Counter.builder("yoyo-check-now")
                .description("A simple counter")
                .tag("tag1", "a")
                .register(registry);
        counter.increment();

        log.info("get metrics request");
        return "request count is: " + counter.count();
    }

}
