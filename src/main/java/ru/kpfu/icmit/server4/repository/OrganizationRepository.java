package ru.kpfu.icmit.server4.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kpfu.icmit.server4.model.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, Long> {
}
