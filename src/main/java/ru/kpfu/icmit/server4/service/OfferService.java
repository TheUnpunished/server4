package ru.kpfu.icmit.server4.service;

import ru.kpfu.icmit.server4.model.Offer;

import java.util.List;

public interface OfferService {
    List<Offer> getOffers();
    Offer addOffer(Offer offer);
    Offer updateOffer(Long id, Offer offer);
    void deleteOffer(Long id);
    Offer getOffer(Long id);
}
