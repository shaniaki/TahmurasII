/**
 */
package tahmuras.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tahmuras.ApplicationModel;
import tahmuras.TahmurasFactory;
import tahmuras.TahmurasPackage;

/**
 * This is the item provider adapter for a {@link tahmuras.ApplicationModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addApplicationcomponentPropertyDescriptor(object);
			addPerformancemetricPropertyDescriptor(object);
			addConstraintPropertyDescriptor(object);
			addBinaryrelationPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Applicationcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicationModel_applicationcomponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicationModel_applicationcomponent_feature", "_UI_ApplicationModel_type"),
				 TahmurasPackage.Literals.APPLICATION_MODEL__APPLICATIONCOMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Performancemetric feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerformancemetricPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicationModel_performancemetric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicationModel_performancemetric_feature", "_UI_ApplicationModel_type"),
				 TahmurasPackage.Literals.APPLICATION_MODEL__PERFORMANCEMETRIC,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicationModel_constraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicationModel_constraint_feature", "_UI_ApplicationModel_type"),
				 TahmurasPackage.Literals.APPLICATION_MODEL__CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Binaryrelation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBinaryrelationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicationModel_binaryrelation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicationModel_binaryrelation_feature", "_UI_ApplicationModel_type"),
				 TahmurasPackage.Literals.APPLICATION_MODEL__BINARYRELATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ApplicationModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ApplicationModel_name_feature", "_UI_ApplicationModel_type"),
				 TahmurasPackage.Literals.APPLICATION_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TahmurasPackage.Literals.APPLICATION_MODEL__APPLICATIONCOMPONENT);
			childrenFeatures.add(TahmurasPackage.Literals.APPLICATION_MODEL__PERFORMANCEMETRIC);
			childrenFeatures.add(TahmurasPackage.Literals.APPLICATION_MODEL__CONSTRAINT);
			childrenFeatures.add(TahmurasPackage.Literals.APPLICATION_MODEL__BINARYRELATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ApplicationModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ApplicationModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ApplicationModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ApplicationModel_type") :
			getString("_UI_ApplicationModel_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ApplicationModel.class)) {
			case TahmurasPackage.APPLICATION_MODEL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TahmurasPackage.APPLICATION_MODEL__APPLICATIONCOMPONENT:
			case TahmurasPackage.APPLICATION_MODEL__PERFORMANCEMETRIC:
			case TahmurasPackage.APPLICATION_MODEL__CONSTRAINT:
			case TahmurasPackage.APPLICATION_MODEL__BINARYRELATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TahmurasPackage.Literals.APPLICATION_MODEL__APPLICATIONCOMPONENT,
				 TahmurasFactory.eINSTANCE.createApplicationComponent()));

		newChildDescriptors.add
			(createChildParameter
				(TahmurasPackage.Literals.APPLICATION_MODEL__PERFORMANCEMETRIC,
				 TahmurasFactory.eINSTANCE.createPerformanceMetric()));

		newChildDescriptors.add
			(createChildParameter
				(TahmurasPackage.Literals.APPLICATION_MODEL__CONSTRAINT,
				 TahmurasFactory.eINSTANCE.createClockConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TahmurasPackage.Literals.APPLICATION_MODEL__CONSTRAINT,
				 TahmurasFactory.eINSTANCE.createInstantiationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TahmurasPackage.Literals.APPLICATION_MODEL__BINARYRELATION,
				 TahmurasFactory.eINSTANCE.createBinaryRelation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TahmurasEditPlugin.INSTANCE;
	}

}
