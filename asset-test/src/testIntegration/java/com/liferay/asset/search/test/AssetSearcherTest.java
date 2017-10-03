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

package com.liferay.asset.search.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.asset.kernel.service.persistence.AssetEntryQuery;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.rule.Sync;
import com.liferay.portal.kernel.test.rule.SynchronousDestinationTestRule;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.service.test.ServiceTestUtil;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portlet.asset.util.AssetSearcher;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

/**
 * @author André de Oliveira
 */
@RunWith(Arquillian.class)
@Sync
public class AssetSearcherTest {

	@ClassRule
	@Rule
	public static final TestRule testRule = new AggregateTestRule(
		new LiferayIntegrationTestRule(),
		SynchronousDestinationTestRule.INSTANCE);

	@Before
	public void setUp() throws Exception {
		_group = GroupTestUtil.addGroup();
	}

	@Test
	public void testGuestUser() throws Exception {
		setGuestUser();

		AssetEntryQuery assetEntryQuery = getAssetEntryQuery();

		assetEntryQuery.setClassNameIds(
			getClassNameIds("com.liferay.blogs.kernel.model.BlogsEntry"));

		search(assetEntryQuery, getSearchContext());
	}

	@Test
	public void testGuestUserBorrowedPermissions() throws Exception {
		setGuestUser();

		AssetEntryQuery assetEntryQuery = getAssetEntryQuery();

		assetEntryQuery.setClassNameIds(
			getClassNameIds(
				"com.liferay.calendar.model.CalendarBooking",
				"com.liferay.dynamic.data.lists.model.DDLRecord"));

		search(assetEntryQuery, getSearchContext());
	}

	protected AssetEntryQuery getAssetEntryQuery() {
		AssetEntryQuery assetEntryQuery = new AssetEntryQuery();

		assetEntryQuery.setGroupIds(new long[] {_group.getGroupId()});

		return assetEntryQuery;
	}

	protected long[] getClassNameIds(String... classNames) {
		long[] classNameIds = new long[classNames.length];

		for (int i = 0; i < classNames.length; i++) {
			classNameIds[i] = PortalUtil.getClassNameId(classNames[i]);
		}

		return classNameIds;
	}

	protected SearchContext getSearchContext() {
		SearchContext searchContext = new SearchContext();

		searchContext.setCompanyId(_group.getCompanyId());
		searchContext.setGroupIds(new long[] {_group.getGroupId()});

		return searchContext;
	}

	protected void search(
			AssetEntryQuery assetEntryQuery, SearchContext searchContext)
		throws Exception {

		AssetSearcher assetSearcher = new AssetSearcher();

		assetSearcher.setAssetEntryQuery(assetEntryQuery);

		assetSearcher.search(searchContext);
	}

	protected void setGuestUser() throws Exception {
		ServiceTestUtil.setUser(
			_userLocalService.getDefaultUser(_group.getCompanyId()));
	}

	@Inject
	private static UserLocalService _userLocalService;

	@DeleteAfterTestRun
	private Group _group;

}