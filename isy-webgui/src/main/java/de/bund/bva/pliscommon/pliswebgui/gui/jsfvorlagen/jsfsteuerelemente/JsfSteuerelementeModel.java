package de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente;

import java.util.List;

import javax.faces.model.SelectItem;
import javax.servlet.http.Part;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableInMemoryModel;
import de.bund.bva.isyfact.common.web.jsf.components.listpicker.Listpickerangabe;
import de.bund.bva.isyfact.common.web.jsf.components.listpicker.behoerde.BehoerdeListpickerModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;
import de.bund.bva.isyfact.common.web.jsf.components.tab.TabGroupModel;

/**
 * Model für JSF-Steuerelemente.
 *
 * @author Capgemini, Tobias Gröger
 * @version $Id: JsfSteuerelementeModel.java 166449 2016-06-06 12:15:53Z sdm_arichter $
 */
public class JsfSteuerelementeModel extends AbstractMaskenModel {

    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * PanelModel für formInput.
     */
    private PanelModel panelModelFormInput = new PanelModel(false);

    /**
     * PanelModel für den Button.
     */
    private PanelModel panelModelButton = new PanelModel(false);

    /**
     * PanelModel für die TextBox.
     */
    private PanelModel panelModelTextBox = new PanelModel(false);

    /**
     * PanelModel für die TextBox.
     */
    private PanelModel panelModelFormTextarea = new PanelModel(false);

    /**
     * PanelModel für das Dropdown.
     */
    private PanelModel panelModelDropdown = new PanelModel(false);

    /**
     * PanelModel für den Radiobutton.
     */
    private PanelModel panelModelRadioButton = new PanelModel(false);

    /**
     * PanelModel für die Tab-Komponente.
     */
    private PanelModel panelModelTab = new PanelModel(false);

    /**
     * PanelModel für die Lists-Komponente.
     */
    private PanelModel panelModelList = new PanelModel(false);

    /**
     * PanelModel für die ButtonToolbar-Komponente.
     */
    private PanelModel panelModelButtonToolbar = new PanelModel(false);

    /**
     * PanelModel für die ActionInput-Komponente.
     */
    private PanelModel panelModelActionInput = new PanelModel(false);

    /**
     * PanelModel für die Datepicker-Komponente.
     */
    private PanelModel panelModelDatepicker = new PanelModel(false);

    /**
     * PanelModel für die Listpicker-Komponente.
     */
    private PanelModel panelModelListpicker = new PanelModel(false);

    /**
     * PanelModel für die Checkbox-Komponente.
     */
    private PanelModel panelModelCheckbox = new PanelModel(false);

    /**
     * PanelModel für den Data Table.
     */
    private PanelModel panelModelDataTable = new PanelModel(false);

    /**
     * PanelModel für die Tooltip-Komponente.
     */
    private PanelModel panelModelTooltip = new PanelModel(false);

    /**
     * PanelModel für die Currency-Input-Komponente.
     */
    private PanelModel panelModelCurrency = new PanelModel(false);

    /**
     * PanelModel für die Numeric-Input-Komponente.
     */
    private PanelModel panelModelNumeric = new PanelModel(false);

    /**
     * PanelModel für die Browse & Collect-Komponente.
     */
    private PanelModel panelModelBrowseAndCollect = new PanelModel(false);

    /**
     * PanelModel für die Toggle-Filter-Komponente.
     */
    private PanelModel panelModelToggleFilter = new PanelModel(false);

    /**
     * PanelModel für die Four-Eyes-Icon-Komponente.
     */
    private PanelModel panelModelFourEyesIconPanel = new PanelModel(false);

    /**
     * PanelModel für die Upload-Komponente.
     */
    private PanelModel panelModelUpload = new PanelModel(false);

    /**
     * Eingegeber Wert für das Feld formInputText.
     */
    private String formInputTextButtonActionResult;

    /**
     * Eingegeber Wert für das Feld formInputPasswort.
     */
    private String formInputPasswortButtonActionResult;

    /**
     * Eingegeber Wert für das Feld TextBox.
     */
    private String textBoxButtonActionResult;

    /**
     * Gespeichertes Datum.
     */
    private String datum;

    /**
     * Resultat für Button-Action.
     */
    private String buttonActionResult;

    /**
     * Resultat für Button-Action mit block="true"
     */
    private String blockButtonActionResult;

    /**
     * Auswahl des Dropdowns.
     */
    private String dropdownAuswahl;

