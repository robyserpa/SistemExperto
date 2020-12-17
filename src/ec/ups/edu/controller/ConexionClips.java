package ec.ups.edu.controller;

import net.sf.clipsrules.jni.*;

/**
 * Sistema Experto
 * @author Roberto Serpa
 */
public class ConexionClips {
    
    private String resultado; 
    
    private final Environment clips;
    private CaptureRouter router;
    
    private String option;
    
    public ConexionClips() {
        clips = new Environment();
        option = "";  
    }
    
    public String evaluar(String type_device,String screen,String resolution,
            int fps,int ram,int rom,String microsd,int battery,int charge_lvl,
            String wireless_charge,String nfc,String fingerprint,String facial,
            String camera_quality,String video_camera,String waterproof,
            String sound,String connective,double size,double weight){
        
        try {
            router = new CaptureRouter(clips,new String []{
                Router.STDOUT,
                Router.STDERR,
                Router.STDWRN,
            });

            clips.load("clips/dispositivos.clp");
            clips.eval("(load-instances clips\\dispositivos.dat)");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if ("sd".equals(microsd)&&"sd".equals(wireless_charge)&&"sd".equals(waterproof)) 
            option = "sdsdsd";
        if (!"sd".equals(microsd)&&"sd".equals(wireless_charge)&&"sd".equals(waterproof)) 
            option = "0sdsd";
        if (!"sd".equals(microsd)&&!"sd".equals(wireless_charge)&&"sd".equals(waterproof)) 
            option = "00sd";
        if (!"sd".equals(microsd)&&!"sd".equals(wireless_charge)&&!"sd".equals(waterproof)) 
            option = "000";
        if ("sd".equals(microsd)&&!"sd".equals(wireless_charge)&&"sd".equals(waterproof)) 
            option = "sd0sd";
        if ("sd".equals(microsd)&&!"sd".equals(wireless_charge)&&!"sd".equals(waterproof)) 
            option = "sd00";
        if ("sd".equals(microsd)&&"sd".equals(wireless_charge)&&!"sd".equals(waterproof)) 
            option = "sdsd0";
        if (!"sd".equals(microsd)&&"sd".equals(wireless_charge)&&!"sd".equals(waterproof)) 
            option = "0sd0";
        
        
        try {
            
            switch(option){
                
                case "sdsdsd":
                    //rule1
                    clips.load("clips/rule1.clp");

                    clips.eval("(assert (phone" +
                    "(type_device " + type_device + ")" +
                    "(screen " + screen + ")" +
                    "(resolution " + resolution + ")" +
                    "(fps " + fps + ")" +
                    "(ram " + ram + ")" +
                    "(rom " + rom + ")" +
                    "(battery " + battery + ")" +
                    "(charge_lvl " + charge_lvl + ")" +
                    "(nfc " + nfc + ")" +
                    "(fingerprint " + fingerprint + ")" +
                    "(facial_recognition " + facial + ")" +
                    "(camera_quality " + camera_quality + ")" +
                    "(video_camera " + video_camera + ")" +
                    "(sound " + sound + ")" +
                    "(connective " + connective + ")" +
                    "(size " + size + ")" +
                    "(weight " + weight + ")" +
                    "))");
                    
                break;

                case "0sdsd":
                    //rule2
                    clips.load("clips/rule2.clp");
                    
                    clips.eval("(assert (phone" +
                    "(type_device " + type_device + ")" +
                    "(screen " + screen + ")" +
                    "(resolution " + resolution + ")" +
                    "(fps " + fps + ")" +
                    "(ram " + ram + ")" +
                    "(rom " + rom + ")" +
                    "(microsd " + microsd + ")" +
                    "(battery " + battery + ")" +
                    "(charge_lvl " + charge_lvl + ")" +
                    "(nfc " + nfc + ")" +
                    "(fingerprint " + fingerprint + ")" +
                    "(facial_recognition " + facial + ")" +
                    "(camera_quality " + camera_quality + ")" +
                    "(video_camera " + video_camera + ")" +
                    "(sound " + sound + ")" +
                    "(connective " + connective + ")" +
                    "(size " + size + ")" +
                    "(weight " + weight + ")" +
                    "))");
                                    
                break;

                case "00sd":
                    //rule3
                    clips.load("clips/rule3.clp");
                    
                    clips.eval("(assert (phone" +
                    "(type_device " + type_device + ")" +
                    "(screen " + screen + ")" +
                    "(resolution " + resolution + ")" +
                    "(fps " + fps + ")" +
                    "(ram " + ram + ")" +
                    "(rom " + rom + ")" +
                    "(microsd " + microsd + ")" +
                    "(battery " + battery + ")" +
                    "(charge_lvl " + charge_lvl + ")" +
                    "(wireless_charge " + wireless_charge + ")" +
                    "(nfc " + nfc + ")" +
                    "(fingerprint " + fingerprint + ")" +
                    "(facial_recognition " + facial + ")" +
                    "(camera_quality " + camera_quality + ")" +
                    "(video_camera " + video_camera + ")" +
                    "(sound " + sound + ")" +
                    "(connective " + connective + ")" +
                    "(size " + size + ")" +
                    "(weight " + weight + ")" +
                    "))");
                    
                break;

                case "000":
                    //rule4
                    clips.load("clips/rule4.clp");

                    clips.eval("(assert (phone" +
                    "(type_device " + type_device + ")" +
                    "(screen " + screen + ")" +
                    "(resolution " + resolution + ")" +
                    "(fps " + fps + ")" +
                    "(ram " + ram + ")" +
                    "(rom " + rom + ")" +
                    "(microsd " + microsd + ")" +
                    "(battery " + battery + ")" +
                    "(charge_lvl " + charge_lvl + ")" +
                    "(wireless_charge " + wireless_charge + ")" +
                    "(nfc " + nfc + ")" +
                    "(fingerprint " + fingerprint + ")" +
                    "(facial_recognition " + facial + ")" +
                    "(camera_quality " + camera_quality + ")" +
                    "(video_camera " + video_camera + ")" +
                    "(waterproof " + waterproof + ")" +
                    "(sound " + sound + ")" +
                    "(connective " + connective + ")" +
                    "(size " + size + ")" +
                    "(weight " + weight + ")" +
                    "))");
                                       
                break;
                
                case "sd0sd":
                    //rule5
                    clips.load("clips/rule5.clp");
                    
                    clips.eval("(assert (phone" +
                    "(type_device " + type_device + ")" +
                    "(screen " + screen + ")" +
                    "(resolution " + resolution + ")" +
                    "(fps " + fps + ")" +
                    "(ram " + ram + ")" +
                    "(rom " + rom + ")" +
                    "(battery " + battery + ")" +
                    "(charge_lvl " + charge_lvl + ")" +
                    "(wireless_charge " + wireless_charge + ")" +
                    "(nfc " + nfc + ")" +
                    "(fingerprint " + fingerprint + ")" +
                    "(facial_recognition " + facial + ")" +
                    "(camera_quality " + camera_quality + ")" +
                    "(video_camera " + video_camera + ")" +
                    "(sound " + sound + ")" +
                    "(connective " + connective + ")" +
                    "(size " + size + ")" +
                    "(weight " + weight + ")" +
                    "))");
                    
                break;
                
                case "sd00":
                    //rule6
                    clips.load("clips/rule6.clp");
                    
                    clips.eval("(assert (phone" +
                    "(type_device " + type_device + ")" +
                    "(screen " + screen + ")" +
                    "(resolution " + resolution + ")" +
                    "(fps " + fps + ")" +
                    "(ram " + ram + ")" +
                    "(rom " + rom + ")" +
                    "(battery " + battery + ")" +
                    "(charge_lvl " + charge_lvl + ")" +
                    "(wireless_charge " + wireless_charge + ")" +
                    "(nfc " + nfc + ")" +
                    "(fingerprint " + fingerprint + ")" +
                    "(facial_recognition " + facial + ")" +
                    "(camera_quality " + camera_quality + ")" +
                    "(video_camera " + video_camera + ")" +
                    "(waterproof " + waterproof + ")" +
                    "(sound " + sound + ")" +
                    "(connective " + connective + ")" +
                    "(size " + size + ")" +
                    "(weight " + weight + ")" +
                    "))");
                    
                break;
                
                case "sdsd0":
                    //rule7
                    clips.load("clips/rule7.clp");
                    
                    clips.eval("(assert (phone" +
                    "(type_device " + type_device + ")" +
                    "(screen " + screen + ")" +
                    "(resolution " + resolution + ")" +
                    "(fps " + fps + ")" +
                    "(ram " + ram + ")" +
                    "(rom " + rom + ")" +
                    "(battery " + battery + ")" +
                    "(charge_lvl " + charge_lvl + ")" +
                    "(nfc " + nfc + ")" +
                    "(fingerprint " + fingerprint + ")" +
                    "(facial_recognition " + facial + ")" +
                    "(camera_quality " + camera_quality + ")" +
                    "(video_camera " + video_camera + ")" +
                    "(waterproof " + waterproof + ")" +
                    "(sound " + sound + ")" +
                    "(connective " + connective + ")" +
                    "(size " + size + ")" +
                    "(weight " + weight + ")" +
                    "))");
                    
                break;
                
                case "0sd0":
                    //rule8
                    clips.load("clips/rule8.clp");
                    
                    clips.eval("(assert (phone" +
                    "(type_device " + type_device + ")" +
                    "(screen " + screen + ")" +
                    "(resolution " + resolution + ")" +
                    "(fps " + fps + ")" +
                    "(ram " + ram + ")" +
                    "(rom " + rom + ")" +
                    "(microsd " + microsd + ")" +
                    "(battery " + battery + ")" +
                    "(charge_lvl " + charge_lvl + ")" +
                    "(nfc " + nfc + ")" +
                    "(fingerprint " + fingerprint + ")" +
                    "(facial_recognition " + facial + ")" +
                    "(camera_quality " + camera_quality + ")" +
                    "(video_camera " + video_camera + ")" +
                    "(waterproof " + waterproof + ")" +
                    "(sound " + sound + ")" +
                    "(connective " + connective + ")" +
                    "(size " + size + ")" +
                    "(weight " + weight + ")" +
                    "))");
                    
                break;

                default:
            }
            
            clips.run();

            resultado = router.getOutput();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
    public String extra(){
        
        clips.deleteRouter(router);
        router = new CaptureRouter(clips,new String []{
                Router.STDOUT,
                Router.STDERR,
                Router.STDWRN,
            });
        
        resultado = "";
        
        try {
            
            clips.load("clips/rule9.clp");
            clips.run();
            clips.load("clips/rule10.clp");
            clips.run();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        resultado = router.getOutput();
        
        return resultado;  
    }
    
    public void cerrarConexion(){
        try {
            clips.reset();
            clips.clear();
            clips.deleteRouter(router);
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
}