package ru.kpfu.icmit.server4.service;

import ru.kpfu.icmit.server4.model.Organization;

import java.util.List;

public interface OrganizationService {
    List<Organization> getOrganizations();
    Organization addOrganization(Organization organization);
    Organization updateOrganization(Organization organization);
    void deleteOrganization(Organization organization);
    Organization getOrganizationById(Long id);
}
