package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.togglefilter;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableItem;

public class ToggleFilterTableData implements DataTableItem {
    /**
     * Serial version ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Number.
     */
    private String number;

    /**
     * Name.
     */
    private String name;

    /**
     * Industry.
     */
    private String industry;

    /**
     * Country Code
     */
    private String countryCode;

    /**
     * Main Location.
     */
    private String mainLocation;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMainLocation() {
        return mainLocation;
    }

    public void setMainLocation(String mainLocation) {
        this.mainLocation = mainLocation;
    }

    @Override
    public long getIdentifierForItem() {
        return Long.parseLong(this.number);
    }
}
