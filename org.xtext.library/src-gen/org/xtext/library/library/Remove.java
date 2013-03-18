/**
 */
package org.xtext.library.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.library.library.Remove#getIsbn <em>Isbn</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.library.library.LibraryPackage#getRemove()
 * @model
 * @generated
 */
public interface Remove extends Command
{
  /**
   * Returns the value of the '<em><b>Isbn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isbn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isbn</em>' attribute.
   * @see #setIsbn(String)
   * @see org.xtext.library.library.LibraryPackage#getRemove_Isbn()
   * @model
   * @generated
   */
  String getIsbn();

  /**
   * Sets the value of the '{@link org.xtext.library.library.Remove#getIsbn <em>Isbn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isbn</em>' attribute.
   * @see #getIsbn()
   * @generated
   */
  void setIsbn(String value);

} // Remove
