package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker;

import java.util.List;

import com.google.common.collect.Lists;

import de.bund.bva.isyfact.common.web.jsf.components.listpicker.ListpickerModel;

/**
 * Model für den Listpicker.
 *
 */
public class JsfSteuerelementeListpickerModel extends ListpickerModel<JsfSteuerelementeListpickerItem> {

    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    @Override
    public List<String> getColumnPropertyKeys() {
        return Lists.newArrayList("schluessel", "wert");
    }

}