    /**
     * Auswahl des Dropdowns.
     */
    private String dropdownAuswahlAjax;

    /**
     * Liste an Dropdown-Auswahlen.
     */
    private List<SelectItem> dropdownAuswahlListe;

    /**
     * Auswahl des Radio-Buttons.
     */
    private String radioButtonAuswahl;

    /**
     * Auswahl der zweiten Radio-Buttons Gruppe.
     */
    private String radioButtonAuswahl2;

    /**
     * Elemente des Radio-Buttons.
     */
    private List<SelectItem> radioButtonListe;

    /**
     * Elemente der Checkbox.
     */
    private List<SelectItem> checkboxListe;

    /**
     * Auswahl der Checkbox.
     */
    private List<String> checkboxAuswahl;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private boolean checkboxBoolean1;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private boolean checkboxBoolean2;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private boolean checkboxBoolean3;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private boolean checkboxBoolean4;

    /**
     * Anzahl der Klick Events der Checkbox.
     */
    private int checkboxBooleanGeklicktAnzahl;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private String checkboxBooleanNeuerWert;

    /**
     * Model für Trefferliste (Client-Modus).
     */
    private JsfSteuerelementeTrefferlistenModel trefferlistenClientModel;

    /**
     * Model für Trefferliste (Server-Modus).
     */
    private DataTableInMemoryModel<JsfSteuerelementeTreffer> trefferlistenServerModel;

    /**
     * Model für TabGroup.
     */
    private TabGroupModel tabGroupModel;

    /**
     * Model für AuskunftTab.
     */
    private JsfSteuerelementeAuskunftTabModel auskunftTabModel;


    /**
     * Model für Listpicker (ohne AJAX).
     */
    private JsfSteuerelementeListpickerModel listpickerModel;

    /**
     * Listpickermodel für den Staatsangehörigkeits-Listpicker.
     */
    private JsfSteuerelementeStaatsangListpickerModel staatsangListpickerModel;

    /**
     * Listpickermodel für den Behörde-Listpicker.
     */
    private BehoerdeListpickerModel behoerdeListpickerModel;

    /**
     * Auswahl des Behörde-Listpickers.
     */
    private Listpickerangabe behoerdeListpickerAngabe;

    /**
     * Model für Listpicker (mit AJAX).
     */
    private JsfSteuerelementeListpickerModel ajaxListpickerModel;

    /**
     * Model für Servlet-Listpicker.
     */
    private JsfSteuerelementeListpickerModel servletListpickerModel;

    /**
     * Auswahl des Listpickers (ohne AJAX).
     */
    private String listpickerAuswahl;

    /**
     * Auswahl des Listpickers (mit AJAX).
     */
    private String ajaxListpickerAuswahl;

    /**
     * Auswahl des Servlet-Listpickers.
     */
    private String servletListpickerAuswahl;

    private List<String> formSelectListInhalt;

    private String actionInputResult;

    private List<String> browseAndCollectAuswahl;

    /**
     * Elemente für Toggle-Filter.
     */
    private List<SelectItem> toggleFilterListe;

    private String toggleFilterAuswahl;

    /**
     * Der Wert für das formInput, dass das Four-Eyes-Icon verwendet.
     */
    private String foureyesFormInputTextButtonActionResult;

    /**
     * Der Wert für die TextBox, die das Four-Eyes-Icon verwendet.
     */
    private String foureyesTextBoxButtonActionResult;

    /**
     * Die Auswahl für das deaktivierte Dropdown.
     */
    private String disabledDropdownAuswahl;

    /**
     * Die Ajax Auswahl für das deaktivierte Dropdown.
     */
    private String disabledDropdownAuswahlAjax;

    /**
     * Die Auswahl für das Dropdown, das das Four-Eyes-Icon verwendet.
     */
    private String foureyesDropdownAuswahl;

    /**
     * Das Datum für das Datumfeld, das das Four-Eyes-Icon verwendet.
     */
    private String foureyesDatum;

    // Attribute für die Upload-Demo.
    // Uploads müssen immer transient sein.
    private transient Part bildUpload;

    // Uploads müssen immer transient sein.
    private transient Part disabledUpload;

    // Uploads müssen immer transient sein.
    private transient Part textUpload;

    // Nur für die Demo des Uploads
    private String hochgeladenerText;

    // Nur für die Demo des Uploads
    private byte[] hochgeladenesBild;

