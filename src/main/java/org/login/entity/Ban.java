package org.login.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.login.entity.enums.KhuVuc;
import org.login.entity.enums.LoaiBan;
import org.login.entity.enums.TrangThaiBan;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class Ban implements Serializable {
    @Id
    @Column(name = "ma_ban")
    private String maBan;

    @Column(nullable = false, name = "loai_ban")
    @Enumerated(EnumType.STRING)
    private LoaiBan loaiBan;

    @Column(nullable = false, name = "trang_thai_ban")
    @Enumerated(EnumType.STRING)
    private TrangThaiBan trangThaiBan;

    @Column(nullable = false, name = "khu_vuc")
    @Enumerated(EnumType.STRING)
    private KhuVuc khuVuc;
}
