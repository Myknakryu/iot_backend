package pl.myku.iot_backend;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface RestRepository extends CrudRepository<Meassurement, Long>{
    
}
