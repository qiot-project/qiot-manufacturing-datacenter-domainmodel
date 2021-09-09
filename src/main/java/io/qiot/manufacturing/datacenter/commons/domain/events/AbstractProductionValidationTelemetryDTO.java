/**
 * 
 */
package io.qiot.manufacturing.datacenter.commons.domain.events;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.influxdb.annotations.Column;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * 
 * Root object for all production validation telemetry related DTOs
 * 
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public abstract class AbstractProductionValidationTelemetryDTO
        extends AbstractMachineryTelemetryDTO {

    @JsonProperty(value = "product_line_id")
    @Column(name = "product_line_id", tag = true)
    public UUID productLineId;
}
