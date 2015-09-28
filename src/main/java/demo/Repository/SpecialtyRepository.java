package demo.Repository;


import demo.Model.Specialty;
import org.springframework.data.repository.PagingAndSortingRepository;
//Esta es la interfaz que respresenta el repositorio que nos permitirá actuar con las entidades
// para que sean mantenidas en la BBDD
//extends=herencia
public interface SpecialtyRepository extends PagingAndSortingRepository<Specialty,Long>{}