    public String getButtonActionResult() {
        return this.buttonActionResult;
    }

    public String getBlockButtonActionResult() {
        return this.blockButtonActionResult;
    }

    public void setButtonActionResult(String buttonActionResult) {
        this.buttonActionResult = buttonActionResult;
    }

    public void setBlockButtonActionResult(String blockButtonActionResult) {
        this.blockButtonActionResult = blockButtonActionResult;
    }

    public void dropDownAusgewaehlt(String auswahl) {
        this.dropdownAuswahl = auswahl;
    }

    public String getDropdownAuswahl() {
        return this.dropdownAuswahl;
    }

    public void setDropdownAuswahl(String dropdownAuswahl) {
        this.dropdownAuswahl = dropdownAuswahl;
    }

    public List<SelectItem> getDropdownAuswahlListe() {
        return this.dropdownAuswahlListe;
    }

    public void setDropdownAuswahlListe(List<SelectItem> dropdownAuswahlListe) {
        this.dropdownAuswahlListe = dropdownAuswahlListe;
    }

    public String getRadioButtonAuswahl() {
        return this.radioButtonAuswahl;
    }

    public void setRadioButtonAuswahl(String radioButtonAuswahl) {
        this.radioButtonAuswahl = radioButtonAuswahl;
    }

    public List<SelectItem> getRadioButtonListe() {
        return this.radioButtonListe;
    }

    public void setRadioButtonListe(List<SelectItem> radioButtonListe) {
        this.radioButtonListe = radioButtonListe;
    }

    public PanelModel getPanelModelButton() {
        return this.panelModelButton;
    }

    public void setPanelModelButton(PanelModel panelModelButton) {
        this.panelModelButton = panelModelButton;
    }

    public PanelModel getPanelModelDropdown() {
        return this.panelModelDropdown;
    }

    public void setPanelModelDropdown(PanelModel panelModelDropdown) {
        this.panelModelDropdown = panelModelDropdown;
    }

    public PanelModel getPanelModelRadioButton() {
        return this.panelModelRadioButton;
    }

    public void setPanelModelRadioButton(PanelModel panelModelRadioButton) {
        this.panelModelRadioButton = panelModelRadioButton;
    }

    public PanelModel getPanelModelDataTable() {
        return this.panelModelDataTable;
    }

    public void setPanelModelDataTable(PanelModel panelModelDataTable) {
        this.panelModelDataTable = panelModelDataTable;
    }

    public JsfSteuerelementeTrefferlistenModel getTrefferlistenClientModel() {
        return this.trefferlistenClientModel;
    }

    public void setTrefferlistenClientModel(JsfSteuerelementeTrefferlistenModel trefferlistenModel) {
        this.trefferlistenClientModel = trefferlistenModel;
    }

    public DataTableInMemoryModel<JsfSteuerelementeTreffer> getTrefferlistenServerModel() {
        return this.trefferlistenServerModel;
    }

    public void setTrefferlistenServerModel(
        DataTableInMemoryModel<JsfSteuerelementeTreffer> trefferlistenServerModel) {
        this.trefferlistenServerModel = trefferlistenServerModel;
    }

