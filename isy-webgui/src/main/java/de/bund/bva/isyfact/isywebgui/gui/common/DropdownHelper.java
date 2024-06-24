package de.bund.bva.isyfact.isywebgui.gui.common;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.faces.model.SelectItem;

import org.springframework.stereotype.Component;

import de.bund.bva.isyfact.logging.IsyLogger;
import de.bund.bva.isyfact.logging.IsyLoggerFactory;
import de.bund.bva.isyfact.isywebgui.datentypen.AnredeEnum;

/**
 * Diese Klasse dient als Helper-Klasse zum füllen der Dropdown-Felder mit Daten aus Enums oder
 * konfigurierbaren Enums.
 *
 *
 */
@Component
public class DropdownHelper {

    private static final IsyLogger LOG = IsyLoggerFactory.getLogger(DropdownHelper.class);

    /**
     * @return Liste mit den verschiedenen Anreden.
     */
    public List<SelectItem> getAnredeListe() {

        return getSelectItemsFuerEnumMitAlphabetischerSortierung(AnredeEnum.class);
    }

    /**
     * Liefert eine Liste von SelectItems die alle alle Ausprägungungen des übergebenen Enums enthält. Als
     * value wird der Enum-Wert verwendet, als label das Ergebnis von {@code Enum#toString()}. Daher sollte
     * das entsprechende Enum die toString-Methode überschreiben.
     * <p>
     * Die Liste wird sortiert nach Labels zurückgegeben.
     *
     * @param e
     *            die Enum-Klasse
     * @return die Liste der sortierten SelectItems
     */
    public <E extends Enum<E>> List<SelectItem> getSelectItemsFuerEnumMitAlphabetischerSortierung(Class<E> e) {

        return getSelectItemsFuerEnumMitEnumSortierung(e).stream()
            .sorted((s1, s2) -> s1.getLabel().compareTo(s2.getLabel())).collect(Collectors.toList());
    }

    /**
     * Liefert eine Liste von SelectItems die alle alle Ausprägungungen des übergebenen Enums enthält. Als
     * value wird der Enum-Wert verwendet, als label das Ergebnis von {@code Enum#toString()}. Daher sollte
     * das entsprechende Enum die toString-Methode überschreiben.
     * <p>
     * Die Sortierung der Liste entspricht der Reihenfolge der Enum-Deklarationen.
     *
     * @param e
     *            die Enum-Klasse
     * @return die Liste der sortierten SelectItems
     */
    public <E extends Enum<E>> List<SelectItem> getSelectItemsFuerEnumMitEnumSortierung(Class<E> e) {

        return Stream.of(e.getEnumConstants()).map(a -> new SelectItem(a, a.toString()))
            .collect(Collectors.toList());
    }
}
