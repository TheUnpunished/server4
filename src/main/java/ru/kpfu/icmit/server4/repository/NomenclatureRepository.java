package ru.kpfu.icmit.server4.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.icmit.server4.model.Nomenclature;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface NomenclatureRepository extends CrudRepository<Nomenclature, Long> {

    @Query("select n from Nomenclature n where uid = :uid ")
    Nomenclature getNomenclatureByUid(@Param("uid") UUID uid);


    @Query("select n from Nomenclature n where modifyDate >= :dateAfter ")
    List<Nomenclature> getNomenclaturesByModifyDateAfter(@Param("dateAfter")Timestamp dateAfter);

    @Transactional
    Nomenclature save(Nomenclature nomenclature);
}
