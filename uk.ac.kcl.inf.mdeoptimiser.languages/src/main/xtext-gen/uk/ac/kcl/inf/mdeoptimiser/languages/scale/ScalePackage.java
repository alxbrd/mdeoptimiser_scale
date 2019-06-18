/**
 * generated by Xtext 2.16.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.scale;

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
 * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.ScaleFactory
 * @model kind="package"
 * @generated
 */
public interface ScalePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "scale";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/kcl/inf/mdeoptimiser/languages/Scale";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "scale";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScalePackage eINSTANCE = uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScalePackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScaleImpl <em>Scale</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScaleImpl
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScalePackageImpl#getScale()
   * @generated
   */
  int SCALE = 0;

  /**
   * The feature id for the '<em><b>Infrastructure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE__INFRASTRUCTURE = 0;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE__TASKS = 1;

  /**
   * The number of structural features of the '<em>Scale</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.InfrastructureImpl
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScalePackageImpl#getInfrastructure()
   * @generated
   */
  int INFRASTRUCTURE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Account</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE__ACCOUNT = 2;

  /**
   * The number of structural features of the '<em>Infrastructure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.TaskImpl
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScalePackageImpl#getTask()
   * @generated
   */
  int TASK = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>Run</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__RUN = 1;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DEPENDENCIES = 2;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.RunConfigurationImpl <em>Run Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.RunConfigurationImpl
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScalePackageImpl#getRunConfiguration()
   * @generated
   */
  int RUN_CONFIGURATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_CONFIGURATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Run Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_CONFIGURATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.DependencyImpl
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScalePackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__NAME = 0;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Scale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Scale
   * @generated
   */
  EClass getScale();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Scale#getInfrastructure <em>Infrastructure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Infrastructure</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Scale#getInfrastructure()
   * @see #getScale()
   * @generated
   */
  EReference getScale_Infrastructure();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Scale#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Scale#getTasks()
   * @see #getScale()
   * @generated
   */
  EReference getScale_Tasks();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Infrastructure <em>Infrastructure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infrastructure</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Infrastructure
   * @generated
   */
  EClass getInfrastructure();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Infrastructure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Infrastructure#getName()
   * @see #getInfrastructure()
   * @generated
   */
  EAttribute getInfrastructure_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Infrastructure#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Infrastructure#getType()
   * @see #getInfrastructure()
   * @generated
   */
  EAttribute getInfrastructure_Type();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Infrastructure#getAccount <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Account</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Infrastructure#getAccount()
   * @see #getInfrastructure()
   * @generated
   */
  EAttribute getInfrastructure_Account();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Task#getRun <em>Run</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Run</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Task#getRun()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Run();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Task#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dependencies</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Task#getDependencies()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Dependencies();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.RunConfiguration <em>Run Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Run Configuration</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.RunConfiguration
   * @generated
   */
  EClass getRunConfiguration();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.RunConfiguration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.RunConfiguration#getName()
   * @see #getRunConfiguration()
   * @generated
   */
  EAttribute getRunConfiguration_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.Dependency#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.Dependency#getName()
   * @see #getDependency()
   * @generated
   */
  EAttribute getDependency_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ScaleFactory getScaleFactory();

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
     * The meta object literal for the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScaleImpl <em>Scale</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScaleImpl
     * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScalePackageImpl#getScale()
     * @generated
     */
    EClass SCALE = eINSTANCE.getScale();

    /**
     * The meta object literal for the '<em><b>Infrastructure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCALE__INFRASTRUCTURE = eINSTANCE.getScale_Infrastructure();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCALE__TASKS = eINSTANCE.getScale_Tasks();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.InfrastructureImpl
     * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScalePackageImpl#getInfrastructure()
     * @generated
     */
    EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE__NAME = eINSTANCE.getInfrastructure_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE__TYPE = eINSTANCE.getInfrastructure_Type();

    /**
     * The meta object literal for the '<em><b>Account</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE__ACCOUNT = eINSTANCE.getInfrastructure_Account();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.TaskImpl
     * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScalePackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__NAME = eINSTANCE.getTask_Name();

    /**
     * The meta object literal for the '<em><b>Run</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__RUN = eINSTANCE.getTask_Run();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__DEPENDENCIES = eINSTANCE.getTask_Dependencies();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.RunConfigurationImpl <em>Run Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.RunConfigurationImpl
     * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScalePackageImpl#getRunConfiguration()
     * @generated
     */
    EClass RUN_CONFIGURATION = eINSTANCE.getRunConfiguration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN_CONFIGURATION__NAME = eINSTANCE.getRunConfiguration_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.DependencyImpl
     * @see uk.ac.kcl.inf.mdeoptimiser.languages.scale.impl.ScalePackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY__NAME = eINSTANCE.getDependency_Name();

  }

} //ScalePackage