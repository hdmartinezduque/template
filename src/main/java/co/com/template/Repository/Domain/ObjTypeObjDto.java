package co.com.template.Repository.Domain;

public class ObjTypeObjDto {
    private int objective_id;
    private String objective_describe;
    private int objective_objective_type_id;
    private String objective_type_describe;
    private int objective_user_id;
    private int objective_status_id;

    public ObjTypeObjDto(
            int objective_id
            , String objective_describe
            , int objective_objective_type_id
            , String objective_type_describe
            , int objective_user_id
            , int objective_status_id
    ) {
        //super();
    }

    @Override
    public String toString(){
        return "ObjTypeObj[" +
                "objective_id ="+objective_id+"" +
                ",objective_describe="+objective_describe+"" +
                ",objective_describe="+objective_objective_type_id+"" +
                ",objective_type_describe="+objective_type_describe+"" +
                ",objective_user_id="+objective_user_id+"" +
                ",objective_status_id="+objective_status_id+"" +
                ", ]";
    }
}
