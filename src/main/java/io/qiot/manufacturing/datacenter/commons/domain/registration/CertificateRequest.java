package io.qiot.manufacturing.datacenter.commons.domain.registration;

import java.util.UUID;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author mmascia
 * @author andreabattaglia
 */
@JsonPropertyOrder(value = { "id", "name", "domain", "serial",
        "keyStorePassword", "ac" })
@RegisterForReflection
public class CertificateRequest {

    @JsonProperty(value = "id")
    @NotNull
    public UUID id;
    @JsonProperty(value = "name")
    @NotNull
    @Pattern(regexp = "[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*")
    public String name;
    @JsonProperty(value = "domain")
    @NotNull
    public String domain;
    @JsonProperty(value = "serial")
    @NotNull
    public String serial;
    @JsonProperty(value = "keyStorePassword")
    @NotNull
    public String keyStorePassword;
    @JsonProperty(value = "ac", defaultValue = "false")
    @NotNull
    public boolean ac;

}