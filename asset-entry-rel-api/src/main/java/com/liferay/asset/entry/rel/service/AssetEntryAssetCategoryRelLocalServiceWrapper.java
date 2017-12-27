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

package com.liferay.asset.entry.rel.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssetEntryAssetCategoryRelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssetEntryAssetCategoryRelLocalService
 * @generated
 */
@ProviderType
public class AssetEntryAssetCategoryRelLocalServiceWrapper
	implements AssetEntryAssetCategoryRelLocalService,
		ServiceWrapper<AssetEntryAssetCategoryRelLocalService> {
	public AssetEntryAssetCategoryRelLocalServiceWrapper(
		AssetEntryAssetCategoryRelLocalService assetEntryAssetCategoryRelLocalService) {
		_assetEntryAssetCategoryRelLocalService = assetEntryAssetCategoryRelLocalService;
	}

	/**
	* Adds the asset entry asset category rel to the database. Also notifies the appropriate model listeners.
	*
	* @param assetEntryAssetCategoryRel the asset entry asset category rel
	* @return the asset entry asset category rel that was added
	*/
	@Override
	public com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel addAssetEntryAssetCategoryRel(
		com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel assetEntryAssetCategoryRel) {
		return _assetEntryAssetCategoryRelLocalService.addAssetEntryAssetCategoryRel(assetEntryAssetCategoryRel);
	}

	@Override
	public com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel addAssetEntryAssetCategoryRel(
		long entryId, long categoryId) {
		return _assetEntryAssetCategoryRelLocalService.addAssetEntryAssetCategoryRel(entryId,
			categoryId);
	}

	/**
	* Creates a new asset entry asset category rel with the primary key. Does not add the asset entry asset category rel to the database.
	*
	* @param assetEntryAssetCategoryRelId the primary key for the new asset entry asset category rel
	* @return the new asset entry asset category rel
	*/
	@Override
	public com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel createAssetEntryAssetCategoryRel(
		long assetEntryAssetCategoryRelId) {
		return _assetEntryAssetCategoryRelLocalService.createAssetEntryAssetCategoryRel(assetEntryAssetCategoryRelId);
	}

	/**
	* Deletes the asset entry asset category rel from the database. Also notifies the appropriate model listeners.
	*
	* @param assetEntryAssetCategoryRel the asset entry asset category rel
	* @return the asset entry asset category rel that was removed
	*/
	@Override
	public com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel deleteAssetEntryAssetCategoryRel(
		com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel assetEntryAssetCategoryRel) {
		return _assetEntryAssetCategoryRelLocalService.deleteAssetEntryAssetCategoryRel(assetEntryAssetCategoryRel);
	}

	/**
	* Deletes the asset entry asset category rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetEntryAssetCategoryRelId the primary key of the asset entry asset category rel
	* @return the asset entry asset category rel that was removed
	* @throws PortalException if a asset entry asset category rel with the primary key could not be found
	*/
	@Override
	public com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel deleteAssetEntryAssetCategoryRel(
		long assetEntryAssetCategoryRelId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetEntryAssetCategoryRelLocalService.deleteAssetEntryAssetCategoryRel(assetEntryAssetCategoryRelId);
	}

	@Override
	public void deleteAssetEntryAssetCategoryRelByCategoryId(long categoryId) {
		_assetEntryAssetCategoryRelLocalService.deleteAssetEntryAssetCategoryRelByCategoryId(categoryId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetEntryAssetCategoryRelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetEntryAssetCategoryRelLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _assetEntryAssetCategoryRelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.asset.entry.rel.model.impl.AssetEntryAssetCategoryRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _assetEntryAssetCategoryRelLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.asset.entry.rel.model.impl.AssetEntryAssetCategoryRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _assetEntryAssetCategoryRelLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _assetEntryAssetCategoryRelLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _assetEntryAssetCategoryRelLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel fetchAssetEntryAssetCategoryRel(
		long assetEntryAssetCategoryRelId) {
		return _assetEntryAssetCategoryRelLocalService.fetchAssetEntryAssetCategoryRel(assetEntryAssetCategoryRelId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _assetEntryAssetCategoryRelLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the asset entry asset category rel with the primary key.
	*
	* @param assetEntryAssetCategoryRelId the primary key of the asset entry asset category rel
	* @return the asset entry asset category rel
	* @throws PortalException if a asset entry asset category rel with the primary key could not be found
	*/
	@Override
	public com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel getAssetEntryAssetCategoryRel(
		long assetEntryAssetCategoryRelId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetEntryAssetCategoryRelLocalService.getAssetEntryAssetCategoryRel(assetEntryAssetCategoryRelId);
	}

	/**
	* Returns a range of all the asset entry asset category rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.asset.entry.rel.model.impl.AssetEntryAssetCategoryRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset entry asset category rels
	* @param end the upper bound of the range of asset entry asset category rels (not inclusive)
	* @return the range of asset entry asset category rels
	*/
	@Override
	public java.util.List<com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel> getAssetEntryAssetCategoryRels(
		int start, int end) {
		return _assetEntryAssetCategoryRelLocalService.getAssetEntryAssetCategoryRels(start,
			end);
	}

	@Override
	public java.util.List<com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel> getAssetEntryAssetCategoryRelsByCategoryId(
		long categoryId) {
		return _assetEntryAssetCategoryRelLocalService.getAssetEntryAssetCategoryRelsByCategoryId(categoryId);
	}

	@Override
	public java.util.List<com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel> getAssetEntryAssetCategoryRelsByEntryId(
		long entryId) {
		return _assetEntryAssetCategoryRelLocalService.getAssetEntryAssetCategoryRelsByEntryId(entryId);
	}

	/**
	* Returns the number of asset entry asset category rels.
	*
	* @return the number of asset entry asset category rels
	*/
	@Override
	public int getAssetEntryAssetCategoryRelsCount() {
		return _assetEntryAssetCategoryRelLocalService.getAssetEntryAssetCategoryRelsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _assetEntryAssetCategoryRelLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _assetEntryAssetCategoryRelLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetEntryAssetCategoryRelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the asset entry asset category rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetEntryAssetCategoryRel the asset entry asset category rel
	* @return the asset entry asset category rel that was updated
	*/
	@Override
	public com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel updateAssetEntryAssetCategoryRel(
		com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel assetEntryAssetCategoryRel) {
		return _assetEntryAssetCategoryRelLocalService.updateAssetEntryAssetCategoryRel(assetEntryAssetCategoryRel);
	}

	@Override
	public AssetEntryAssetCategoryRelLocalService getWrappedService() {
		return _assetEntryAssetCategoryRelLocalService;
	}

	@Override
	public void setWrappedService(
		AssetEntryAssetCategoryRelLocalService assetEntryAssetCategoryRelLocalService) {
		_assetEntryAssetCategoryRelLocalService = assetEntryAssetCategoryRelLocalService;
	}

	private AssetEntryAssetCategoryRelLocalService _assetEntryAssetCategoryRelLocalService;
}