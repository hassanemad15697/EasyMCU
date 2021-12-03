/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easymcu;

import javax.swing.JComboBox;

public class ADC extends UpdateDriver {

    //DIO Attributes
    //Set each element to congif by defualt as the following values 
    private String config[] = {"AVCC","RIGHT_ADJUSTMENT","FREE_RUNNING_MODE","DIVID_BY_128","DIO_U8_PIN_0"};
    //Elements Names
    private String element[] = {"VOLTAGE_REFERENCE", "ADJUSTMENT", "ADC_AUTO_TRIGGER_SOURCE", "ADC_PRESCALLER", "ADC_CHANNEL_NUMBER"};
    private String CurrentFile;
    private Boolean isChanged=false;
    /**
     * Constructor Sets element value by determining pin number and its value
     *
     * @param voltRef An ADC_VOLTAGE_REFERENCE enum object that will hold the
     * new value.
     * @param adj An ADC_ADJUSTMENT enum object that will hold the new value.
     * @param trig An ADC_AUTO_TRIGGER_SOURCE enum object that will hold the new
     * value.
     * @param presclr An ADC_PRESCALLER enum object that will hold the new
     * value.
     * @param chnl An ADC_CHANNEL_NUMBER enum object that will hold the new
     * value.
     */
    void setADCvalues(String voltRef, String adj, String trig, String presclr, String chnl) {
       
        config[0]=voltRef;
        config[1]=adj;
        config[2]=trig;
        config[3]=presclr;
        config[4]=chnl;
        
    }

    /**
     * To apply changes on driver by calling updateDriver method from superclass
     * and determining the specific parameter for ADC driver
     *
     */
    public void setCurrentFile(String currentFile) {
        CurrentFile = currentFile;
    }
    public Boolean isChanged() {
        return isChanged;
    }
    public void setChanged() {
         isChanged=true;
    }
    public void getDriverElementsValues() {
        config = getDriverInfo("ADC_config.h", element.length, element, CurrentFile);
    }

    public void setDriverElementsValues(JComboBox[] ADCvalues) {
        for (int c = 0; c < 5; c++) {
            ADCvalues[c].setSelectedItem(config[c]);
            System.out.println(config[c]);

        }

    }

    public void updateADCDriver() {
        super.updateDriver("ADC_config.h", element.length, element, config, CurrentFile);
        isChanged=false;
    }
}
