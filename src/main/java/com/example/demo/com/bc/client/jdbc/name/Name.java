package com.example.demo.com.bc.client.jdbc.name;

import com.example.demo.utils.UUID;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@Entity
@Table(name="t_name")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@ToString
public class Name extends UUID {
    private String code;
    private String name;
    private Timestamp createTime;
    private Timestamp updateTime;

}
