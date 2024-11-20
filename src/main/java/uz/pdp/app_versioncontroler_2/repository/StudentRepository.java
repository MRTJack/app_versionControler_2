package uz.pdp.app_versioncontroler_2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.app_versioncontroler_2.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Page<Student> findAllByGroup_Faculty_UniversityId(Integer universityId, Pageable pageable);
}



