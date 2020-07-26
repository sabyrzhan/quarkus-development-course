package kz.sabyr.quarkus.helloworlkotlin.service.impl

import kz.sabyr.quarkus.helloworlkotlin.service.MyService
import java.util.*
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class MyServiceImpl: MyService {
    override fun generateUUID() = UUID.randomUUID().toString()
}