/**
 */
package org.xtext.library.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.library.library.Add#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.xtext.library.library.Add#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.library.library.Add#getYear <em>Year</em>}</li>
 *   <li>{@link org.xtext.library.library.Add#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.xtext.library.library.Add#getAutors <em>Autors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.library.library.LibraryPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends Command
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
   * @see org.xtext.library.library.LibraryPackage#getAdd_Isbn()
   * @model
   * @generated
   */
  String getIsbn();

  /**
   * Sets the value of the '{@link org.xtext.library.library.Add#getIsbn <em>Isbn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isbn</em>' attribute.
   * @see #getIsbn()
   * @generated
   */
  void setIsbn(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.xtext.library.library.LibraryPackage#getAdd_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.xtext.library.library.Add#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Year</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Year</em>' attribute.
   * @see #setYear(String)
   * @see org.xtext.library.library.LibraryPackage#getAdd_Year()
   * @model
   * @generated
   */
  String getYear();

  /**
   * Sets the value of the '{@link org.xtext.library.library.Add#getYear <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Year</em>' attribute.
   * @see #getYear()
   * @generated
   */
  void setYear(String value);

  /**
   * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.library.library.Author}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Authors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authors</em>' containment reference list.
   * @see org.xtext.library.library.LibraryPackage#getAdd_Authors()
   * @model containment="true"
   * @generated
   */
  EList<Author> getAuthors();

  /**
   * Returns the value of the '<em><b>Autors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.library.library.Author}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Autors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autors</em>' containment reference list.
   * @see org.xtext.library.library.LibraryPackage#getAdd_Autors()
   * @model containment="true"
   * @generated
   */
  EList<Author> getAutors();

} // Add
