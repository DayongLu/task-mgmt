package com.dlu.task.mgmt.taskmgmt;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class FYear {

    @Id
    private String fYear;

}
