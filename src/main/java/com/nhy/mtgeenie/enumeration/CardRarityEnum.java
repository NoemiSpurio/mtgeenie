package com.nhy.mtgeenie.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CardRarityEnum {
    C("common"),
    U("uncommon"),
    R("rare"),
    M("mythic rare"),
    S("special"),
    T("token");

    public final String value;

    public static CardRarityEnum valueOfLabel(String label) {
        for (CardRarityEnum e : values()) {
            if (e.value.equals(label)) {
                return e;
            }
        }
        return null;
    }
}
