/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.asset.display.template.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.TypedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AssetDisplayTemplate service. Represents a row in the &quot;AssetDisplayTemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.asset.display.template.model.impl.AssetDisplayTemplateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.asset.display.template.model.impl.AssetDisplayTemplateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetDisplayTemplate
 * @see com.liferay.asset.display.template.model.impl.AssetDisplayTemplateImpl
 * @see com.liferay.asset.display.template.model.impl.AssetDisplayTemplateModelImpl
 * @generated
 */
@ProviderType
public interface AssetDisplayTemplateModel extends BaseModel<AssetDisplayTemplate>,
	GroupedModel, ShardedModel, TypedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a asset display template model instance should use the {@link AssetDisplayTemplate} interface instead.
	 */

	/**
	 * Returns the primary key of this asset display template.
	 *
	 * @return the primary key of this asset display template
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this asset display template.
	 *
	 * @param primaryKey the primary key of this asset display template
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the asset display template ID of this asset display template.
	 *
	 * @return the asset display template ID of this asset display template
	 */
	public long getAssetDisplayTemplateId();

	/**
	 * Sets the asset display template ID of this asset display template.
	 *
	 * @param assetDisplayTemplateId the asset display template ID of this asset display template
	 */
	public void setAssetDisplayTemplateId(long assetDisplayTemplateId);

	/**
	 * Returns the group ID of this asset display template.
	 *
	 * @return the group ID of this asset display template
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this asset display template.
	 *
	 * @param groupId the group ID of this asset display template
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this asset display template.
	 *
	 * @return the company ID of this asset display template
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this asset display template.
	 *
	 * @param companyId the company ID of this asset display template
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this asset display template.
	 *
	 * @return the user ID of this asset display template
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this asset display template.
	 *
	 * @param userId the user ID of this asset display template
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this asset display template.
	 *
	 * @return the user uuid of this asset display template
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this asset display template.
	 *
	 * @param userUuid the user uuid of this asset display template
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this asset display template.
	 *
	 * @return the user name of this asset display template
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this asset display template.
	 *
	 * @param userName the user name of this asset display template
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this asset display template.
	 *
	 * @return the create date of this asset display template
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this asset display template.
	 *
	 * @param createDate the create date of this asset display template
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this asset display template.
	 *
	 * @return the modified date of this asset display template
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this asset display template.
	 *
	 * @param modifiedDate the modified date of this asset display template
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this asset display template.
	 *
	 * @return the name of this asset display template
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this asset display template.
	 *
	 * @param name the name of this asset display template
	 */
	public void setName(String name);

	/**
	 * Returns the fully qualified class name of this asset display template.
	 *
	 * @return the fully qualified class name of this asset display template
	 */
	@Override
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this asset display template.
	 *
	 * @return the class name ID of this asset display template
	 */
	@Override
	public long getClassNameId();

	/**
	 * Sets the class name ID of this asset display template.
	 *
	 * @param classNameId the class name ID of this asset display template
	 */
	@Override
	public void setClassNameId(long classNameId);

	/**
	 * Returns the template ID of this asset display template.
	 *
	 * @return the template ID of this asset display template
	 */
	public long getTemplateId();

	/**
	 * Sets the template ID of this asset display template.
	 *
	 * @param templateId the template ID of this asset display template
	 */
	public void setTemplateId(long templateId);

	/**
	 * Returns the main of this asset display template.
	 *
	 * @return the main of this asset display template
	 */
	public boolean getMain();

	/**
	 * Returns <code>true</code> if this asset display template is main.
	 *
	 * @return <code>true</code> if this asset display template is main; <code>false</code> otherwise
	 */
	public boolean isMain();

	/**
	 * Sets whether this asset display template is main.
	 *
	 * @param main the main of this asset display template
	 */
	public void setMain(boolean main);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(AssetDisplayTemplate assetDisplayTemplate);

	@Override
	public int hashCode();

	@Override
	public CacheModel<AssetDisplayTemplate> toCacheModel();

	@Override
	public AssetDisplayTemplate toEscapedModel();

	@Override
	public AssetDisplayTemplate toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}