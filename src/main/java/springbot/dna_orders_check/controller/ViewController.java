package springbot.dna_orders_check.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import springbot.dna_orders_check.model.ProductOrder;
import springbot.dna_orders_check.repository.ProductOrderRepository;

import java.util.List;

@Controller
public class ViewController {
    private final ProductOrderRepository productOrderRepository;

    public ViewController(ProductOrderRepository productOrderRepository) {
        this.productOrderRepository = productOrderRepository;
    }


    @GetMapping("/")
    public String greeting(Model model) {
//        List<ProductOrder> products = List.of(new ProductOrder("carrot", "ЦЕХ", "12", new Date()) ,  new ProductOrder("parrot", "4", "ЦЕХ", new Date()));
//        model.addAttribute("products", products);
        return "greeting";
    }

    @GetMapping("/page/{shopName}")
    public String shop(@PathVariable String shopName, Model model) {
        List<ProductOrder> products = productOrderRepository.findTodayOrdersOfShop(shopName);
        model.addAttribute("shopName", shopName);
        model.addAttribute("products", products);
        return "shop";
    }


}
