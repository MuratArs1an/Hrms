package kodlama.oi.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.oi.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
