package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker;

import java.util.ArrayList;
import java.util.List;

import de.bund.bva.isyfact.common.web.jsf.components.listpicker.behoerde.AbstractBehoerdeListpickerController;
import de.bund.bva.isyfact.common.web.jsf.components.listpicker.behoerde.BehoerdeListpickerItem;
import org.springframework.stereotype.Component;

/**
 *
 */
public class JsfSteuerelementeBehoerdeListpickerController extends AbstractBehoerdeListpickerController {

    public JsfSteuerelementeBehoerdeListpickerController(int maxElemente) {
        super(maxElemente);
    }

    @Override
    public List<BehoerdeListpickerItem> erzeugeBehoerdeListpickerItemListe() {
        List<BehoerdeListpickerItem> behoerdeListpickerItems = new ArrayList<>();

        behoerdeListpickerItems.add(new BehoerdeListpickerItem("000001", "Testbehörde 1 AB C"));
        behoerdeListpickerItems.add(new BehoerdeListpickerItem("000002", "Testbehörde 2 HWE"));
        behoerdeListpickerItems.add(new BehoerdeListpickerItem("000003", "Testbehörde 3 GfeS"));
        behoerdeListpickerItems
            .add(new BehoerdeListpickerItem("000004", "Testbehörde 4 AB C sd sehrlangerEintragInEinemWort"));
        behoerdeListpickerItems.add(new BehoerdeListpickerItem("000005", "Testbehörde 5 XYZ"));
        behoerdeListpickerItems.add(new BehoerdeListpickerItem("000006", "Testbehörde 6 4711"));
        behoerdeListpickerItems.add(new BehoerdeListpickerItem("000007", "Testbehörde 7 test"));
        behoerdeListpickerItems.add(new BehoerdeListpickerItem("000008", "Testbehörde 8 aaa"));
        behoerdeListpickerItems.add(new BehoerdeListpickerItem("000009", "Testbehörde 9 1234567890"));
        behoerdeListpickerItems.add(new BehoerdeListpickerItem("000010", "Testbehörde 10 abc"));
        return behoerdeListpickerItems;
    }

}
