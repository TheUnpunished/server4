package ru.kpfu.icmit.server4.service;

import ru.kpfu.icmit.server4.model.Nomenclature;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

public interface NomenclatureService {
    List<Nomenclature> getNomenclatures();
    Nomenclature addNomenclature(Nomenclature nomenclature);
    Nomenclature updateNomenclature(Long id, Nomenclature nomenclature);
    void deleteNomenclature(Long id);
    Nomenclature getNomenclature(Long id);
    List<Nomenclature> getNomenclaturesByModifyDateAfter(Timestamp dateAfter);
    Nomenclature getNomenclatureByUid(UUID uid);
}
