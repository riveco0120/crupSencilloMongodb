package com.sofkau.demoMongoDb.repository;

import com.sofkau.demoMongoDb.collections.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IEmpleadoRepository extends MongoRepository<Empleado,String> {
}
