package com.bos.accountservice.register.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "selected_courier", schema = "public")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class SelectedCour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_selected_courier")
    private Integer idSC;

    @Column(name = "id_seller")
    private Integer idSeller;

    @Column(name = "id_courier")
    private Integer idCourier;

    @Column(name = "is_selected")
    private Integer selected;
}
