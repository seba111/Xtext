/**
 */
package org.xtext.library.library;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.library.library.Author#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.xtext.library.library.Author#getSecondname <em>Secondname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.library.library.LibraryPackage#getAuthor()
 * @model
 * @generated
 */
public interface Author extends EObject
{
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
   * @see org.xtext.library.library.LibraryPackage#getAuthor_Firstname()
   * @model
   * @generated
   */
  String getFirstname();

  /**
   * Sets the value of the '{@link org.xtext.library.library.Author#getFirstname <em>Firstname</em>}' attribute.
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
   * @see org.xtext.library.library.LibraryPackage#getAuthor_Secondname()
   * @model
   * @generated
   */
  String getSecondname();

  /**
   * Sets the value of the '{@link org.xtext.library.library.Author#getSecondname <em>Secondname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Secondname</em>' attribute.
   * @see #getSecondname()
   * @generated
   */
  void setSecondname(String value);

} // Author
