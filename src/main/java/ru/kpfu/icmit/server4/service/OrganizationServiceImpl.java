package ru.kpfu.icmit.server4.service;

import org.hibernate.proxy.HibernateProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.icmit.server4.model.Organization;
import ru.kpfu.icmit.server4.repository.OrganizationRepository;

import java.util.List;
@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public List<Organization> getOrganizations() {
        return (List<Organization>) organizationRepository.findAll();
    }

    @Override
    public Organization addOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    @Override
    public Organization updateOrganization(Long id, Organization organization) {
        Organization organization1 = organizationRepository.findById(id).get();
        organization1.setId(organization.getId());
        organization1.setName(organization.getName());
        return organizationRepository.save(organization1);
    }

    @Override
    public void deleteOrganization(Long id) {
        organizationRepository.deleteById(id);
    }

    @Override
    public Organization getOrganization(Long id) {
        Organization organization = organizationRepository.findById(id).get();

        if (organization instanceof HibernateProxy){
           return (Organization) ((HibernateProxy) organization).getHibernateLazyInitializer().getImplementation();
        }
        return organization;
    }
}
