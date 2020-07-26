package kz.sabyr.quarkus.helloworlkotlin.service

import io.quarkus.test.Mock
import javax.enterprise.context.ApplicationScoped

@Mock
@ApplicationScoped
class MockMyService: MyService {
    override fun generateUUID(): String {
        return "1234"
    }
}