    public String getDatum() {
        return this.datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public TabGroupModel getTabGroupModel() {
        return this.tabGroupModel;
    }

    public void setTabGroupModel(TabGroupModel tabGroupModel) {
        this.tabGroupModel = tabGroupModel;
    }

    public List<SelectItem> getCheckboxListe() {
        return this.checkboxListe;
    }

    public void setCheckboxListe(List<SelectItem> checkboxListe) {
        this.checkboxListe = checkboxListe;
    }

    public List<String> getCheckboxAuswahl() {
        return this.checkboxAuswahl;
    }

    public void setCheckboxAuswahl(List<String> checkboxAuswahl) {
        this.checkboxAuswahl = checkboxAuswahl;
    }

    public JsfSteuerelementeListpickerModel getListpickerModel() {
        return this.listpickerModel;
    }

    public void setListpickerModel(JsfSteuerelementeListpickerModel listpickerModel) {
        this.listpickerModel = listpickerModel;
    }

    public String getListpickerAuswahl() {
        return this.listpickerAuswahl;
    }

    public void setListpickerAuswahl(String listpickerAuswahl) {
        this.listpickerAuswahl = listpickerAuswahl;
    }

    public JsfSteuerelementeListpickerModel getAjaxListpickerModel() {
        return this.ajaxListpickerModel;
    }

    public void setAjaxListpickerModel(JsfSteuerelementeListpickerModel ajaxListpickerModel) {
        this.ajaxListpickerModel = ajaxListpickerModel;
    }

    public JsfSteuerelementeListpickerModel getServletListpickerModel() {
        return this.servletListpickerModel;
    }

    public void setAjaxListpickerAuswahl(String ajaxListpickerAuswahl) {
        this.ajaxListpickerAuswahl = ajaxListpickerAuswahl;
    }

    public void setServletListpickerModel(JsfSteuerelementeListpickerModel servletListpickerModel) {
        this.servletListpickerModel = servletListpickerModel;
    }

    public String getAjaxListpickerAuswahl() {
        return this.ajaxListpickerAuswahl;
    }

    public String getServletListpickerAuswahl() {
        return this.servletListpickerAuswahl;
    }

    public void setServletListpickerAuswahl(String servletListpickerAuswahl) {
        this.servletListpickerAuswahl = servletListpickerAuswahl;
    }

    public List<String> getFormSelectListInhalt() {
        return this.formSelectListInhalt;
    }

    public void setPanelModelFormInput(PanelModel panelModelFormInput) {
        this.panelModelFormInput = panelModelFormInput;
    }

    public PanelModel getPanelModelFormInput() {
        return this.panelModelFormInput;
    }

    public void setFormSelectListInhalt(List<String> formSelectListInhalt) {
        this.formSelectListInhalt = formSelectListInhalt;
    }

    public String getFormInputTextButtonActionResult() {
        return this.formInputTextButtonActionResult;
    }

    public void setFormInputTextButtonActionResult(String formInputTextButtonActionResult) {
        this.formInputTextButtonActionResult = formInputTextButtonActionResult;
    }

    public String getFormInputPasswortButtonActionResult() {
        return this.formInputPasswortButtonActionResult;
    }

    public void setFormInputPasswortButtonActionResult(String formInputPasswortButtonActionResult) {
        this.formInputPasswortButtonActionResult = formInputPasswortButtonActionResult;
    }

    public String getDropdownAuswahlAjax() {
        return this.dropdownAuswahlAjax;
    }

    public void setDropdownAuswahlAjax(String dropdownAuswahlAjax) {
        this.dropdownAuswahlAjax = dropdownAuswahlAjax;
    }

    public PanelModel getPanelModelTextBox() {
        return this.panelModelTextBox;
    }

    public void setPanelModelTextBox(PanelModel panelModelTextBox) {
        this.panelModelTextBox = panelModelTextBox;
    }

    public String getTextBoxButtonActionResult() {
        return this.textBoxButtonActionResult;
    }

    public void setTextBoxButtonActionResult(String textBoxButtonActionResult) {
        this.textBoxButtonActionResult = textBoxButtonActionResult;
    }

    public String getActionInputResult() {
        return this.actionInputResult;
    }

    public void setActionInputResult(String actionInputResult) {
        this.actionInputResult = actionInputResult;
    }

    public List<String> getBrowseAndCollectAuswahl() {
        return this.browseAndCollectAuswahl;
    }

    public PanelModel getPanelModelDatepicker() {
        return this.panelModelDatepicker;
    }

    public void setBrowseAndCollectAuswahl(List<String> browseAndCollectAuswahl) {
        this.browseAndCollectAuswahl = browseAndCollectAuswahl;
    }

    public void setPanelModelDatepicker(PanelModel panelModelDatepicker) {
        this.panelModelDatepicker = panelModelDatepicker;
    }

    public PanelModel getPanelModelCheckbox() {
        return this.panelModelCheckbox;
    }

    public void setPanelModelCheckbox(PanelModel panelModelCheckbox) {
        this.panelModelCheckbox = panelModelCheckbox;
    }

    public PanelModel getPanelModelButtonToolbar() {
        return this.panelModelButtonToolbar;
    }

    public void setPanelModelButtonToolbar(PanelModel panelModelButtonToolbar) {
        this.panelModelButtonToolbar = panelModelButtonToolbar;
    }

    public PanelModel getPanelModelActionInput() {
        return this.panelModelActionInput;
    }

    public void setPanelModelActionInput(PanelModel panelModelActionInput) {
        this.panelModelActionInput = panelModelActionInput;
    }

    public PanelModel getPanelModelFormTextarea() {
        return this.panelModelFormTextarea;
    }

    public void setPanelModelFormTextarea(PanelModel panelModelFormTextarea) {
        this.panelModelFormTextarea = panelModelFormTextarea;
    }

    public PanelModel getPanelModelListpicker() {
        return this.panelModelListpicker;
    }

    public void setPanelModelListpicker(PanelModel panelModelListpicker) {
        this.panelModelListpicker = panelModelListpicker;
    }

    public PanelModel getPanelModelList() {
        return this.panelModelList;
    }

    public void setPanelModelList(PanelModel panelModelList) {
        this.panelModelList = panelModelList;
    }

    public PanelModel getPanelModelTab() {
        return this.panelModelTab;
    }

    public void setPanelModelTab(PanelModel panelModelTab) {
        this.panelModelTab = panelModelTab;
    }

    public String getCheckboxBooleanNeuerWert() {
        return this.checkboxBooleanNeuerWert;
    }

    public void setCheckboxBooleanNeuerWert(String checkboxBooleanNeuerWert) {
        this.checkboxBooleanNeuerWert = checkboxBooleanNeuerWert;
    }

    public boolean isCheckboxBoolean1() {
        return this.checkboxBoolean1;
    }

    public void setCheckboxBoolean1(boolean checkboxBoolean1) {
        this.checkboxBoolean1 = checkboxBoolean1;
    }

    public boolean isCheckboxBoolean2() {
        return this.checkboxBoolean2;
    }

    public void setCheckboxBoolean2(boolean checkboxBoolean2) {
        this.checkboxBoolean2 = checkboxBoolean2;
    }

    public boolean isCheckboxBoolean3() {
        return this.checkboxBoolean3;
    }

    public void setCheckboxBoolean3(boolean checkboxBoolean3) {
        this.checkboxBoolean3 = checkboxBoolean3;
    }

    public boolean isCheckboxBoolean4() {
        return this.checkboxBoolean4;
    }

    public void setCheckboxBoolean4(boolean checkboxBoolean4) {
        this.checkboxBoolean4 = checkboxBoolean4;
    }

    public int getCheckboxBooleanGeklicktAnzahl() {
        return this.checkboxBooleanGeklicktAnzahl;
    }

    public void setCheckboxBooleanGeklicktAnzahl(int checkboxBooleanGeklicktAnzahl) {
        this.checkboxBooleanGeklicktAnzahl = checkboxBooleanGeklicktAnzahl;
    }

    public PanelModel getPanelModelTooltip() {
        return this.panelModelTooltip;
    }

    public void setPanelModelTooltip(PanelModel panelModelTooltip) {
        this.panelModelTooltip = panelModelTooltip;
    }

    public PanelModel getPanelModelCurrency() {
        return this.panelModelCurrency;
    }

    public void setPanelModelCurrency(PanelModel panelModelCurrency) {
        this.panelModelCurrency = panelModelCurrency;
    }

    public PanelModel getPanelModelBrowseAndCollect() {
        return this.panelModelBrowseAndCollect;
    }

    public PanelModel getPanelModelNumeric() {
        return this.panelModelNumeric;
    }

    public void setPanelModelNumeric(PanelModel panelModelNumeric) {
        this.panelModelNumeric = panelModelNumeric;
    }

    public void setPanelModelBrowseAndCollect(PanelModel panelModelBrowseAndCollect) {
        this.panelModelBrowseAndCollect = panelModelBrowseAndCollect;
    }

    public PanelModel getPanelModelToggleFilter() {
        return this.panelModelToggleFilter;
    }

    public void setPanelModelToggleFilter(PanelModel panelModelToggleFilter) {
        this.panelModelToggleFilter = panelModelToggleFilter;
    }

    public List<SelectItem> getToggleFilterListe() {
        return this.toggleFilterListe;
    }

    public void setToggleFilterListe(List<SelectItem> toggleFilterListe) {
        this.toggleFilterListe = toggleFilterListe;
    }

    public String getToggleFilterAuswahl() {
        return this.toggleFilterAuswahl;
    }

    public void setToggleFilterAuswahl(String toggleFilterAuswahl) {
        this.toggleFilterAuswahl = toggleFilterAuswahl;
    }

    public PanelModel getPanelModelFourEyesIconPanel() {
        return this.panelModelFourEyesIconPanel;
    }

    public void setPanelModelFourEyesIconPanel(PanelModel panelModelFourEyesIconPanel) {
        this.panelModelFourEyesIconPanel = panelModelFourEyesIconPanel;
    }

    public PanelModel getPanelModelUpload() {
        return this.panelModelUpload;
    }

    public void setPanelModelUpload(PanelModel panelModelUpload) {
        this.panelModelUpload = panelModelUpload;
    }

    public BehoerdeListpickerModel getBehoerdeListpickerModel() {
        return this.behoerdeListpickerModel;
    }

    public void setBehoerdeListpickerModel(BehoerdeListpickerModel behoerdeListpickerModel) {
        this.behoerdeListpickerModel = behoerdeListpickerModel;
    }

    public JsfSteuerelementeStaatsangListpickerModel getStaatsangListpickerModel() {
        return this.staatsangListpickerModel;
    }

    public void setStaatsangListpickerModel(
        JsfSteuerelementeStaatsangListpickerModel staatsangListpickerModel) {
        this.staatsangListpickerModel = staatsangListpickerModel;
    }

    public Listpickerangabe getBehoerdeListpickerAngabe() {
        return this.behoerdeListpickerAngabe;
    }

    public void setBehoerdeListpickerAngabe(Listpickerangabe behoerdeListpickerAngabe) {
        this.behoerdeListpickerAngabe = behoerdeListpickerAngabe;
    }

    public String getFoureyesFormInputTextButtonActionResult() {
        return this.foureyesFormInputTextButtonActionResult;
    }

    public void setFoureyesFormInputTextButtonActionResult(String foureyesFormInputTextButtonActionResult) {
        this.foureyesFormInputTextButtonActionResult = foureyesFormInputTextButtonActionResult;
    }

    public String getFoureyesTextBoxButtonActionResult() {
        return this.foureyesTextBoxButtonActionResult;
    }

    public void setFoureyesTextBoxButtonActionResult(String foureyesTextBoxButtonActionResult) {
        this.foureyesTextBoxButtonActionResult = foureyesTextBoxButtonActionResult;
    }

    public String getDisabledDropdownAuswahl() {
        return this.disabledDropdownAuswahl;
    }

    public void setDisabledDropdownAuswahl(String disabledDropdownAuswahl) {
        this.disabledDropdownAuswahl = disabledDropdownAuswahl;
    }

    public String getDisabledDropdownAuswahlAjax() {
        return this.disabledDropdownAuswahlAjax;
    }

    public void setDisabledDropdownAuswahlAjax(String disabledDropdownAuswahlAjax) {
        this.disabledDropdownAuswahlAjax = disabledDropdownAuswahlAjax;
    }

    public String getFoureyesDropdownAuswahl() {
        return this.foureyesDropdownAuswahl;
    }

    public void setFoureyesDropdownAuswahl(String foureyesDropdownAuswahl) {
        this.foureyesDropdownAuswahl = foureyesDropdownAuswahl;
    }

    public String getRadioButtonAuswahl2() {
        return this.radioButtonAuswahl2;
    }

    public void setRadioButtonAuswahl2(String radioButtonAuswahl2) {
        this.radioButtonAuswahl2 = radioButtonAuswahl2;
    }

    public JsfSteuerelementeAuskunftTabModel getAuskunftTabModel() {
        return auskunftTabModel;
    }

    public void setAuskunftTabModel(JsfSteuerelementeAuskunftTabModel auskunftTabModel) {
        this.auskunftTabModel = auskunftTabModel;
    }

    public String getFoureyesDatum() {
        return this.foureyesDatum;
    }

    public void setFoureyesDatum(String foureyesDatum) {
        this.foureyesDatum = foureyesDatum;
    }

    public Part getBildUpload() {
        return this.bildUpload;
    }

    public Part getDisabledUpload() {
        return this.disabledUpload;
    }

    public Part getTextUpload() {
        return this.textUpload;
    }

    public void setBildUpload(Part uploadedFile) {
        this.bildUpload = uploadedFile;
    }

    public void setDisabledUpload(Part disabledUpload) {
        this.disabledUpload = disabledUpload;
    }

    public void setTextUpload(Part textUpload) {
        this.textUpload = textUpload;
    }

    public byte[] getHochgeladenesBild() {
        return this.hochgeladenesBild;
    }

    public void setHochgeladenesBild(byte[] hochgeladenesBild) {
        this.hochgeladenesBild = hochgeladenesBild;
    }

    public String getHochgeladenerText() {
        return this.hochgeladenerText;
    }

    public void setHochgeladenerText(String hochgeladenerText) {
        this.hochgeladenerText = hochgeladenerText;
    }

}
