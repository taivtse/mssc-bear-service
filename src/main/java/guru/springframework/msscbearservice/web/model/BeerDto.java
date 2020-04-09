package guru.springframework.msscbearservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @author taivo
 * @since 04/09/2020 21:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;

    private String name;

    private BeerStyleEnum style;

    private Long upc;

    private BigDecimal price;

    private Integer quatityOnHand;

    private Integer version;

    private OffsetDateTime createdDate;

    private OffsetDateTime lastModifiedDate;
}
