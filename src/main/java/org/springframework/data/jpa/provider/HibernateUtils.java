package org.springframework.data.jpa.provider;

import org.hibernate.jpa.HibernateQuery;
import org.springframework.lang.Nullable;

public abstract class HibernateUtils {

	private HibernateUtils() {}

	@Nullable
	public static String getHibernateQuery(Object query) {
		if (query instanceof HibernateQuery) {
			return ((HibernateQuery) query).getHibernateQuery().getQueryString();
		} else {
			throw new IllegalArgumentException("Don't know how to extract the query string from " + query);
		}
	}
}
