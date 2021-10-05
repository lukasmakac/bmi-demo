package cz.metait.bmi.demo.repository

import cz.metait.bmi.demo.domain.entity.User
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import javax.persistence.EntityManager

@Repository
abstract class UserRepository(private val entityManager: EntityManager) : CrudRepository<User, Long> {
}