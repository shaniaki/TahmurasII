/**
 */
package tahmuras.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import tahmuras.BinaryRelation;
import tahmuras.BindingModel;
import tahmuras.Constraint;
import tahmuras.TahmurasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.impl.BindingModelImpl#getBinaryrelation <em>Binaryrelation</em>}</li>
 *   <li>{@link tahmuras.impl.BindingModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link tahmuras.impl.BindingModelImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingModelImpl extends MinimalEObjectImpl.Container implements BindingModel {
	/**
	 * The cached value of the '{@link #getBinaryrelation() <em>Binaryrelation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryrelation()
	 * @generated
	 * @ordered
	 */
	protected BinaryRelation binaryrelation;

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
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TahmurasPackage.Literals.BINDING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRelation getBinaryrelation() {
		return binaryrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryrelation(BinaryRelation newBinaryrelation, NotificationChain msgs) {
		BinaryRelation oldBinaryrelation = binaryrelation;
		binaryrelation = newBinaryrelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TahmurasPackage.BINDING_MODEL__BINARYRELATION, oldBinaryrelation, newBinaryrelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryrelation(BinaryRelation newBinaryrelation) {
		if (newBinaryrelation != binaryrelation) {
			NotificationChain msgs = null;
			if (binaryrelation != null)
				msgs = ((InternalEObject)binaryrelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TahmurasPackage.BINDING_MODEL__BINARYRELATION, null, msgs);
			if (newBinaryrelation != null)
				msgs = ((InternalEObject)newBinaryrelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TahmurasPackage.BINDING_MODEL__BINARYRELATION, null, msgs);
			msgs = basicSetBinaryrelation(newBinaryrelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TahmurasPackage.BINDING_MODEL__BINARYRELATION, newBinaryrelation, newBinaryrelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TahmurasPackage.BINDING_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectResolvingEList<Constraint>(Constraint.class, this, TahmurasPackage.BINDING_MODEL__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TahmurasPackage.BINDING_MODEL__BINARYRELATION:
				return basicSetBinaryrelation(null, msgs);
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
			case TahmurasPackage.BINDING_MODEL__BINARYRELATION:
				return getBinaryrelation();
			case TahmurasPackage.BINDING_MODEL__NAME:
				return getName();
			case TahmurasPackage.BINDING_MODEL__CONSTRAINT:
				return getConstraint();
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
			case TahmurasPackage.BINDING_MODEL__BINARYRELATION:
				setBinaryrelation((BinaryRelation)newValue);
				return;
			case TahmurasPackage.BINDING_MODEL__NAME:
				setName((String)newValue);
				return;
			case TahmurasPackage.BINDING_MODEL__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
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
			case TahmurasPackage.BINDING_MODEL__BINARYRELATION:
				setBinaryrelation((BinaryRelation)null);
				return;
			case TahmurasPackage.BINDING_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TahmurasPackage.BINDING_MODEL__CONSTRAINT:
				getConstraint().clear();
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
			case TahmurasPackage.BINDING_MODEL__BINARYRELATION:
				return binaryrelation != null;
			case TahmurasPackage.BINDING_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TahmurasPackage.BINDING_MODEL__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BindingModelImpl
