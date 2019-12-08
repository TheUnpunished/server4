package ru.kpfu.icmit.server4.service;

import org.springframework.stereotype.Service;
import ru.kpfu.icmit.server4.model.Offer;
import ru.kpfu.icmit.server4.repository.OfferRepository;

@Service
public class OfferService extends CrudServiceImpl<Offer, OfferRepository> {

    public OfferService(OfferRepository genericRepository) {
        super(genericRepository);
    }
}
