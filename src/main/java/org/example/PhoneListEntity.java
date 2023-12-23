package org.example;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "phone_list")
@Data
public class PhoneListEntity extends BaseEntity{
    @Column(name = "phone")
    private String phoneNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id")
    private HospitalEntity hospitalEntity;
}
