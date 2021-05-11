package kodlama.oi.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.oi.hrms.business.abstracts.JobPostionService;
import kodlama.oi.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobposition")
public class JobPositionController {
	
	private JobPostionService jobPositionService;

	@Autowired
	public JobPositionController(JobPostionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition>getAll(){
		return this.jobPositionService.getAll();
	}
	

}
