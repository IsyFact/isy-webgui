package de.bund.bva.isyfact.isywebgui.gui.common.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * JSF Converter der einen String in Upper Case umwandelt.
 */
@FacesConverter(value = "typeConverter")
public class TypeConverter implements Converter {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (component.getAttributes().get("converterAttribute").equals("int")) {
            return Integer.valueOf(value);
        }

        return value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {

        return value.toString().toUpperCase();

    }
}
