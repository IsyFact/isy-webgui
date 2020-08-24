package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.button;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;

public class ButtonBeispieleModel extends AbstractMaskenModel {

    /**
     * Resultat für Button-Action.
     */
    private String buttonActionResult;

    /**
     * Resultat für Button-Action mit block="true".
     */
    private String blockButtonActionResult;

    public String getButtonActionResult() {
        return buttonActionResult;
    }

    public void setButtonActionResult(String buttonActionResult) {
        this.buttonActionResult = buttonActionResult;
    }

    public String getBlockButtonActionResult() {
        return blockButtonActionResult;
    }

    public void setBlockButtonActionResult(String blockButtonActionResult) {
        this.blockButtonActionResult = blockButtonActionResult;
    }
}
