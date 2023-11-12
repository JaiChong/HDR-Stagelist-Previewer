/* HDR-SLP.java - HDR Stagelist Previewer GUI
 * Written by JaiChong "ECHOnce"
 * Last edited in November 2023
 * 
 * =======================
 * == Table of Contents ==
 * =======================
 *        class HDR_SLP
 * 1.       SETUP
 * 1.1.       Global Variables
 * 1.2.       main()
 * 1.3.       HDR_SLP()
 * 1.3.1.       Initialize GUI
 * 1.3.2.       Update Stage Data
 * 1.3.3.       Boot GUI and Initialize Sort Methods
 * 2.       UPDATES
 * 2.1.       displayCards()
 * 2.2.       class buttonHandler
 * 2.3.       class sortMethodsHandler
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;
import java.io.*;

import javax.swing.*;


public class HDR_SLP extends JFrame {

    // =================
    // == 1. SETUP =====
    // =================
    //
    // ================================
    // == 1.1. Global Variables =======
    // ================================
    
    // Storage/Reference for stage "cards"
    JPanel [] stages;
    int [] stageOrder;

    // GUI: Panes/Panels
    JPanel sPane;
    JPanel tPane;
    JScrollPane bPane;

    // GUI, Top: Size Sorts
    JCheckBox tSortManual;
    JRadioButton tSortBZArea;
    JRadioButton tSortBZHeight;
    JRadioButton tSortBZWidth;
    JRadioButton tSortDistTop;
    JRadioButton tSortDistSides;
    JRadioButton tSortDistBot;
    JRadioButton tSortStgLength;
    JButton tSortDesc;
    
    // GUI, Bottom: Size Sorts
    JRadioButton bSortFilename;
    JRadioButton bSortBZArea;
    JRadioButton bSortBZHeight;
    JRadioButton bSortBZWidth;
    JRadioButton bSortDistTop;
    JRadioButton bSortDistSides;
    JRadioButton bSortDistBot;
    JRadioButton bSortStgLength;
    JButton bSortDesc;
    
    // GUI, Bottom: Layout Feature Toggles
    JCheckBox bPlatNum0;
    JCheckBox bPlatNum1Thin;
    JCheckBox bPlatNum1Wide;
    JCheckBox bPlatNum2;
    JCheckBox bPlatNum3;
    JCheckBox bPlatNum4;
    JCheckBox bPlatLvlShort;
    JCheckBox bPlatLvlMed;
    JCheckBox bPlatLvlTall;
    JCheckBox bPlatMovFalse;
    JCheckBox bPlatMovShift;
    JCheckBox bPlatMovTransform;
    JCheckBox bWallTrue;
    JCheckBox bWallFalse;


    // ======================
    // == 1.2. main() =======
    // ======================
    //
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HDR_SLP app = new HDR_SLP();
                app.setVisible(true);
            }
        });
    }


    // =========================
    // == 1.3. HDR_SLP() =======
    // =========================
    //
    public HDR_SLP() {

        // ==================================
        // == 1.3.1. Initialize GUI =========
        // ==================================
        
        // Change window settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("HDR Stagelist Previewer");
        setLayout(new GridBagLayout());

        // Build window
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;    c.gridy = 0;    c.gridwidth = 1;    c.gridheight = 3;   add(sPane, c);  
        c.gridx = 1;    c.gridy = 0;    c.gridwidth = 2;    c.gridheight = 1;   add(tPane, c);
        c.gridx = 1;    c.gridy = 2;    c.gridwidth = 2;    c.gridheight = 2;   add(bPane, c);
        sPane.setLayout(new GridLayout(32, 1));
        tPane.setLayout(new GridLayout(2, 1));
        bPane.setLayout(new GridLayout(1, 5));
        // ...


        // =====================================
        // == 1.3.2. Update Stage Data =========
        // =====================================
        

        // ========================================================
        // == 1.3.3. Boot GUI and Initialize Sort Methods =========
        // ========================================================
    }


    // ===================
    // == 2. UPDATES =====
    // ===================
    //
    // ==============================
    // == 2.1. displayCards() =======
    // ==============================
    

    // ===================================
    // == 2.2. class buttonHandler =======
    // ===================================
    

    // =======================================
    // == 2.3. class sortMethodHandler =======
    // =======================================  
}