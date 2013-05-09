/**
 */
package org.xtext.library.library.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.library.library.Lend;
import org.xtext.library.library.LibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.library.library.impl.LendImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.xtext.library.library.impl.LendImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.xtext.library.library.impl.LendImpl#getSecondname <em>Secondname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LendImpl extends CommandImpl implements Lend
{
  /**
   * The default value of the '{@link #getIsbn() <em>Isbn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsbn()
   * @generated
   * @ordered
   */
  protected static final String ISBN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIsbn() <em>Isbn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsbn()
   * @generated
   * @ordered
   */
  protected String isbn = ISBN_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LendImpl()
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
    return LibraryPackage.Literals.LEND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIsbn()
  {
    return isbn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsbn(String newIsbn)
  {
    String oldIsbn = isbn;
    isbn = newIsbn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LEND__ISBN, oldIsbn, isbn));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LEND__FIRSTNAME, oldFirstname, firstname));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LEND__SECONDNAME, oldSecondname, secondname));
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
      case LibraryPackage.LEND__ISBN:
        return getIsbn();
      case LibraryPackage.LEND__FIRSTNAME:
        return getFirstname();
      case LibraryPackage.LEND__SECONDNAME:
        return getSecondname();
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
      case LibraryPackage.LEND__ISBN:
        setIsbn((String)newValue);
        return;
      case LibraryPackage.LEND__FIRSTNAME:
        setFirstname((String)newValue);
        return;
      case LibraryPackage.LEND__SECONDNAME:
        setSecondname((String)newValue);
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
      case LibraryPackage.LEND__ISBN:
        setIsbn(ISBN_EDEFAULT);
        return;
      case LibraryPackage.LEND__FIRSTNAME:
        setFirstname(FIRSTNAME_EDEFAULT);
        return;
      case LibraryPackage.LEND__SECONDNAME:
        setSecondname(SECONDNAME_EDEFAULT);
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
      case LibraryPackage.LEND__ISBN:
        return ISBN_EDEFAULT == null ? isbn != null : !ISBN_EDEFAULT.equals(isbn);
      case LibraryPackage.LEND__FIRSTNAME:
        return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
      case LibraryPackage.LEND__SECONDNAME:
        return SECONDNAME_EDEFAULT == null ? secondname != null : !SECONDNAME_EDEFAULT.equals(secondname);
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
    result.append(" (isbn: ");
    result.append(isbn);
    result.append(", firstname: ");
    result.append(firstname);
    result.append(", secondname: ");
    result.append(secondname);
    result.append(')');
    return result.toString();
  }

} //LendImpl
