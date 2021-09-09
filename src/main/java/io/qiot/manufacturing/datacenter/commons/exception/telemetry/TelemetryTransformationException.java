/**
 * 
 */
package io.qiot.manufacturing.datacenter.commons.exception.telemetry;

/**
 * @author andreabattaglia
 *
 */
public class TelemetryTransformationException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -5248957993429594556L;

    public TelemetryTransformationException() {
        super();
    }

    public TelemetryTransformationException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public TelemetryTransformationException(String message, Throwable cause) {
        super(message, cause);
    }

    public TelemetryTransformationException(String message) {
        super(message);
    }

    public TelemetryTransformationException(Throwable cause) {
        super(cause);
    }

}
