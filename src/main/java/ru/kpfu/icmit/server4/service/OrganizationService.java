package ru.kpfu.icmit.server4.service;

import org.springframework.stereotype.Service;
import ru.kpfu.icmit.server4.model.Organization;
import ru.kpfu.icmit.server4.repository.OrganizationRepository;

@Service
public class OrganizationService extends CrudServiceImpl<Organization, OrganizationRepository> {

    public OrganizationService(OrganizationRepository genericRepository) {
        super(genericRepository);
    }
}
