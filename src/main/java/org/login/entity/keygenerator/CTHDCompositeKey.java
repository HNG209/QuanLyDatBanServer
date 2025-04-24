package org.login.entity.keygenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class CTHDCompositeKey implements Serializable {

    // Getters and Setters
    private String maHoaDon;
    private String maMonAn;

    // Override equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CTHDCompositeKey that = (CTHDCompositeKey) o;
        return Objects.equals(maHoaDon, that.maHoaDon) && Objects.equals(maMonAn, that.maMonAn);
    }

    @Override
    public String toString() {
        return "CTHDCompositeKey{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", maMonAn='" + maMonAn + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(maHoaDon, maMonAn);
    }
}
