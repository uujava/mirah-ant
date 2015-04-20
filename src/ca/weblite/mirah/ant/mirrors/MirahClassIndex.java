/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.weblite.mirah.ant.mirrors;

import ca.weblite.asm.LOG;
import java.io.IOException;

/**
 *
 * @author shannah
 */
public class MirahClassIndex extends ClassIndex {
    private boolean scanned = false;
    public MirahClassIndex(){
        LOG.info(this,"create !");
        addIndexer(new MirahFileIndexer());
    }

    @Override
    public void scanPath(String path, String pattern) throws IOException {
        LOG.info(this,"scanPath path="+path+" pattern="+pattern);
        if ( scanned ){
            return;
        }
        super.scanPath(path, pattern); 
        scanned = true;
    }

    @Override
    public void clearCache() {
        LOG.info(this,"clear cash!");
        scanned = false;
        super.clearCache(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
