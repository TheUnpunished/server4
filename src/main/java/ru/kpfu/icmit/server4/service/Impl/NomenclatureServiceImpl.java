package ru.kpfu.icmit.server4.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.icmit.server4.model.Nomenclature;
import ru.kpfu.icmit.server4.repository.NomenclatureRepository;
import ru.kpfu.icmit.server4.service.NomenclatureService;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class NomenclatureServiceImpl implements NomenclatureService {

    @Autowired
    private NomenclatureRepository nomenclatureRepository;

    @Override
    public List<Nomenclature> getNomenclatures() {
        return StreamSupport
                .stream(nomenclatureRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Nomenclature addNomenclature(Nomenclature nomenclature) {
        return nomenclatureRepository.save(nomenclature);
    }

    @Override
    public Nomenclature updateNomenclature(Nomenclature nomenclature) {
        return nomenclatureRepository.save(nomenclature);
    }

    @Override
    public void deleteNomenclature(Nomenclature nomenclature) {
        nomenclatureRepository.delete(nomenclature);
    }

    @Override
    public Nomenclature getNomenclatureById(Long id) {
        return nomenclatureRepository.findById(id).get();
    }

    @Override
    public List<Nomenclature> getNomenclaturesByModifyDateAfter(Timestamp dateAfter) {
        return nomenclatureRepository.getNomenclaturesByModifyDateAfter(dateAfter);
    }

    @Override
    public Nomenclature getNomenclatureByUid(UUID uid) {
        return nomenclatureRepository.getNomenclatureByUid(uid);
    }
}
