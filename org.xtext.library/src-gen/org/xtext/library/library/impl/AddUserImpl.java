/**
 */
package org.xtext.library.library.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.library.library.AddUser;
import org.xtext.library.library.LibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.library.library.impl.AddUserImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.xtext.library.library.impl.AddUserImpl#getSecondname <em>Secondname</em>}</li>
 *   <li>{@link org.xtext.library.library.impl.AddUserImpl#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddUserImpl extends CommandImpl implements AddUser
{
  /**
   * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstname()
   * @generated
   * @ordered
   */
  protected static final String FIRSTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstname()
   * @generated
   * @ordered
   */
  protected String firstname = FIRSTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSecondname() <em>Secondname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondname()
   * @generated
   * @ordered
   */
  protected static final String SECONDNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecondname() <em>Secondname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondname()
   * @generated
   * @ordered
   */
  protected String secondname = SECONDNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAge()
   * @generated
   * @ordered
   */
  protected static final String AGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAge()
   * @generated
   * @ordered
   */
  protected String age = AGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddUserImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LibraryPackage.Literals.ADD_USER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstname()
  {
    return firstname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstname(String newFirstname)
  {
    String oldFirstname = firstname;
    firstname = newFirstname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.ADD_USER__FIRSTNAME, oldFirstname, firstname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSecondname()
  {
    return secondname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondname(String newSecondname)
  {
    String oldSecondname = secondname;
    secondname = newSecondname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.ADD_USER__SECONDNAME, oldSecondname, secondname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAge()
  {
    return age;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAge(String newAge)
  {
    String oldAge = age;
    age = newAge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.ADD_USER__AGE, oldAge, age));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LibraryPackage.ADD_USER__FIRSTNAME:
        return getFirstname();
      case LibraryPackage.ADD_USER__SECONDNAME:
        return getSecondname();
      case LibraryPackage.ADD_USER__AGE:
        return getAge();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LibraryPackage.ADD_USER__FIRSTNAME:
        setFirstname((String)newValue);
        return;
      case LibraryPackage.ADD_USER__SECONDNAME:
        setSecondname((String)newValue);
        return;
      case LibraryPackage.ADD_USER__AGE:
        setAge((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LibraryPackage.ADD_USER__FIRSTNAME:
        setFirstname(FIRSTNAME_EDEFAULT);
        return;
      case LibraryPackage.ADD_USER__SECONDNAME:
        setSecondname(SECONDNAME_EDEFAULT);
        return;
      case LibraryPackage.ADD_USER__AGE:
        setAge(AGE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LibraryPackage.ADD_USER__FIRSTNAME:
        return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
      case LibraryPackage.ADD_USER__SECONDNAME:
        return SECONDNAME_EDEFAULT == null ? secondname != null : !SECONDNAME_EDEFAULT.equals(secondname);
      case LibraryPackage.ADD_USER__AGE:
        return AGE_EDEFAULT == null ? age != null : !AGE_EDEFAULT.equals(age);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (firstname: ");
    result.append(firstname);
    result.append(", secondname: ");
    result.append(secondname);
    result.append(", age: ");
    result.append(age);
    result.append(')');
    return result.toString();
  }

} //AddUserImpl
