package ru.kpfu.icmit.server4.service;

import ru.kpfu.icmit.server4.model.Organization;

import java.util.List;

public interface OrganizationService {
    List<Organization> getOrganizations();
    Organization addOrganization(Organization organization);
    Organization updateOrganization(Long id, Organization organization);
    void deleteOrganization(Long id);
    Organization getOrganization(Long id);
}
