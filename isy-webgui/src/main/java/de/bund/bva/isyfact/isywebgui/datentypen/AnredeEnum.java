package de.bund.bva.isyfact.isywebgui.datentypen;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Die Anrede einer Person.
 *
 * @author Mathias Hamann, msg
 */
@SuppressWarnings("javadoc")
public enum AnredeEnum {

    HERR("Herr"), FRAU("Frau");

    private String label;

    private AnredeEnum(String label) {

        this.label = label;
    }

    @Override
    public String toString() {

        return this.label;
    }

    public String getLabel() {

        return this.label;
    }

    /**
     * Liefert für das übergebene Label die Enum-Ausprägung.
     *
     * @param label
     *            das Label
     * @return die Enum-Ausprägung
     */
    public static Optional<AnredeEnum> forLabel(String label) {

        return Stream.of(values()).filter(typ -> typ.label.equalsIgnoreCase(label)).findFirst();
    }
}
