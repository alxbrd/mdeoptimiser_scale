/**
 * generated by Xtext 2.18.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.mdeoptimiser.languages.scale.Dependency;
import uk.ac.kcl.inf.mdeoptimiser.languages.scale.RunConfiguration;
import uk.ac.kcl.inf.mdeoptimiser.languages.scale.ScalePackage;
import uk.ac.kcl.inf.mdeoptimiser.languages.scale.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.TaskImpl#getRun <em>Run</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.TaskImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task
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
   * The cached value of the '{@link #getRun() <em>Run</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRun()
   * @generated
   * @ordered
   */
  protected RunConfiguration run;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected Dependency dependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
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
    return ScalePackage.Literals.TASK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalePackage.TASK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunConfiguration getRun()
  {
    return run;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRun(RunConfiguration newRun, NotificationChain msgs)
  {
    RunConfiguration oldRun = run;
    run = newRun;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScalePackage.TASK__RUN, oldRun, newRun);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRun(RunConfiguration newRun)
  {
    if (newRun != run)
    {
      NotificationChain msgs = null;
      if (run != null)
        msgs = ((InternalEObject)run).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScalePackage.TASK__RUN, null, msgs);
      if (newRun != null)
        msgs = ((InternalEObject)newRun).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScalePackage.TASK__RUN, null, msgs);
      msgs = basicSetRun(newRun, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalePackage.TASK__RUN, newRun, newRun));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependency getDependencies()
  {
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDependencies(Dependency newDependencies, NotificationChain msgs)
  {
    Dependency oldDependencies = dependencies;
    dependencies = newDependencies;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScalePackage.TASK__DEPENDENCIES, oldDependencies, newDependencies);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependencies(Dependency newDependencies)
  {
    if (newDependencies != dependencies)
    {
      NotificationChain msgs = null;
      if (dependencies != null)
        msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScalePackage.TASK__DEPENDENCIES, null, msgs);
      if (newDependencies != null)
        msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScalePackage.TASK__DEPENDENCIES, null, msgs);
      msgs = basicSetDependencies(newDependencies, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalePackage.TASK__DEPENDENCIES, newDependencies, newDependencies));
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
      case ScalePackage.TASK__RUN:
        return basicSetRun(null, msgs);
      case ScalePackage.TASK__DEPENDENCIES:
        return basicSetDependencies(null, msgs);
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
      case ScalePackage.TASK__NAME:
        return getName();
      case ScalePackage.TASK__RUN:
        return getRun();
      case ScalePackage.TASK__DEPENDENCIES:
        return getDependencies();
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
      case ScalePackage.TASK__NAME:
        setName((String)newValue);
        return;
      case ScalePackage.TASK__RUN:
        setRun((RunConfiguration)newValue);
        return;
      case ScalePackage.TASK__DEPENDENCIES:
        setDependencies((Dependency)newValue);
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
      case ScalePackage.TASK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScalePackage.TASK__RUN:
        setRun((RunConfiguration)null);
        return;
      case ScalePackage.TASK__DEPENDENCIES:
        setDependencies((Dependency)null);
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
      case ScalePackage.TASK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScalePackage.TASK__RUN:
        return run != null;
      case ScalePackage.TASK__DEPENDENCIES:
        return dependencies != null;
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
    result.append(')');
    return result.toString();
  }

} //TaskImpl
