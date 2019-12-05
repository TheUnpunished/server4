package ru.kpfu.icmit.server4.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kpfu.icmit.server4.model.Offer;

public interface OfferRepository extends CrudRepository<Offer, Long> {
}
