package org.example;
import lombok.Data;
import javax.persistence.*;
@Entity
@Table(name = "employees")
@Data
public class EmployeesEntity extends BaseEntity {

    @Column(name = "ssn")
    private String ssn;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "address")
    private String address;
    @Column(name = "drive_license")
    private String driveLicense;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_id")
    private TransportEntity transportEntity;
}
