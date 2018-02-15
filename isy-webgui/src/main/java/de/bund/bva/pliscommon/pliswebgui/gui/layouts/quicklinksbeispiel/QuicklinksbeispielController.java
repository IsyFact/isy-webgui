package de.bund.bva.pliscommon.pliswebgui.gui.layouts.quicklinksbeispiel;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.layout.QuicklinksController;
import de.bund.bva.isyfact.common.web.layout.QuicklinksElementModel;

/**
 * Controller für das Quicklinksbeispiel.
 *
 * @author Capgemini, Tobias Gröger
 * @version $Id: QuicklinksbeispielController.java 175067 2016-09-06 08:58:45Z sdm_ahoerning $
 */
public class QuicklinksbeispielController extends AbstractGuiController<QuicklinksbeispielModel> {

    /**
     * Controller für Quicklinks.
     */
    private QuicklinksController quicklinksController;

    /** ID der Quicklink-Gruppe. */
    private static final String groupId = "Quicklinks";

    @Override
    public void initialisiereModel(QuicklinksbeispielModel model) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<QuicklinksbeispielModel> getMaskenModelKlasseZuController() {
        return QuicklinksbeispielModel.class;
    }

    /**
     * Fügt einen Quicklink als Test hinzu.
     * @param text
     *            der Text des Quicklinks
     */
    public void fuegeTestquicklinkHinzu(String text) {

        QuicklinksElementModel quicklinkselementModel = new QuicklinksElementModel();
        quicklinkselementModel.setAnzuzeigenderText(text);
        quicklinkselementModel.setLink("titlesFlow");
        quicklinkselementModel.setId(text);

        this.quicklinksController.fuegeQuicklinkHinzu(quicklinkselementModel, groupId, 5);
    }

    /**
     * Entfernt einen Quicklink mit einer bestimmten Id.
     * @param id
     *            die Id des Quicklinks
     */
    public void entferneQuicklink(String id) {
        this.quicklinksController.entferneQuicklink(groupId, id);
    }

    @Required
    public void setQuicklinksController(QuicklinksController quicklinksController) {
        this.quicklinksController = quicklinksController;
    }
}
