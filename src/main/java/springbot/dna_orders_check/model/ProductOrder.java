package springbot.dna_orders_check.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class ProductOrder {
    String name;
    String shop;

    String count;
    Date date;
}
