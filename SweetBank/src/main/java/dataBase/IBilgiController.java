
package dataBase;

import dataBase.transactions.HesapBilgileri;


public interface IBilgiController {
    
    public boolean bilgilerGecerliMi();
    
    public HesapBilgileri getHesapBilgileri();
    
}
