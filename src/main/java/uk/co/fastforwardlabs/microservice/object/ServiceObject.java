package uk.co.fastforwardlabs.microservice.object;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Dragos on 19/02/2017.
 */
public class ServiceObject implements Serializable {

    private static final long serialVersionUID = 1L;

    private String serviceName;
    private String serviceManifest;
    private UUID requestId;
    private long timestamp;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceManifest() {
        return serviceManifest;
    }

    public void setServiceManifest(String serviceManifest) {
        this.serviceManifest = serviceManifest;
    }

    public UUID getRequestId() {
        return requestId;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
