package co.com.template.Repository.Domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "t_type_objective")

public class objective_type implements Serializable {
    private static final long serialVersionUID = 5022341805021141326L;

    @Id
    @Column(name = "objective_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long objective_type_id;

    @Column(name = "objective_type_describe")
    private String objective_type_describe;

    @Column(name = "objective_type_status_id")
    private String objective_type_status_id;

    @OneToMany(targetEntity = ObjectiveDomain.class, mappedBy = "objective_type_id", orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<ObjectiveDomain> t_objective;

    public long getObjective_type_id() {
        return objective_type_id;
    }

    public void setObjective_type_id(long objective_type_id) {
        this.objective_type_id = objective_type_id;
    }

    public objective_type() {
        super();
    }

}
