/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easymcu;

import javax.swing.JComboBox;

/**
 * A class used to configure USART Driver by setting each element value
 * (MODE_OF_OPERATION,SPEED_OPERATION,PARITY_MODE,STOP_BIT_SELECT,CLOCK_POLARITY,
 * F_CPU,FRAME_SIZE,BAUD_RATE ) and update DIO driver by updateDIODriver method
 * that's called from UpdateDriver superclass.
 *
 * @author Askar
 * @version 1.0
 *
 */
public class USART extends UpdateDriver {
    //DIO Attributes
    //Set each element to congif by defualt as the following values 

    private String config[] = {"ASYNCHRONOUS", "DOUBLE_SPEED_MODE", "DISABLED", "ONE_BIT", "RISING", "8000000L", "8", "9600L"};
    //Elements Names

    private String element[] = {"MODE_OF_OPERATION", "SPEED_OPERATION", "PARITY_MODE", "STOP_BIT_SELECT", "CLOCK_POLARITY", "F_CPU", "FRAME_SIZE", "BAUD_RATE"};
    private String CurrentFile;
    private Boolean isChanged = false;

    /**
     * Constructor Sets element value by determining pin number and its value
     *
     * @param modOp An MODE_OF_OPERATION enum object that will hold the new
     * value.
     * @param spdOp An SPEED_OPERATION enum object that will hold the new value.
     * @param prtyOp An PARITY_MODE enum object that will hold the new value.
     * @param stpBtSlct An STOP_BIT_SELECT enum object that will hold the new
     * value.
     * @param clkPlrty An CLOCK_POLARITY enum object that will hold the new
     * value.
     * @param F_CPU An F_CPU enum object that will hold the new value.
     * @param FRAME_SIZE An FRAME_SIZE enum object that will hold the new value.
     * @param BAUD_RATE An BAUD_RATE enum object that will hold the new value.
     */
    public void setUSARTvalues(String modOp, String spdOp, String prtyOp, String stpBtSlct, String clkPlrty, String F_CPU, String FRAME_SIZE, String BAUD_RATE) {

        config[0] = modOp;
        config[1] = spdOp;
        config[2] = prtyOp;
        config[3] = stpBtSlct;
        config[4] = clkPlrty;
        config[5] = (F_CPU + "L").trim();
        config[6] = (FRAME_SIZE + "").trim();
        config[7] = (BAUD_RATE + "L").trim();
    }

    public void setCurrentFile(String currentFile) {
        CurrentFile = currentFile;
    }

    /**
     * To apply changes on driver by calling updateDriver method from superclass
     * and determining the specific parameter for USART driver
     *
     */
    public Boolean isChanged() {
        return isChanged;
    }

    public void setChanged() {
        isChanged = true;
    }

    public void setDriverElementsValues(JComboBox[] USARTvalues) {
        for (int c = 0; c < 8; c++) {
            USARTvalues[c].setSelectedItem(config[c]);
            System.out.println(config[c]);

        }

    }

    public void getDriverElementsValues() {
        config = getDriverInfo("USART_config.h", element.length, element, CurrentFile);
        config[5] = config[5].replace('L', ' ').trim();
        config[7] = config[7].replace('L', ' ').trim();
    }

    public void updateUSARTDriver() {
        super.updateDriver("USART_config.h", element.length, element, config, CurrentFile);
        isChanged = false;
    }
}
