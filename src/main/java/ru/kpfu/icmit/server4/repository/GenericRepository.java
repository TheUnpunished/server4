package ru.kpfu.icmit.server4.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.kpfu.icmit.server4.model.BaseEntity;

@NoRepositoryBean
public interface GenericRepository<T extends BaseEntity> extends CrudRepository<T, Long> {

}
