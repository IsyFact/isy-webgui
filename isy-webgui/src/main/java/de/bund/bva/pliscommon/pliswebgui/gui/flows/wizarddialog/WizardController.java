package de.bund.bva.pliscommon.pliswebgui.gui.flows.wizarddialog;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.MessageController;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogModel;
import de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeHelper;
import de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeStaatsangListpickerModel;

/**
 * Controller für den Wizard Dialog.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: WizardController.java 134128 2015-04-08 13:53:41Z sdm_ahoerning $
 */
public class WizardController extends AbstractGuiController<WizardModel> {

    /**
     * Der MessageController.
     */
    private MessageController messageController;

    private JsfSteuerelementeHelper jsfSteuerelementeHelper;

    @Override
    public void initialisiereModel(WizardModel model) {

        JsfSteuerelementeStaatsangListpickerModel staatsangListpickerModel =
            new JsfSteuerelementeStaatsangListpickerModel();
        staatsangListpickerModel.setItems(this.jsfSteuerelementeHelper
            .getJsfSteuerelementeStaatsangListpickerController().erzeugeListpickerItemListe());
        model.setStaatsangListpickerModel(staatsangListpickerModel);
        // Wizard Model
        model.setWizardDialogModel(new WizardDialogModel());

    }

    /**
     * Aufruf von Speichern.
     * @param model
     *        das Model des Modalen Dialogs
     */
    public void speichern(WizardModel model) {
        this.messageController.writeInfoMessage("Erfolgreich gespeichert");
    }

    /**
     * Aufruf von Abbrechen.
     * @param model
     *        das Model des Modalen Dialogs
     */
    public void abbrechen(WizardModel model) {
        this.messageController.writeWarnMessage("Abbruch!", "Fehler");
    }

    public void dropdownWertAusgewaehlt(ValueChangeEvent event) throws AbortProcessingException {
        getMaskenModelZuController().setDropdownAuswahl(String.valueOf(event.getNewValue()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<WizardModel> getMaskenModelKlasseZuController() {
        return WizardModel.class;
    }

    @Required
    public void setMessageController(MessageController messageController) {
        this.messageController = messageController;
    }

    @Required
    public void setJsfSteuerelementeHelper(JsfSteuerelementeHelper jsfSteuerelementeHelper) {
        this.jsfSteuerelementeHelper = jsfSteuerelementeHelper;
    }

}
