package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "hospital")
@Setter
@Getter
@ToString
public class HospitalEntity extends BaseEntity {
    @Column(name = "code",nullable = false,unique = true)
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "er_name")
    private String erName;
    @Column(name = "address")
    private String address;
}
