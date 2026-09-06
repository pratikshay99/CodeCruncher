package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

    public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartment(String department);
}
/**
 absolutely required — your whole service depends on it.
 The one extra line findByDepartment(String department) → Not required, because no service method calls it currently. It's just sitting there unused
 save(entity) — insert or update
 findById(id) — get one by id
 findAll() — get all
 existsById(id) — check if exists
 deleteById(id) — delete by id
 count() — total rows

 ** Create / Update :
 save(entity) — insert if new, update if already exists (decided by whether the ID is null)
 saveAll(iterable) — save a list of entities in one call

 ** Read :
 findById(id) — get one by id, returns Optional<T>
 findAll() — get all rows
 findAllById(iterableOfIds) — get multiple specific rows by their ids
 findAll(Sort sort) — get all rows, sorted by a given field
 findAll(Pageable pageable) — get rows page by page (pagination)

 ** Check :
 existsById(id) — true/false, check if a row exists
 count() — total number of rows in the table

 ** Delete :
 deleteById(id) — delete one row by id
 delete(entity) — delete using the entity object itself
 deleteAll() — delete every row in the table
 deleteAllById(iterableOfIds) — delete multiple rows by their ids
 */