/**
 * 
 */
package io.qiot.manufacturing.datacenter.commons.exception.telemetry;

/**
 * @author andreabattaglia
 *
 */
public class TelemetryDataValidationException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -3144177074083191396L;

    public TelemetryDataValidationException() {
        super();
    }

    public TelemetryDataValidationException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public TelemetryDataValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public TelemetryDataValidationException(String message) {
        super(message);
    }

    public TelemetryDataValidationException(Throwable cause) {
        super(cause);
    }

}
