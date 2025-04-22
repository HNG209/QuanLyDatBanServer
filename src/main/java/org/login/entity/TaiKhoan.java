package org.login.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class TaiKhoan implements Serializable {
    @Id
    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ma_nhan_vien", referencedColumnName = "ma_nhan_vien") // Khóa ngoại liên kết đến NhanVien
    private NhanVien nhanVien;
}
