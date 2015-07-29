/**
 */
package tahmuras.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tahmuras.BinaryRelation;
import tahmuras.Constraint;
import tahmuras.CostMetric;
import tahmuras.PlatformComponent;
import tahmuras.PlatformModel;
import tahmuras.TahmurasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.impl.PlatformModelImpl#getPlatformcomponent <em>Platformcomponent</em>}</li>
 *   <li>{@link tahmuras.impl.PlatformModelImpl#getCostmetric <em>Costmetric</em>}</li>
 *   <li>{@link tahmuras.impl.PlatformModelImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tahmuras.impl.PlatformModelImpl#getBinaryrelation <em>Binaryrelation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformModelImpl extends MinimalEObjectImpl.Container implements PlatformModel {
	/**
	 * The cached value of the '{@link #getPlatformcomponent() <em>Platformcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformComponent> platformcomponent;

	/**
	 * The cached value of the '{@link #getCostmetric() <em>Costmetric</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostmetric()
	 * @generated
	 * @ordered
	 */
	protected EList<CostMetric> costmetric;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getBinaryrelation() <em>Binaryrelation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryrelation()
	 * @generated
	 * @ordered
	 */
	protected EList<BinaryRelation> binaryrelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TahmurasPackage.Literals.PLATFORM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformComponent> getPlatformcomponent() {
		if (platformcomponent == null) {
			platformcomponent = new EObjectContainmentEList<PlatformComponent>(PlatformComponent.class, this, TahmurasPackage.PLATFORM_MODEL__PLATFORMCOMPONENT);
		}
		return platformcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CostMetric> getCostmetric() {
		if (costmetric == null) {
			costmetric = new EObjectContainmentEList<CostMetric>(CostMetric.class, this, TahmurasPackage.PLATFORM_MODEL__COSTMETRIC);
		}
		return costmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, TahmurasPackage.PLATFORM_MODEL__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryRelation> getBinaryrelation() {
		if (binaryrelation == null) {
			binaryrelation = new EObjectContainmentEList<BinaryRelation>(BinaryRelation.class, this, TahmurasPackage.PLATFORM_MODEL__BINARYRELATION);
		}
		return binaryrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TahmurasPackage.PLATFORM_MODEL__PLATFORMCOMPONENT:
				return ((InternalEList<?>)getPlatformcomponent()).basicRemove(otherEnd, msgs);
			case TahmurasPackage.PLATFORM_MODEL__COSTMETRIC:
				return ((InternalEList<?>)getCostmetric()).basicRemove(otherEnd, msgs);
			case TahmurasPackage.PLATFORM_MODEL__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case TahmurasPackage.PLATFORM_MODEL__BINARYRELATION:
				return ((InternalEList<?>)getBinaryrelation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TahmurasPackage.PLATFORM_MODEL__PLATFORMCOMPONENT:
				return getPlatformcomponent();
			case TahmurasPackage.PLATFORM_MODEL__COSTMETRIC:
				return getCostmetric();
			case TahmurasPackage.PLATFORM_MODEL__CONSTRAINT:
				return getConstraint();
			case TahmurasPackage.PLATFORM_MODEL__BINARYRELATION:
				return getBinaryrelation();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TahmurasPackage.PLATFORM_MODEL__PLATFORMCOMPONENT:
				getPlatformcomponent().clear();
				getPlatformcomponent().addAll((Collection<? extends PlatformComponent>)newValue);
				return;
			case TahmurasPackage.PLATFORM_MODEL__COSTMETRIC:
				getCostmetric().clear();
				getCostmetric().addAll((Collection<? extends CostMetric>)newValue);
				return;
			case TahmurasPackage.PLATFORM_MODEL__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case TahmurasPackage.PLATFORM_MODEL__BINARYRELATION:
				getBinaryrelation().clear();
				getBinaryrelation().addAll((Collection<? extends BinaryRelation>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case TahmurasPackage.PLATFORM_MODEL__PLATFORMCOMPONENT:
				getPlatformcomponent().clear();
				return;
			case TahmurasPackage.PLATFORM_MODEL__COSTMETRIC:
				getCostmetric().clear();
				return;
			case TahmurasPackage.PLATFORM_MODEL__CONSTRAINT:
				getConstraint().clear();
				return;
			case TahmurasPackage.PLATFORM_MODEL__BINARYRELATION:
				getBinaryrelation().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TahmurasPackage.PLATFORM_MODEL__PLATFORMCOMPONENT:
				return platformcomponent != null && !platformcomponent.isEmpty();
			case TahmurasPackage.PLATFORM_MODEL__COSTMETRIC:
				return costmetric != null && !costmetric.isEmpty();
			case TahmurasPackage.PLATFORM_MODEL__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case TahmurasPackage.PLATFORM_MODEL__BINARYRELATION:
				return binaryrelation != null && !binaryrelation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformModelImpl
