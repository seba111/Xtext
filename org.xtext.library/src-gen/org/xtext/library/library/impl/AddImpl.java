/**
 */
package org.xtext.library.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.library.library.Add;
import org.xtext.library.library.Author;
import org.xtext.library.library.LibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.library.library.impl.AddImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link org.xtext.library.library.impl.AddImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.library.library.impl.AddImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.xtext.library.library.impl.AddImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.xtext.library.library.impl.AddImpl#getAutors <em>Autors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddImpl extends CommandImpl implements Add
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
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected static final String YEAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected String year = YEAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthors()
   * @generated
   * @ordered
   */
  protected EList<Author> authors;

  /**
   * The cached value of the '{@link #getAutors() <em>Autors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutors()
   * @generated
   * @ordered
   */
  protected EList<Author> autors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddImpl()
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
    return LibraryPackage.Literals.ADD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.ADD__ISBN, oldIsbn, isbn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.ADD__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getYear()
  {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYear(String newYear)
  {
    String oldYear = year;
    year = newYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.ADD__YEAR, oldYear, year));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Author> getAuthors()
  {
    if (authors == null)
    {
      authors = new EObjectContainmentEList<Author>(Author.class, this, LibraryPackage.ADD__AUTHORS);
    }
    return authors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Author> getAutors()
  {
    if (autors == null)
    {
      autors = new EObjectContainmentEList<Author>(Author.class, this, LibraryPackage.ADD__AUTORS);
    }
    return autors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LibraryPackage.ADD__AUTHORS:
        return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
      case LibraryPackage.ADD__AUTORS:
        return ((InternalEList<?>)getAutors()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LibraryPackage.ADD__ISBN:
        return getIsbn();
      case LibraryPackage.ADD__TITLE:
        return getTitle();
      case LibraryPackage.ADD__YEAR:
        return getYear();
      case LibraryPackage.ADD__AUTHORS:
        return getAuthors();
      case LibraryPackage.ADD__AUTORS:
        return getAutors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LibraryPackage.ADD__ISBN:
        setIsbn((String)newValue);
        return;
      case LibraryPackage.ADD__TITLE:
        setTitle((String)newValue);
        return;
      case LibraryPackage.ADD__YEAR:
        setYear((String)newValue);
        return;
      case LibraryPackage.ADD__AUTHORS:
        getAuthors().clear();
        getAuthors().addAll((Collection<? extends Author>)newValue);
        return;
      case LibraryPackage.ADD__AUTORS:
        getAutors().clear();
        getAutors().addAll((Collection<? extends Author>)newValue);
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
      case LibraryPackage.ADD__ISBN:
        setIsbn(ISBN_EDEFAULT);
        return;
      case LibraryPackage.ADD__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case LibraryPackage.ADD__YEAR:
        setYear(YEAR_EDEFAULT);
        return;
      case LibraryPackage.ADD__AUTHORS:
        getAuthors().clear();
        return;
      case LibraryPackage.ADD__AUTORS:
        getAutors().clear();
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
      case LibraryPackage.ADD__ISBN:
        return ISBN_EDEFAULT == null ? isbn != null : !ISBN_EDEFAULT.equals(isbn);
      case LibraryPackage.ADD__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case LibraryPackage.ADD__YEAR:
        return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
      case LibraryPackage.ADD__AUTHORS:
        return authors != null && !authors.isEmpty();
      case LibraryPackage.ADD__AUTORS:
        return autors != null && !autors.isEmpty();
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
    result.append(", title: ");
    result.append(title);
    result.append(", year: ");
    result.append(year);
    result.append(')');
    return result.toString();
  }

} //AddImpl
