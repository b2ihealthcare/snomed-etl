/**
 * Copyright 2020-2022 B2i Healthcare, https://b2ihealthcare.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.b2international.snomed.etl.etl.impl;

import com.b2international.snomed.etl.etl.Attribute;
import com.b2international.snomed.etl.etl.AttributeGroup;
import com.b2international.snomed.etl.etl.EtlPackage;
import com.b2international.snomed.etl.etl.Refinement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.etl.etl.impl.RefinementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.b2international.snomed.etl.etl.impl.RefinementImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinementImpl extends MinimalEObjectImpl.Container implements Refinement
{
  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<AttributeGroup> groups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefinementImpl()
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
    return EtlPackage.Literals.REFINEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, EtlPackage.REFINEMENT__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AttributeGroup> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<AttributeGroup>(AttributeGroup.class, this, EtlPackage.REFINEMENT__GROUPS);
    }
    return groups;
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
      case EtlPackage.REFINEMENT__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case EtlPackage.REFINEMENT__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
      case EtlPackage.REFINEMENT__ATTRIBUTES:
        return getAttributes();
      case EtlPackage.REFINEMENT__GROUPS:
        return getGroups();
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
      case EtlPackage.REFINEMENT__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case EtlPackage.REFINEMENT__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends AttributeGroup>)newValue);
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
      case EtlPackage.REFINEMENT__ATTRIBUTES:
        getAttributes().clear();
        return;
      case EtlPackage.REFINEMENT__GROUPS:
        getGroups().clear();
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
      case EtlPackage.REFINEMENT__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case EtlPackage.REFINEMENT__GROUPS:
        return groups != null && !groups.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefinementImpl
