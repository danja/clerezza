

/* First created by JCasGen Wed Mar 31 16:02:30 CEST 2010 */
package org.apache.uima.calais;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Mar 31 16:02:30 CEST 2010
 * @generated */
public class NaturalFeature extends BaseType {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(NaturalFeature.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NaturalFeature() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NaturalFeature(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NaturalFeature(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NaturalFeature(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
}

    