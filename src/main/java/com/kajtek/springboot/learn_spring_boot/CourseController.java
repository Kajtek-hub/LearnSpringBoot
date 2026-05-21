package com.kajtek.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	
	
	@RequestMapping("/players")
	public List<Player> retriveAllCourses(){
		
		return Arrays.asList(
				
				new Player(1, "Fernando Torres", "ST"),
				new Player(2, "Eberechi Eze", "CAM"),
				new Player(3, "Bukayo Saka", "RW"),
				new Player(4, "Gervinho", "LW")
				);
	}
}
