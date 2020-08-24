package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker;

import java.util.List;

import com.google.common.collect.Lists;
import de.bund.bva.isyfact.common.web.jsf.components.listpicker.ListpickerModel;

/**
 * Model für den Staatsangehoerigkeit Listpicker.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: JsfSteuerelementeListpickerModel.java 130053 2015-02-10 12:46:06Z sdm_tgroeger $
 */
public class JsfSteuerelementeStaatsangListpickerModel extends ListpickerModel<JsfSteuerelementeListpickerItem> {

    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    @Override
    public List<String> getColumnPropertyKeys() {
        return Lists.newArrayList("schluessel", "wert");
    }

}
