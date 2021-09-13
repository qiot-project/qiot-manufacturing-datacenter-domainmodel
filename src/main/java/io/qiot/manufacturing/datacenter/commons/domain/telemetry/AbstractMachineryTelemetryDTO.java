package io.qiot.manufacturing.datacenter.commons.domain.telemetry;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.influxdb.annotations.Column;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Root object for all machinery event related DTOs
 * 
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public abstract class AbstractMachineryTelemetryDTO
        extends AbstractFactoryTelemetryDTO {

    @JsonProperty(value = "machinery_id")
    @Column(name = "machinery_id", tag = true)
    public UUID machineryId;
}
