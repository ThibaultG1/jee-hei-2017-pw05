package hei.tp05.contract.facade;

import hei.tp05.contract.dto.ClientDTO;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by thiba on 31/01/2017.
 */
@WebService
public interface ClientWS {

    List<ClientDTO> getAllClients();

    void saveClient(ClientDTO client);
}
