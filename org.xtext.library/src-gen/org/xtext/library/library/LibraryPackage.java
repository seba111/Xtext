/**
 */
package org.xtext.library.library;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.library.library.LibraryFactory
 * @model kind="package"
 * @generated
 */
public interface LibraryPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "library";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/library/Library";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "library";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LibraryPackage eINSTANCE = org.xtext.library.library.impl.LibraryPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.ModelImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMMANDS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.CommandImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.SearchImpl <em>Search</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.SearchImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getSearch()
   * @generated
   */
  int SEARCH = 2;

  /**
   * The number of structural features of the '<em>Search</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.AddAuthorImpl <em>Add Author</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.AddAuthorImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getAddAuthor()
   * @generated
   */
  int ADD_AUTHOR = 3;

  /**
   * The feature id for the '<em><b>Isbn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_AUTHOR__ISBN = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_AUTHOR__AUTHOR = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Add Author</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_AUTHOR_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.ByYearImpl <em>By Year</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.ByYearImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getByYear()
   * @generated
   */
  int BY_YEAR = 4;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BY_YEAR__YEAR = SEARCH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>By Year</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BY_YEAR_FEATURE_COUNT = SEARCH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.ByAuthorImpl <em>By Author</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.ByAuthorImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getByAuthor()
   * @generated
   */
  int BY_AUTHOR = 5;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BY_AUTHOR__AUTHOR = SEARCH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>By Author</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BY_AUTHOR_FEATURE_COUNT = SEARCH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.LendImpl <em>Lend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.LendImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getLend()
   * @generated
   */
  int LEND = 6;

  /**
   * The feature id for the '<em><b>Isbn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEND__ISBN = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Firstname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEND__FIRSTNAME = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Secondname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEND__SECONDNAME = COMMAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Lend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.AddImpl <em>Add</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.AddImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getAdd()
   * @generated
   */
  int ADD = 7;

  /**
   * The feature id for the '<em><b>Isbn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__ISBN = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__TITLE = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__YEAR = COMMAND_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Authors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__AUTHORS = COMMAND_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Add</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.AddUserImpl <em>Add User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.AddUserImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getAddUser()
   * @generated
   */
  int ADD_USER = 8;

  /**
   * The feature id for the '<em><b>Firstname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_USER__FIRSTNAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Secondname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_USER__SECONDNAME = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Age</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_USER__AGE = COMMAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Add User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_USER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.RemoveImpl <em>Remove</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.RemoveImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getRemove()
   * @generated
   */
  int REMOVE = 9;

  /**
   * The feature id for the '<em><b>Isbn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE__ISBN = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Remove</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.ReturnImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 10;

  /**
   * The feature id for the '<em><b>Isbn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__ISBN = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Firstname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__FIRSTNAME = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Secondname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__SECONDNAME = COMMAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.CheckImpl <em>Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.CheckImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getCheck()
   * @generated
   */
  int CHECK = 11;

  /**
   * The feature id for the '<em><b>Isbn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__ISBN = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.AuthorImpl <em>Author</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.AuthorImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getAuthor()
   * @generated
   */
  int AUTHOR = 12;

  /**
   * The feature id for the '<em><b>Firstname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR__FIRSTNAME = 0;

  /**
   * The feature id for the '<em><b>Secondname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR__SECONDNAME = 1;

  /**
   * The number of structural features of the '<em>Author</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.ShowImpl <em>Show</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.ShowImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getShow()
   * @generated
   */
  int SHOW = 13;

  /**
   * The feature id for the '<em><b>What</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW__WHAT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Show</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.library.library.impl.ShowUserAccountImpl <em>Show User Account</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.library.library.impl.ShowUserAccountImpl
   * @see org.xtext.library.library.impl.LibraryPackageImpl#getShowUserAccount()
   * @generated
   */
  int SHOW_USER_ACCOUNT = 14;

  /**
   * The feature id for the '<em><b>Firstname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_USER_ACCOUNT__FIRSTNAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Secondname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_USER_ACCOUNT__SECONDNAME = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Show User Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_USER_ACCOUNT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.library.library.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.library.library.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.library.library.Model#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.xtext.library.library.Model#getCommands()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Commands();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.library.library.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.Search <em>Search</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Search</em>'.
   * @see org.xtext.library.library.Search
   * @generated
   */
  EClass getSearch();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.AddAuthor <em>Add Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Author</em>'.
   * @see org.xtext.library.library.AddAuthor
   * @generated
   */
  EClass getAddAuthor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.AddAuthor#getIsbn <em>Isbn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isbn</em>'.
   * @see org.xtext.library.library.AddAuthor#getIsbn()
   * @see #getAddAuthor()
   * @generated
   */
  EAttribute getAddAuthor_Isbn();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.library.library.AddAuthor#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Author</em>'.
   * @see org.xtext.library.library.AddAuthor#getAuthor()
   * @see #getAddAuthor()
   * @generated
   */
  EReference getAddAuthor_Author();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.ByYear <em>By Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>By Year</em>'.
   * @see org.xtext.library.library.ByYear
   * @generated
   */
  EClass getByYear();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.ByYear#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see org.xtext.library.library.ByYear#getYear()
   * @see #getByYear()
   * @generated
   */
  EAttribute getByYear_Year();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.ByAuthor <em>By Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>By Author</em>'.
   * @see org.xtext.library.library.ByAuthor
   * @generated
   */
  EClass getByAuthor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.library.library.ByAuthor#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Author</em>'.
   * @see org.xtext.library.library.ByAuthor#getAuthor()
   * @see #getByAuthor()
   * @generated
   */
  EReference getByAuthor_Author();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.Lend <em>Lend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lend</em>'.
   * @see org.xtext.library.library.Lend
   * @generated
   */
  EClass getLend();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Lend#getIsbn <em>Isbn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isbn</em>'.
   * @see org.xtext.library.library.Lend#getIsbn()
   * @see #getLend()
   * @generated
   */
  EAttribute getLend_Isbn();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Lend#getFirstname <em>Firstname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Firstname</em>'.
   * @see org.xtext.library.library.Lend#getFirstname()
   * @see #getLend()
   * @generated
   */
  EAttribute getLend_Firstname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Lend#getSecondname <em>Secondname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondname</em>'.
   * @see org.xtext.library.library.Lend#getSecondname()
   * @see #getLend()
   * @generated
   */
  EAttribute getLend_Secondname();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add</em>'.
   * @see org.xtext.library.library.Add
   * @generated
   */
  EClass getAdd();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Add#getIsbn <em>Isbn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isbn</em>'.
   * @see org.xtext.library.library.Add#getIsbn()
   * @see #getAdd()
   * @generated
   */
  EAttribute getAdd_Isbn();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Add#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.library.library.Add#getTitle()
   * @see #getAdd()
   * @generated
   */
  EAttribute getAdd_Title();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Add#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see org.xtext.library.library.Add#getYear()
   * @see #getAdd()
   * @generated
   */
  EAttribute getAdd_Year();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.library.library.Add#getAuthors <em>Authors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Authors</em>'.
   * @see org.xtext.library.library.Add#getAuthors()
   * @see #getAdd()
   * @generated
   */
  EReference getAdd_Authors();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.AddUser <em>Add User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add User</em>'.
   * @see org.xtext.library.library.AddUser
   * @generated
   */
  EClass getAddUser();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.AddUser#getFirstname <em>Firstname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Firstname</em>'.
   * @see org.xtext.library.library.AddUser#getFirstname()
   * @see #getAddUser()
   * @generated
   */
  EAttribute getAddUser_Firstname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.AddUser#getSecondname <em>Secondname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondname</em>'.
   * @see org.xtext.library.library.AddUser#getSecondname()
   * @see #getAddUser()
   * @generated
   */
  EAttribute getAddUser_Secondname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.AddUser#getAge <em>Age</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Age</em>'.
   * @see org.xtext.library.library.AddUser#getAge()
   * @see #getAddUser()
   * @generated
   */
  EAttribute getAddUser_Age();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.Remove <em>Remove</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remove</em>'.
   * @see org.xtext.library.library.Remove
   * @generated
   */
  EClass getRemove();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Remove#getIsbn <em>Isbn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isbn</em>'.
   * @see org.xtext.library.library.Remove#getIsbn()
   * @see #getRemove()
   * @generated
   */
  EAttribute getRemove_Isbn();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see org.xtext.library.library.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Return#getIsbn <em>Isbn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isbn</em>'.
   * @see org.xtext.library.library.Return#getIsbn()
   * @see #getReturn()
   * @generated
   */
  EAttribute getReturn_Isbn();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Return#getFirstname <em>Firstname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Firstname</em>'.
   * @see org.xtext.library.library.Return#getFirstname()
   * @see #getReturn()
   * @generated
   */
  EAttribute getReturn_Firstname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Return#getSecondname <em>Secondname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondname</em>'.
   * @see org.xtext.library.library.Return#getSecondname()
   * @see #getReturn()
   * @generated
   */
  EAttribute getReturn_Secondname();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check</em>'.
   * @see org.xtext.library.library.Check
   * @generated
   */
  EClass getCheck();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Check#getIsbn <em>Isbn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Isbn</em>'.
   * @see org.xtext.library.library.Check#getIsbn()
   * @see #getCheck()
   * @generated
   */
  EAttribute getCheck_Isbn();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.Author <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Author</em>'.
   * @see org.xtext.library.library.Author
   * @generated
   */
  EClass getAuthor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Author#getFirstname <em>Firstname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Firstname</em>'.
   * @see org.xtext.library.library.Author#getFirstname()
   * @see #getAuthor()
   * @generated
   */
  EAttribute getAuthor_Firstname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Author#getSecondname <em>Secondname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondname</em>'.
   * @see org.xtext.library.library.Author#getSecondname()
   * @see #getAuthor()
   * @generated
   */
  EAttribute getAuthor_Secondname();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.Show <em>Show</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show</em>'.
   * @see org.xtext.library.library.Show
   * @generated
   */
  EClass getShow();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.Show#getWhat <em>What</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>What</em>'.
   * @see org.xtext.library.library.Show#getWhat()
   * @see #getShow()
   * @generated
   */
  EAttribute getShow_What();

  /**
   * Returns the meta object for class '{@link org.xtext.library.library.ShowUserAccount <em>Show User Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show User Account</em>'.
   * @see org.xtext.library.library.ShowUserAccount
   * @generated
   */
  EClass getShowUserAccount();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.ShowUserAccount#getFirstname <em>Firstname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Firstname</em>'.
   * @see org.xtext.library.library.ShowUserAccount#getFirstname()
   * @see #getShowUserAccount()
   * @generated
   */
  EAttribute getShowUserAccount_Firstname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.library.library.ShowUserAccount#getSecondname <em>Secondname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondname</em>'.
   * @see org.xtext.library.library.ShowUserAccount#getSecondname()
   * @see #getShowUserAccount()
   * @generated
   */
  EAttribute getShowUserAccount_Secondname();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LibraryFactory getLibraryFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.ModelImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMMANDS = eINSTANCE.getModel_Commands();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.CommandImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.SearchImpl <em>Search</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.SearchImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getSearch()
     * @generated
     */
    EClass SEARCH = eINSTANCE.getSearch();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.AddAuthorImpl <em>Add Author</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.AddAuthorImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getAddAuthor()
     * @generated
     */
    EClass ADD_AUTHOR = eINSTANCE.getAddAuthor();

    /**
     * The meta object literal for the '<em><b>Isbn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_AUTHOR__ISBN = eINSTANCE.getAddAuthor_Isbn();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_AUTHOR__AUTHOR = eINSTANCE.getAddAuthor_Author();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.ByYearImpl <em>By Year</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.ByYearImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getByYear()
     * @generated
     */
    EClass BY_YEAR = eINSTANCE.getByYear();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BY_YEAR__YEAR = eINSTANCE.getByYear_Year();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.ByAuthorImpl <em>By Author</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.ByAuthorImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getByAuthor()
     * @generated
     */
    EClass BY_AUTHOR = eINSTANCE.getByAuthor();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BY_AUTHOR__AUTHOR = eINSTANCE.getByAuthor_Author();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.LendImpl <em>Lend</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.LendImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getLend()
     * @generated
     */
    EClass LEND = eINSTANCE.getLend();

    /**
     * The meta object literal for the '<em><b>Isbn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEND__ISBN = eINSTANCE.getLend_Isbn();

    /**
     * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEND__FIRSTNAME = eINSTANCE.getLend_Firstname();

    /**
     * The meta object literal for the '<em><b>Secondname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEND__SECONDNAME = eINSTANCE.getLend_Secondname();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.AddImpl <em>Add</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.AddImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getAdd()
     * @generated
     */
    EClass ADD = eINSTANCE.getAdd();

    /**
     * The meta object literal for the '<em><b>Isbn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD__ISBN = eINSTANCE.getAdd_Isbn();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD__TITLE = eINSTANCE.getAdd_Title();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD__YEAR = eINSTANCE.getAdd_Year();

    /**
     * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD__AUTHORS = eINSTANCE.getAdd_Authors();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.AddUserImpl <em>Add User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.AddUserImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getAddUser()
     * @generated
     */
    EClass ADD_USER = eINSTANCE.getAddUser();

    /**
     * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_USER__FIRSTNAME = eINSTANCE.getAddUser_Firstname();

    /**
     * The meta object literal for the '<em><b>Secondname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_USER__SECONDNAME = eINSTANCE.getAddUser_Secondname();

    /**
     * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_USER__AGE = eINSTANCE.getAddUser_Age();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.RemoveImpl <em>Remove</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.RemoveImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getRemove()
     * @generated
     */
    EClass REMOVE = eINSTANCE.getRemove();

    /**
     * The meta object literal for the '<em><b>Isbn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOVE__ISBN = eINSTANCE.getRemove_Isbn();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.ReturnImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

    /**
     * The meta object literal for the '<em><b>Isbn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN__ISBN = eINSTANCE.getReturn_Isbn();

    /**
     * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN__FIRSTNAME = eINSTANCE.getReturn_Firstname();

    /**
     * The meta object literal for the '<em><b>Secondname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN__SECONDNAME = eINSTANCE.getReturn_Secondname();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.CheckImpl <em>Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.CheckImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getCheck()
     * @generated
     */
    EClass CHECK = eINSTANCE.getCheck();

    /**
     * The meta object literal for the '<em><b>Isbn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK__ISBN = eINSTANCE.getCheck_Isbn();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.AuthorImpl <em>Author</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.AuthorImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getAuthor()
     * @generated
     */
    EClass AUTHOR = eINSTANCE.getAuthor();

    /**
     * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTHOR__FIRSTNAME = eINSTANCE.getAuthor_Firstname();

    /**
     * The meta object literal for the '<em><b>Secondname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTHOR__SECONDNAME = eINSTANCE.getAuthor_Secondname();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.ShowImpl <em>Show</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.ShowImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getShow()
     * @generated
     */
    EClass SHOW = eINSTANCE.getShow();

    /**
     * The meta object literal for the '<em><b>What</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHOW__WHAT = eINSTANCE.getShow_What();

    /**
     * The meta object literal for the '{@link org.xtext.library.library.impl.ShowUserAccountImpl <em>Show User Account</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.library.library.impl.ShowUserAccountImpl
     * @see org.xtext.library.library.impl.LibraryPackageImpl#getShowUserAccount()
     * @generated
     */
    EClass SHOW_USER_ACCOUNT = eINSTANCE.getShowUserAccount();

    /**
     * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHOW_USER_ACCOUNT__FIRSTNAME = eINSTANCE.getShowUserAccount_Firstname();

    /**
     * The meta object literal for the '<em><b>Secondname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHOW_USER_ACCOUNT__SECONDNAME = eINSTANCE.getShowUserAccount_Secondname();

  }

} //LibraryPackage
