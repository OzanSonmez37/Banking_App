
package gui.ayarlar;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class IconAyarlari {

    private static Icon originalIcon;
    
    public static void changeIcon(JLabel label, String fileName) {
        
        originalIcon = label.getIcon();
        label.setIcon(new ImageIcon(Package.getPackages().getClass().getResource("file:/C:/Users/PC/Desktop/Java%20Project/SweetBank/src/main/java/gui/İconlar/"+"fileName"+".png")));
        
    }
    
    public static void setOriginalIcon(JLabel label) {
        label.setIcon(originalIcon);
    }
}
