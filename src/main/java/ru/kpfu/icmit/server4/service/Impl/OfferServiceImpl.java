package ru.kpfu.icmit.server4.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.icmit.server4.model.Offer;
import ru.kpfu.icmit.server4.repository.OfferRepository;
import ru.kpfu.icmit.server4.service.OfferService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OfferServiceImpl implements OfferService {

    @Autowired
    private OfferRepository offerRepository;

    @Override
    public List<Offer> getOffers() {
        return StreamSupport
                .stream(offerRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Offer addOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    @Override
    public Offer updateOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    @Override
    public void deleteOffer(Offer offer) {
        offerRepository.delete(offer);
    }

    @Override
    public Offer getOfferById(Long id) {
        return offerRepository.findById(id).get();
    }
}
