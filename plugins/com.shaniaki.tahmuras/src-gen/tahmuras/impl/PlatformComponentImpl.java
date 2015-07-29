/**
 */
package tahmuras.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tahmuras.CostMetric;
import tahmuras.PlatformComponent;
import tahmuras.TahmurasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.impl.PlatformComponentImpl#getCostmetric <em>Costmetric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformComponentImpl extends ComponentImpl implements PlatformComponent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TahmurasPackage.Literals.PLATFORM_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CostMetric> getCostmetric() {
		if (costmetric == null) {
			costmetric = new EObjectContainmentEList<CostMetric>(CostMetric.class, this, TahmurasPackage.PLATFORM_COMPONENT__COSTMETRIC);
		}
		return costmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TahmurasPackage.PLATFORM_COMPONENT__COSTMETRIC:
				return ((InternalEList<?>)getCostmetric()).basicRemove(otherEnd, msgs);
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
			case TahmurasPackage.PLATFORM_COMPONENT__COSTMETRIC:
				return getCostmetric();
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
			case TahmurasPackage.PLATFORM_COMPONENT__COSTMETRIC:
				getCostmetric().clear();
				getCostmetric().addAll((Collection<? extends CostMetric>)newValue);
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
			case TahmurasPackage.PLATFORM_COMPONENT__COSTMETRIC:
				getCostmetric().clear();
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
			case TahmurasPackage.PLATFORM_COMPONENT__COSTMETRIC:
				return costmetric != null && !costmetric.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformComponentImpl
