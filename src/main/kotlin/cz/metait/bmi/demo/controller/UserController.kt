package cz.metait.bmi.demo.controller

import cz.metait.bmi.demo.domain.entity.User
import cz.metait.bmi.demo.repository.UserRepository
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/user")
class UserController (private val userRepository: UserRepository) {

    @Get(uri="/", produces=["application/json"])
    fun getUsers(): MutableIterable<User> {
        return userRepository.findAll();
    }

    @Get(uri="/{id}", produces=["application/json"])
    fun getUsers(@PathVariable id: Long): MutableIterable<User> {
        return userRepository.findAll();
    }

}