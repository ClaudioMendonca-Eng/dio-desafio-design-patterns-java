package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface que define o padrão <b>Repository</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @see <a href="https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html">Spring Data CrudRepository</a>
 * 
 * @author <a href="https://github.com/ClaudioMendonca-Eng">Claudio Mendonça</a>
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}