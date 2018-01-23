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

package com.liferay.asset.display.contributor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

/**
 * @author Jürgen Kappler
 */
@Component(immediate = true, service = AssetDisplayContributorTracker.class)
public class AssetDisplayContributorTracker {

	public AssetDisplayContributor getAssetDisplayContributor(
		String className) {

		return _assetDisplayContributor.get(className);
	}

	public List<AssetDisplayContributor> getAssetDisplayContributors(
		Locale locale) {

		List<AssetDisplayContributor> assetDisplayContributors =
			new ArrayList<>();

		for (Map.Entry<String, AssetDisplayContributor> entry :
				_assetDisplayContributor.entrySet()) {

			assetDisplayContributors.add(entry.getValue());
		}

		Collections.sort(
			assetDisplayContributors,
			(assetDisplayContributor1, assetDisplayContributor2) -> {
				String assetDisplayContributorLabel1 =
					assetDisplayContributor1.getLabel(locale);
				String assetDisplayContributorLabel2 =
					assetDisplayContributor2.getLabel(locale);

				return assetDisplayContributorLabel1.compareTo(
					assetDisplayContributorLabel2);
			});

		return Collections.unmodifiableList(assetDisplayContributors);
	}

	@Reference(
		cardinality = ReferenceCardinality.MULTIPLE,
		policy = ReferencePolicy.DYNAMIC,
		unbind = "unsetAssetDisplayContributor"
	)
	protected void setAssetDisplayContributor(
		AssetDisplayContributor assetDisplayContributor) {

		_assetDisplayContributor.put(
			assetDisplayContributor.getClassName(), assetDisplayContributor);
	}

	protected void unsetAssetDisplayContributor(
		AssetDisplayContributor assetDisplayContributor) {

		_assetDisplayContributor.remove(assetDisplayContributor.getClassName());
	}

	private final Map<String, AssetDisplayContributor>
		_assetDisplayContributor = new ConcurrentHashMap<>();

}