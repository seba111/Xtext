/**
 */
package org.xtext.library.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.library.library.Return#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.xtext.library.library.Return#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.xtext.library.library.Return#getSecondname <em>Secondname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.library.library.LibraryPackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends Command
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
   * @see org.xtext.library.library.LibraryPackage#getReturn_Isbn()
   * @model
   * @generated
   */
  String getIsbn();

  /**
   * Sets the value of the '{@link org.xtext.library.library.Return#getIsbn <em>Isbn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isbn</em>' attribute.
   * @see #getIsbn()
   * @generated
   */
  void setIsbn(String value);

  /**
   * Returns the value of the '<em><b>Firstname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Firstname</em>' attribute.
   * @see #setFirstname(String)
   * @see org.xtext.library.library.LibraryPackage#getReturn_Firstname()
   * @model
   * @generated
   */
  String getFirstname();

  /**
   * Sets the value of the '{@link org.xtext.library.library.Return#getFirstname <em>Firstname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Firstname</em>' attribute.
   * @see #getFirstname()
   * @generated
   */
  void setFirstname(String value);

  /**
   * Returns the value of the '<em><b>Secondname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secondname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secondname</em>' attribute.
   * @see #setSecondname(String)
   * @see org.xtext.library.library.LibraryPackage#getReturn_Secondname()
   * @model
   * @generated
   */
  String getSecondname();

  /**
   * Sets the value of the '{@link org.xtext.library.library.Return#getSecondname <em>Secondname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Secondname</em>' attribute.
   * @see #getSecondname()
   * @generated
   */
  void setSecondname(String value);

} // Return
