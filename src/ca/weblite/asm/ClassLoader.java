/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.weblite.asm;

import mirah.objectweb.asm.Type;
import mirah.objectweb.asm.tree.ClassNode;

/**
 *
 * @author shannah
 */
public interface ClassLoader {
    public ClassNode findClass(Type type);
    public ClassNode findStub(Type type);
    
}
