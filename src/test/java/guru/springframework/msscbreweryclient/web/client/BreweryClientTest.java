package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import guru.springframework.msscbreweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    private BreweryClient client;

    // Beer methods

    @Test
    void getBeerById() {
        assertNotNull(client.getBeerById(UUID.randomUUID()));
    }

    @Test
    void saveNewBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("New beer").build();

        URI uri = client.saveNewBeer(beerDto);

        assertNotNull(uri);

        System.out.println(uri);
    }

    @Test
    void updateBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("Beer to update").build();

        client.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void deleteBeer() {
        client.deleteBeer(UUID.randomUUID());
    }


    // Customer methods

    @Test
    void getCustomerById() {
        assertNotNull(client.getCustomerById(UUID.randomUUID()));
    }

    @Test
    void saveNewCustomer() {
        CustomerDto customerDto = CustomerDto.builder().name("New customer").build();

        URI uri = client.saveNewCustomer(customerDto);

        assertNotNull(uri);

        System.out.println(uri);
    }

    @Test
    void updateCustomer() {
        CustomerDto customerDto = CustomerDto.builder().name("Customer to update").build();

        client.updateCustomer(UUID.randomUUID(), customerDto);
    }

    @Test
    void deleteCustomer() {
        client.deleteCustomer(UUID.randomUUID());
    }



}