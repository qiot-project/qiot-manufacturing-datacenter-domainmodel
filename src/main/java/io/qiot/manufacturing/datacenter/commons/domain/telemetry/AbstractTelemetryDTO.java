package io.qiot.manufacturing.datacenter.commons.domain.telemetry;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.influxdb.annotations.Column;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public abstract class AbstractTelemetryDTO {
    
    @JsonProperty(value = "instant")
    @Column(timestamp = true)
    public Instant time;
}
