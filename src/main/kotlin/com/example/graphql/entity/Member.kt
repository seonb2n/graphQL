package com.example.graphql.entity

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*


@Entity
@Table(name = "member")
@NoArgsConstructor
@Getter
@Setter
class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_sn", nullable = false, precision = 15, scale = 0)
    private val memberSn: Long? = null


    @Column(name = "member_id", nullable = false, length = 100)
    private val memberId: String? = null


}