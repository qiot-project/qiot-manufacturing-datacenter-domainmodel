/**
 * 
 */
package io.qiot.manufacturing.datacenter.commons.domain.registration;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Object containing the certificates returned by the registration service
 * 
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class CertificateResponse {
    @JsonProperty("truststore")
    public String truststore;
    @JsonProperty("keystore")
    public String keystore;
}