package springbot.dna_orders_check.response;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class ApiResponse {
    String message;
    String data;
}
