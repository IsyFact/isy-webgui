package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.vieraugen;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.GlobalFlowController;
import de.bund.bva.isyfact.common.web.validation.ValidationMessage;
import de.bund.bva.isyfact.util.spring.MessageSourceHolder;

@Controller
public class VieraugenController extends AbstractGuiController<VieraugenModel> {

    @Autowired
    private GlobalFlowController globalFlowController;

    private VieraugenModel dbData = new VieraugenModel();

    /**
     * Speichert das Model.
     *
     * @param model das zu speichernende Model
     */
    public void speichern(VieraugenModel model) {

    }

    @Override
    public void initialisiereModel(VieraugenModel model) {

        // set Fehler
        List<ValidationMessage> validationMessages = new ArrayList<>();

        validationMessages.add(new ValidationMessage("WEBGI70000", "fehler", "fehler",
                MessageSourceHolder.getMessage("WEBGI70000")));

        this.globalFlowController.getValidationController().processValidationMessages(validationMessages);
    }

    @Override
    protected Class<VieraugenModel> getMaskenModelKlasseZuController() {

        return VieraugenModel.class;
    }

    @SuppressWarnings("javadoc")
    public VieraugenModel getDbData() {

        return this.dbData;
    }

    @SuppressWarnings("javadoc")
    public void setDbData(VieraugenModel dbData) {

        this.dbData = dbData;
    }

}
