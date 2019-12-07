package ru.kpfu.icmit.server4.service;

import ru.kpfu.icmit.server4.model.Nomenclature;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

public interface NomenclatureService {
    List<Nomenclature> getNomenclatures();
    Nomenclature addNomenclature(Nomenclature nomenclature);
    Nomenclature updateNomenclature(Nomenclature nomenclature);
    void deleteNomenclature(Nomenclature nomenclature);
    Nomenclature getNomenclatureById(Long id);
    List<Nomenclature> getNomenclaturesByModifyDateAfter(Timestamp dateAfter);
    Nomenclature getNomenclatureByUid(UUID uid);
}
