package kodlama.oi.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.oi.hrms.business.abstracts.JobPostionService;
import kodlama.oi.hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.oi.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPostionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	
	@Override
	public List<JobPosition> getAll() {

		return this.jobPositionDao.findAll();
	}




}
