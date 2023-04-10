package co.com.template.Repository.Domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
//import javax.persistence.OneToMany;
//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="t_objective")

public class ObjectiveDomain implements Serializable {
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private static final long serialVersionUID = 5022341805021141326L;
	//private int id;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	@Column(name="objective_id")
	private int objective_id;
	
	@Column(name="objective_describe") 
	private String objective_describe;
	
	@Column(name="objective_objective_type_id")
	private int objective_objective_type_id;
	
	@Column(name="objective_user_id") 
	private int objective_user_id;
	
	@Column(name="objective_grupo_id") 
	private int objective_grupo_id;
	
	@Column(name="objective_status_id") 
	private int objective_status_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "objective_objective_type_id", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private objective_type t_objective_type;

	public int getId() {
		return objective_id;
	}


	public void setId(int objective_id) {
		this.objective_id = objective_id;
	}
	
	public String getObjective_describe() {
		return objective_describe;
	}


	public void setObjective_describe(String objective_describe) {
		this.objective_describe = objective_describe;
	}


	public int getObjective_objective_type_id() {
		return objective_objective_type_id;
	}


	//public void setObjective_objective_type_id(int objective_objective_type_id) {
	//	this.objective_objective_type_id = objective_objective_type_id;
	//}


	public int getObjective_user_id() {
		return objective_user_id;
	}


	public void setObjective_user_id(int objective_user_id) {
		this.objective_user_id = objective_user_id;
	}


	public int getObjective_grupo_id() {
		return objective_grupo_id;
	}


	public void setObjective_grupo_id(int objective_grupo_id) {
		this.objective_grupo_id = objective_grupo_id;
	}


	public int getObjective_status_id() {
		return objective_status_id;
	}


	public void setObjective_status_id(int objective_status_id) {
		this.objective_status_id = objective_status_id;
	}
	
	public ObjectiveDomain() {
		super();
	}


	@Override
	public String toString() {
		return "ObjectiveDomain[objective_id=" + objective_id
				+ "objective_describe=" + objective_describe 
				+", objective_objective_type_id = " + objective_objective_type_id 
				+ ", objective_user_id="+ objective_user_id 
				+", objective_grupo_id= " + objective_grupo_id 
				+ ", objective_status_id = " + objective_status_id 
				+ " ]";
	}
}




/*
 * Correo: cursos@cidenet.com.co
 * Contraseña: C1d3n37202303
 * 
 * */