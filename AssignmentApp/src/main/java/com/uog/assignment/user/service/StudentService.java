package com.uog.assignment.user.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uog.assignment.user.entity.Student;
import com.uog.assignment.user.repository.CourseRepository;
import com.uog.assignment.user.repository.StudentRepository;

@SuppressWarnings("unused")
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private CourseRepository courseRepository;

	public Student saveStudent(Student student) {
		if(student.getStudentRollNumber().charAt(8)!='-') {
			throw new RuntimeException("InCorrect RollNumber Entered " + student.getStudentRollNumber());
		}
		return studentRepository.save(student);		
	}

	public List<Student> showAll(){
		return studentRepository.findAll();
	}

	public Student getById(int id) {
		return studentRepository.findById(id).orElse(null);
	}

	public Student Update(Student student) {
		Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
			existingStudent.setId(student.getId());
			existingStudent.setStudentCourse(student.getStudentCourse());
			existingStudent.setStudentName(student.getStudentName());
			existingStudent.setStudentRollNumber(student.getStudentRollNumber());
			existingStudent.setStudentSemester(student.getStudentSemester());
			return studentRepository.save(student);
	}

	public void deleteByUser(Student student) {
		studentRepository.delete(student);

	}
}
