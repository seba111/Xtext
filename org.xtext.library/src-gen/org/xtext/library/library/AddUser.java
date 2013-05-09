/**
 */
package org.xtext.library.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.library.library.AddUser#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.xtext.library.library.AddUser#getSecondname <em>Secondname</em>}</li>
 *   <li>{@link org.xtext.library.library.AddUser#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.library.library.LibraryPackage#getAddUser()
 * @model
 * @generated
 */
public interface AddUser extends Command
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
   * @see org.xtext.library.library.LibraryPackage#getAddUser_Firstname()
   * @model
   * @generated
   */
  String getFirstname();

  /**
   * Sets the value of the '{@link org.xtext.library.library.AddUser#getFirstname <em>Firstname</em>}' attribute.
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
   * @see org.xtext.library.library.LibraryPackage#getAddUser_Secondname()
   * @model
   * @generated
   */
  String getSecondname();

  /**
   * Sets the value of the '{@link org.xtext.library.library.AddUser#getSecondname <em>Secondname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Secondname</em>' attribute.
   * @see #getSecondname()
   * @generated
   */
  void setSecondname(String value);

  /**
   * Returns the value of the '<em><b>Age</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Age</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Age</em>' attribute.
   * @see #setAge(String)
   * @see org.xtext.library.library.LibraryPackage#getAddUser_Age()
   * @model
   * @generated
   */
  String getAge();

  /**
   * Sets the value of the '{@link org.xtext.library.library.AddUser#getAge <em>Age</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Age</em>' attribute.
   * @see #getAge()
   * @generated
   */
  void setAge(String value);

} // AddUser
