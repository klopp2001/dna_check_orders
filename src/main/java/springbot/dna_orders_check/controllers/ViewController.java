package springbot.dna_orders_check.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springbot.dna_orders_check.model.ProductOrder;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/")
    public String greeting(Model model) {
        List<ProductOrder> products = List.of(new ProductOrder("carrot", "12") ,  new ProductOrder("parrot", "4"));

        model.addAttribute("products", products);

        return "greeting";
    }


}
