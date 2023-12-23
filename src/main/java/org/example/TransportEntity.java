package org.example;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "transport")
@Data
public class TransportEntity  extends BaseEntity{

    @Enumerated(EnumType.STRING)
    @Column(name = "transport_type")
    private TransportType transportType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id")
    private HospitalEntity hospitalEntity;
}
