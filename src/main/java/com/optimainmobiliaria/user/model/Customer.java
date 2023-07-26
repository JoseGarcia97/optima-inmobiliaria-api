package com.optimainmobiliaria.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "T_CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private Long customerId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "documentNumber")
    private String documentNumber;
    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "maritalStatusId", foreignKey = @ForeignKey(name = "FK_MaritalStatus_Customer"))
    private MaritalStatus maritalStatus;
    @Column(name = "profession")
    private String profession;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "jobConditionId", foreignKey = @ForeignKey(name = "FK_JobCondition_Customer"))
    private JobCondition jobCondition;
    @Column(name = "incomes")
    private Double incomes;

}