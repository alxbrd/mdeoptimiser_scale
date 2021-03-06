/**
 * generated by Xtext 2.18.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.mdeoptimiser.languages.scale.Infrastructure;
import uk.ac.kcl.inf.mdeoptimiser.languages.scale.Parameter;
import uk.ac.kcl.inf.mdeoptimiser.languages.scale.ScalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.InfrastructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.InfrastructureImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.InfrastructureImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.InfrastructureImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.InfrastructureImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureImpl extends MinimalEObjectImpl.Container implements Infrastructure
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccount()
   * @generated
   * @ordered
   */
  protected static final String ACCOUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccount()
   * @generated
   * @ordered
   */
  protected String account = ACCOUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironment()
   * @generated
   * @ordered
   */
  protected static final String ENVIRONMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironment()
   * @generated
   * @ordered
   */
  protected String environment = ENVIRONMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfrastructureImpl()
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
    return ScalePackage.Literals.INFRASTRUCTURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalePackage.INFRASTRUCTURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalePackage.INFRASTRUCTURE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAccount()
  {
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccount(String newAccount)
  {
    String oldAccount = account;
    account = newAccount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalePackage.INFRASTRUCTURE__ACCOUNT, oldAccount, account));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnvironment()
  {
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnvironment(String newEnvironment)
  {
    String oldEnvironment = environment;
    environment = newEnvironment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalePackage.INFRASTRUCTURE__ENVIRONMENT, oldEnvironment, environment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ScalePackage.INFRASTRUCTURE__PARAMETERS);
    }
    return parameters;
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
      case ScalePackage.INFRASTRUCTURE__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case ScalePackage.INFRASTRUCTURE__NAME:
        return getName();
      case ScalePackage.INFRASTRUCTURE__TYPE:
        return getType();
      case ScalePackage.INFRASTRUCTURE__ACCOUNT:
        return getAccount();
      case ScalePackage.INFRASTRUCTURE__ENVIRONMENT:
        return getEnvironment();
      case ScalePackage.INFRASTRUCTURE__PARAMETERS:
        return getParameters();
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
      case ScalePackage.INFRASTRUCTURE__NAME:
        setName((String)newValue);
        return;
      case ScalePackage.INFRASTRUCTURE__TYPE:
        setType((String)newValue);
        return;
      case ScalePackage.INFRASTRUCTURE__ACCOUNT:
        setAccount((String)newValue);
        return;
      case ScalePackage.INFRASTRUCTURE__ENVIRONMENT:
        setEnvironment((String)newValue);
        return;
      case ScalePackage.INFRASTRUCTURE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
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
      case ScalePackage.INFRASTRUCTURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScalePackage.INFRASTRUCTURE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ScalePackage.INFRASTRUCTURE__ACCOUNT:
        setAccount(ACCOUNT_EDEFAULT);
        return;
      case ScalePackage.INFRASTRUCTURE__ENVIRONMENT:
        setEnvironment(ENVIRONMENT_EDEFAULT);
        return;
      case ScalePackage.INFRASTRUCTURE__PARAMETERS:
        getParameters().clear();
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
      case ScalePackage.INFRASTRUCTURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScalePackage.INFRASTRUCTURE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case ScalePackage.INFRASTRUCTURE__ACCOUNT:
        return ACCOUNT_EDEFAULT == null ? account != null : !ACCOUNT_EDEFAULT.equals(account);
      case ScalePackage.INFRASTRUCTURE__ENVIRONMENT:
        return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
      case ScalePackage.INFRASTRUCTURE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", account: ");
    result.append(account);
    result.append(", environment: ");
    result.append(environment);
    result.append(')');
    return result.toString();
  }

} //InfrastructureImpl
