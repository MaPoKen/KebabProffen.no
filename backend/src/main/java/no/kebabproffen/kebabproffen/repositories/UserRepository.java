package no.kebabproffen.kebabproffen;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
// JpaRepository<Model, ID type>
interface UserRepository extends JpaRepository<User, UUID> {

}