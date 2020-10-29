package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * @author Abid Hussain
 * @created on 29/10/2020 6:22 PM
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
