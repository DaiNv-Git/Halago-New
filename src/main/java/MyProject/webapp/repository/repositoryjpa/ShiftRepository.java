package MyProject.webapp.repository.repositoryjpa;

import MyProject.webapp.modle.entity.ShiftEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftRepository extends JpaRepository<ShiftEntity, Long> {
}
