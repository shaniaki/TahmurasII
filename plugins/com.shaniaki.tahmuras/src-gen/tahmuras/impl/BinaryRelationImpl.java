/**
 */
package tahmuras.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tahmuras.BinaryRelation;
import tahmuras.Component;
import tahmuras.TahmurasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tahmuras.impl.BinaryRelationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link tahmuras.impl.BinaryRelationImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link tahmuras.impl.BinaryRelationImpl#getCodomain <em>Codomain</em>}</li>
 *   <li>{@link tahmuras.impl.BinaryRelationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryRelationImpl extends MinimalEObjectImpl.Container implements BinaryRelation {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;
	/**
	 * The default value of the '{@link #getCodomain() <em>Codomain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodomain()
	 * @generated
	 * @ordered
	 */
	protected static final String CODOMAIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCodomain() <em>Codomain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodomain()
	 * @generated
	 * @ordered
	 */
	protected String codomain = CODOMAIN_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TahmurasPackage.Literals.BINARY_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectResolvingEList<Component>(Component.class, this, TahmurasPackage.BINARY_RELATION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TahmurasPackage.BINARY_RELATION__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodomain() {
		return codomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodomain(String newCodomain) {
		String oldCodomain = codomain;
		codomain = newCodomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TahmurasPackage.BINARY_RELATION__CODOMAIN, oldCodomain, codomain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TahmurasPackage.BINARY_RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TahmurasPackage.BINARY_RELATION__COMPONENT:
				return getComponent();
			case TahmurasPackage.BINARY_RELATION__DOMAIN:
				return getDomain();
			case TahmurasPackage.BINARY_RELATION__CODOMAIN:
				return getCodomain();
			case TahmurasPackage.BINARY_RELATION__NAME:
				return getName();
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
			case TahmurasPackage.BINARY_RELATION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case TahmurasPackage.BINARY_RELATION__DOMAIN:
				setDomain((String)newValue);
				return;
			case TahmurasPackage.BINARY_RELATION__CODOMAIN:
				setCodomain((String)newValue);
				return;
			case TahmurasPackage.BINARY_RELATION__NAME:
				setName((String)newValue);
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
			case TahmurasPackage.BINARY_RELATION__COMPONENT:
				getComponent().clear();
				return;
			case TahmurasPackage.BINARY_RELATION__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case TahmurasPackage.BINARY_RELATION__CODOMAIN:
				setCodomain(CODOMAIN_EDEFAULT);
				return;
			case TahmurasPackage.BINARY_RELATION__NAME:
				setName(NAME_EDEFAULT);
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
			case TahmurasPackage.BINARY_RELATION__COMPONENT:
				return component != null && !component.isEmpty();
			case TahmurasPackage.BINARY_RELATION__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case TahmurasPackage.BINARY_RELATION__CODOMAIN:
				return CODOMAIN_EDEFAULT == null ? codomain != null : !CODOMAIN_EDEFAULT.equals(codomain);
			case TahmurasPackage.BINARY_RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (domain: ");
		result.append(domain);
		result.append(", codomain: ");
		result.append(codomain);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BinaryRelationImpl
