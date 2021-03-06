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

import uk.ac.kcl.inf.mdeoptimiser.languages.scale.Experiment;
import uk.ac.kcl.inf.mdeoptimiser.languages.scale.Infrastructure;
import uk.ac.kcl.inf.mdeoptimiser.languages.scale.Scale;
import uk.ac.kcl.inf.mdeoptimiser.languages.scale.ScalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScaleImpl#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScaleImpl#getExperiments <em>Experiments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScaleImpl extends MinimalEObjectImpl.Container implements Scale
{
  /**
   * The cached value of the '{@link #getInfrastructure() <em>Infrastructure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfrastructure()
   * @generated
   * @ordered
   */
  protected Infrastructure infrastructure;

  /**
   * The cached value of the '{@link #getExperiments() <em>Experiments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExperiments()
   * @generated
   * @ordered
   */
  protected EList<Experiment> experiments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScaleImpl()
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
    return ScalePackage.Literals.SCALE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Infrastructure getInfrastructure()
  {
    return infrastructure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInfrastructure(Infrastructure newInfrastructure, NotificationChain msgs)
  {
    Infrastructure oldInfrastructure = infrastructure;
    infrastructure = newInfrastructure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScalePackage.SCALE__INFRASTRUCTURE, oldInfrastructure, newInfrastructure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfrastructure(Infrastructure newInfrastructure)
  {
    if (newInfrastructure != infrastructure)
    {
      NotificationChain msgs = null;
      if (infrastructure != null)
        msgs = ((InternalEObject)infrastructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScalePackage.SCALE__INFRASTRUCTURE, null, msgs);
      if (newInfrastructure != null)
        msgs = ((InternalEObject)newInfrastructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScalePackage.SCALE__INFRASTRUCTURE, null, msgs);
      msgs = basicSetInfrastructure(newInfrastructure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalePackage.SCALE__INFRASTRUCTURE, newInfrastructure, newInfrastructure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Experiment> getExperiments()
  {
    if (experiments == null)
    {
      experiments = new EObjectContainmentEList<Experiment>(Experiment.class, this, ScalePackage.SCALE__EXPERIMENTS);
    }
    return experiments;
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
      case ScalePackage.SCALE__INFRASTRUCTURE:
        return basicSetInfrastructure(null, msgs);
      case ScalePackage.SCALE__EXPERIMENTS:
        return ((InternalEList<?>)getExperiments()).basicRemove(otherEnd, msgs);
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
      case ScalePackage.SCALE__INFRASTRUCTURE:
        return getInfrastructure();
      case ScalePackage.SCALE__EXPERIMENTS:
        return getExperiments();
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
      case ScalePackage.SCALE__INFRASTRUCTURE:
        setInfrastructure((Infrastructure)newValue);
        return;
      case ScalePackage.SCALE__EXPERIMENTS:
        getExperiments().clear();
        getExperiments().addAll((Collection<? extends Experiment>)newValue);
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
      case ScalePackage.SCALE__INFRASTRUCTURE:
        setInfrastructure((Infrastructure)null);
        return;
      case ScalePackage.SCALE__EXPERIMENTS:
        getExperiments().clear();
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
      case ScalePackage.SCALE__INFRASTRUCTURE:
        return infrastructure != null;
      case ScalePackage.SCALE__EXPERIMENTS:
        return experiments != null && !experiments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScaleImpl
