package academy.devdojo.youtube.course.endpoint.service;

import academy.devdojo.youtube.course.CourseApplication;
import academy.devdojo.youtube.course.model.Course;
import academy.devdojo.youtube.course.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

//

@Service
@Slf4j
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {

	private CourseRepository courseRepository; // original final 

	public Iterable<Course> list(Pageable pageable) {
		log.info("Listing all courses");
		return courseRepository.findAll(pageable);
	}
}

//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//@RequiredArgsConstructor