package io.qiot.manufacturing.datacenter.commons.domain.subscription;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class MachinerySubscriptionRequest extends ServerSubscriptionRequest {

    @JsonProperty(value = "factoryId")
    @NotNull
    public UUID factoryId;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MachinerySubscriptionRequest [factoryId=");
        builder.append(factoryId);
        builder.append(", serial=");
        builder.append(serial);
        builder.append(", name=");
        builder.append(name);
        builder.append(", keyStorePassword=");
        builder.append(keyStorePassword);
        builder.append("]");
        return builder.toString();
    }

    
}
