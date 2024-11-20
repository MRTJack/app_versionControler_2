package uz.pdp.app_versioncontroler_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.app_versioncontroler_2.entity.Student;
import uz.pdp.app_versioncontroler_2.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Create
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Read
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Update
    public Student updateStudent(Integer id, Student updatedStudent) {
        if (studentRepository.existsById(id)) {
            updatedStudent.setId(id);
            return studentRepository.save(updatedStudent);
        }
        return null;
    }

    // Delete
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}

