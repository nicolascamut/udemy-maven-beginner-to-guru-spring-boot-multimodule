package guru.springframework.json.springbootmmjson.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.json.model.ShippingAddress;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress() {
        ShippingAddress address = new ShippingAddress();
        address.setCountryName("FINLAND");
        return address;
    }
}
