/**
 * 
 */
package io.qiot.manufacturing.datacenter.commons.domain.events;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.influxdb.annotations.Column;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Root object for all factory event related DTOs
 * 
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public abstract class AbstractFactoryTelemetryDTO extends AbstractTelemetryDTO {

    @JsonProperty(value = "factory_id")
    @Column(name = "factory_id", tag = true)
    public UUID factoryId;
}
