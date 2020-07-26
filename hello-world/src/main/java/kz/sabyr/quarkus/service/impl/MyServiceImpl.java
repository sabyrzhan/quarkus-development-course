package kz.sabyr.quarkus.service.impl;

import kz.sabyr.quarkus.service.MyService;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class MyServiceImpl implements MyService {
    @Override
    public String generateUUID() {
        return UUID.randomUUID().toString();
    }
}
