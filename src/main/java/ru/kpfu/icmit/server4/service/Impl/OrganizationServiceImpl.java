package ru.kpfu.icmit.server4.service.Impl;

import org.hibernate.proxy.HibernateProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.icmit.server4.model.Organization;
import ru.kpfu.icmit.server4.repository.OrganizationRepository;
import ru.kpfu.icmit.server4.service.OrganizationService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public List<Organization> getOrganizations() {
        return StreamSupport
                .stream(organizationRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Organization addOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    @Override
    public Organization updateOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    @Override
    public void deleteOrganization(Organization organization) {
        organizationRepository.delete(organization);
    }

    @Override
    public Organization getOrganizationById(Long id) {
        Organization organization = organizationRepository.findById(id).get();

        if (organization instanceof HibernateProxy){
           return (Organization) ((HibernateProxy) organization).getHibernateLazyInitializer().getImplementation();
        }
        return organization;
    }
}
