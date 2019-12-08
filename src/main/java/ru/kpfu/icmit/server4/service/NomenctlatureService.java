package ru.kpfu.icmit.server4.service;

import org.springframework.stereotype.Service;
import ru.kpfu.icmit.server4.model.Nomenclature;
import ru.kpfu.icmit.server4.repository.NomenclatureRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NomenctlatureService extends CrudServiceImpl<Nomenclature, NomenclatureRepository> {

    public NomenctlatureService(NomenclatureRepository repository) {
        super(repository);
    }

    public Optional<Nomenclature> getByUid(UUID uid){
        return genericRepository.getByUid(uid);
    }

    public List<Nomenclature> getAllByModifyDateAfter(Timestamp dateAfter){
        return genericRepository.getAllByModifyDateAfter(dateAfter);
    }

}
