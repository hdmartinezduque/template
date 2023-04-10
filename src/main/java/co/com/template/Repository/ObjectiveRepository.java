package co.com.template.Repository;

import java.util.List;

import co.com.template.Repository.Domain.ObjTypeObjDto;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.template.Repository.Domain.ObjectiveDomain;


@Repository
/*
public interface ObjectiveRepository  extends CrudRepository<ObjectiveDomain, String> {

}
*/
public interface ObjectiveRepository extends JpaRepository<ObjectiveDomain, Long>{

	@Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.ObjTypeObjDto(" +
			"obj.objective_id"
			+ ", obj.objective_describe" +
			", obj.objective_objective_type_id" +
			", obj_type.objective_type_describe" +
			", obj.objective_user_id" +
			", obj.objective_status_id) "
	+ "FROM t_objective as obj RIGHT JOIN t_objective_type as obj_type")
	//List<ObjTypeObjDto> findById(@Param("objective_id") int Id );
	List<ObjTypeObjDto> fectObjTypeObjRightJoin();
}

