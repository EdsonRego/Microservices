package com.edsonrego.springcloud.msvc.cursos.msvc.repositories;

import com.edsonrego.springcloud.msvc.cursos.msvc.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
