package demo.Repository;

import demo.Model.Project;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Project,Long>{

}