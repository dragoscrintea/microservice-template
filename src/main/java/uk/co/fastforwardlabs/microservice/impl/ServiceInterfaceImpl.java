package uk.co.fastforwardlabs.microservice.impl;

import uk.co.fastforwardlabs.microservice.object.ServiceObject;
import uk.co.fastforwardlabs.microservice.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dragos on 19/02/2017.
 */
@Service
public class ServiceInterfaceImpl implements ServiceInterface {

    @Autowired
    private ServiceRepository repository;

    @Override
    public ServiceObject manifest(ServiceObject serviceObject) {
        return null;
    }

}
