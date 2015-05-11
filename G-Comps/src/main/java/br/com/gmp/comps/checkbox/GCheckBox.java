package br.com.gmp.comps.checkbox;

import javax.swing.JCheckBox;

/**
 * CheckBox customizada
 *
 * @author kaciano
 */
public class GCheckBox extends JCheckBox {

    private Character identifier;

    /**
     * Cria nova instancia de GCheckBox
     */
    public GCheckBox() {
        this.identifier = 'C';
        initialize();
    }

    /**
     * Cria nova instancia de GCheckBox
     *
     * @param identifier {@code Character} Identificador
     */
    public GCheckBox(Character identifier) {
        this.identifier = identifier;
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        initComponents();
    }

    /**
     * Retorna o identificador
     *
     * @return {@code Character} Identificador
     */
    public Character getIdentifier() {
        return identifier;
    }

    /**
     * Modifica o identificador
     *
     * @param identifier {@code Character} Identificador
     */
    public void setIdentifier(Character identifier) {
        this.identifier = identifier;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
