/**
 * 
 */
package io.qiot.manufacturing.datacenter.commons.domain.telemetry.production;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.influxdb.annotations.Column;
import com.influxdb.annotations.Measurement;

import io.qiot.manufacturing.all.commons.domain.production.ProductionChainStageEnum;
import io.qiot.manufacturing.datacenter.commons.domain.telemetry.AbstractProductionValidationTelemetryDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@Measurement(name = "production_stages")
@RegisterForReflection
@JsonPropertyOrder(value = { "instant", "factory_id", "machinery_id",
        "product_line_id", "item_id", "stage_id", "success" })
public class StageProductionValidationTelemetryDTO
        extends AbstractProductionValidationTelemetryDTO {

    @JsonProperty(value = "item_id")
    @Column(name = "item_id", tag = true)
    public int itemId;
    @JsonProperty(value = "stage_id")
    @Column(name = "stage_id", tag = true)
    public ProductionChainStageEnum stage;
    @JsonProperty(value = "success")
    @Column(name = "success")
    public boolean success;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("StageProductionValidationTelemetryDTO [productLineId=");
        builder.append(productLineId);
        builder.append(", machineryId=");
        builder.append(machineryId);
        builder.append(", factoryId=");
        builder.append(factoryId);
        builder.append(", time=");
        builder.append(time);
        builder.append(", itemId=");
        builder.append(itemId);
        builder.append(", stage=");
        builder.append(stage);
        builder.append(", success=");
        builder.append(success);
        builder.append("]");
        return builder.toString();
    }

}
