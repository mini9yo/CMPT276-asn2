package cmpt276.asn2.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    List<Student> findByName(String name);
    List<Student> findByUid(int uid);
}

// <Student, Integer> means that the repository will be working with Student objects 
// and the primary key (ID) of Student is an Integer
// This file lets us interact with the database using the Student class