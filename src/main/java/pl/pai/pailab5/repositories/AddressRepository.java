package pl.pai.pailab5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pai.pailab5.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
