package com.optimainmobiliaria.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "T_JOB_CONDITION")
public class JobCondition {
    @Id
    @Column(name = "conditionId")
    private Long conditionId;
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
}
