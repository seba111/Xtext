/**
 */
package org.xtext.library.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Show</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.library.library.Show#getWhat <em>What</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.library.library.LibraryPackage#getShow()
 * @model
 * @generated
 */
public interface Show extends Command
{
  /**
   * Returns the value of the '<em><b>What</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>What</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>What</em>' attribute.
   * @see #setWhat(String)
   * @see org.xtext.library.library.LibraryPackage#getShow_What()
   * @model
   * @generated
   */
  String getWhat();

  /**
   * Sets the value of the '{@link org.xtext.library.library.Show#getWhat <em>What</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>What</em>' attribute.
   * @see #getWhat()
   * @generated
   */
  void setWhat(String value);

} // Show
