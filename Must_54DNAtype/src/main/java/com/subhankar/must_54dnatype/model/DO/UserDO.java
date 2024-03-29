package com.subhankar.must_54dnatype.model.DO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class UserDO {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "phone", nullable = false, unique = true)
    private String phone;
    @Column(name = "nick_name", nullable = false, unique = true)
    private String nickName;
    @Column(name = "user_id", nullable = false, unique = true)
    private String userId;



}
