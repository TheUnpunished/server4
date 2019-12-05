package ru.kpfu.icmit.server4.service;

import ru.kpfu.icmit.server4.model.Nomenclature;

import java.util.List;

public interface NomenclatureService {
    List<Nomenclature> getNomenclatures();
    Nomenclature addNomenclature(Nomenclature nomenclature);
    Nomenclature updateNomenclature(Long id, Nomenclature nomenclature);
    void deleteNomenclature(Long id);
    Nomenclature getNomenclature(Long id);
}
