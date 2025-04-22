package org.login.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class LoaiMonAn implements Serializable {
    @Id
    @Column(name = "ma_loai_mon_an")
    private String maLoaiMonAn;

    @Column(name = "ten_loai_mon_an")
    private String tenLoaiMonAn;
}
