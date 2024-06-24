package de.bund.bva.isyfact.isywebgui.gui.layouts.quicklinksbeispiel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.layout.QuicklinksController;
import de.bund.bva.isyfact.common.web.layout.QuicklinksElementModel;

/**
 * Controller für das Quicklinksbeispiel.
 *
 */
@Controller
public class QuicklinksbeispielController extends AbstractGuiController<QuicklinksbeispielModel> {

    /**
     * Controller für Quicklinks.
     */
    private QuicklinksController quicklinksController;

    @Autowired
    public QuicklinksbeispielController(QuicklinksController quicklinksController) {
        this.quicklinksController = quicklinksController;
    }

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

}
