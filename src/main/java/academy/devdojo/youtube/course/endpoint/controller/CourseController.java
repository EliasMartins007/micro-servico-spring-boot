package academy.devdojo.youtube.course.endpoint.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academy.devdojo.youtube.course.endpoint.service.CourseService;
import academy.devdojo.youtube.course.model.Course;

@RestController
@RequestMapping("v1/admin/course")
@Slf4j
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {
	private CourseService courseService;// original: final

	@GetMapping(produces = MediaType.ALL_VALUE) // original: (produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Iterable<Course>> list(Pageable pageable) {
		return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
	}

}
