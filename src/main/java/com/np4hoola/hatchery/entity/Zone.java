package com.np4hoola.hatchery.entity;

import lombok.Getter;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Table(name = "zone")
public class Zone {
    @Id
    @Column(name = "seq", nullable = false, columnDefinition = "unsigned int(11)")
    private int zid;

    @Column(name = "width", nullable = false, columnDefinition = "unsigned int(4)")
    private int width;

    @Column(name = "width", nullable = false, columnDefinition = "unsigned int(4)")
    private int height;

    @Column(name = "device", nullable = false, columnDefinition = "varchar(1)")
    private String device;

    @Column(name="useYN", nullable = false, columnDefinition = "varchar(1)")
    private String useYN;

    @Column(name="regDate", nullable = false, columnDefinition = "datetime")
    private Timestamp regDate;
}
