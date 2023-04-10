package co.com.template.services;

import co.com.template.Repository.Domain.ObjTypeObjDto;
import co.com.template.Repository.Domain.ObjectiveDomain;
import co.com.template.Repository.Domain.objective_type;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinQueryService {

    @Resource
    private ObjectiveDomain ObjectiveDomain;

    @Resource
    private objective_type objective_type;

    public List<ObjTypeObjDto> getObjTypeObj(){
        //List<ObjTypeObjDto> list = fectObjTypeObjRightJoin();
        return null;
    }

}
