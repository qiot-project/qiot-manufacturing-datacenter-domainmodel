package io.qiot.manufacturing.datacenter.commons.domain.registration;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class MachineryCertificateRequest extends MachinerySubscriptionRequest {

    @JsonProperty(value = "machineryId")
    @NotNull
    public UUID machineryId;

}