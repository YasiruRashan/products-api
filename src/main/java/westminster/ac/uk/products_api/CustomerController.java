package westminster.ac.uk.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/customers")  //establishes the URL prefix
    public class CustomerController {

        @GetMapping("/{id}")       //matches a URL such as /customers/1
        public Customer getById(@PathVariable Long id) {

            Address address = new Address(
                    "115 New Cavendish Street",
                    "London",
                    "W1W 6UW"
            );

            return new Customer(
                    id,
                    "Ada Lovelace",
                    "ada@example.com",
                    address
            );
        }
    }


