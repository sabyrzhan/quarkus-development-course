package kz.sabyr.quarkus.helloworl.service;

import io.quarkus.test.Mock;
import kz.sabyr.quarkus.service.MyService;

import javax.enterprise.context.ApplicationScoped;

@Mock
@ApplicationScoped
public class MockMyService implements MyService {
    @Override
    public String generateUUID() {
        return "1234";
    }
}
