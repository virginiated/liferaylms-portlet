/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.lms.model.impl;

import com.liferay.lms.model.AsynchronousProcessAudit;
import com.liferay.lms.model.AsynchronousProcessAuditModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the AsynchronousProcessAudit service. Represents a row in the &quot;Lms_AsynchronousProcessAudit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.lms.model.AsynchronousProcessAuditModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AsynchronousProcessAuditImpl}.
 * </p>
 *
 * @author TLS
 * @see AsynchronousProcessAuditImpl
 * @see com.liferay.lms.model.AsynchronousProcessAudit
 * @see com.liferay.lms.model.AsynchronousProcessAuditModel
 * @generated
 */
public class AsynchronousProcessAuditModelImpl extends BaseModelImpl<AsynchronousProcessAudit>
	implements AsynchronousProcessAuditModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a asynchronous process audit model instance should use the {@link com.liferay.lms.model.AsynchronousProcessAudit} interface instead.
	 */
	public static final String TABLE_NAME = "Lms_AsynchronousProcessAudit";
	public static final Object[][] TABLE_COLUMNS = {
			{ "asynchronousProcessAuditId", Types.BIGINT },
			{ "classNameId", Types.BIGINT },
			{ "classPK", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "endDate", Types.TIMESTAMP },
			{ "status", Types.INTEGER },
			{ "statusMessage", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Lms_AsynchronousProcessAudit (asynchronousProcessAuditId LONG not null primary key,classNameId LONG,classPK LONG,userId LONG,createDate DATE null,endDate DATE null,status INTEGER,statusMessage VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Lms_AsynchronousProcessAudit";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.lms.model.AsynchronousProcessAudit"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.lms.model.AsynchronousProcessAudit"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.lms.model.AsynchronousProcessAudit"));

	public AsynchronousProcessAuditModelImpl() {
	}

	public long getPrimaryKey() {
		return _asynchronousProcessAuditId;
	}

	public void setPrimaryKey(long primaryKey) {
		setAsynchronousProcessAuditId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_asynchronousProcessAuditId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return AsynchronousProcessAudit.class;
	}

	public String getModelClassName() {
		return AsynchronousProcessAudit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("asynchronousProcessAuditId",
			getAsynchronousProcessAuditId());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("endDate", getEndDate());
		attributes.put("status", getStatus());
		attributes.put("statusMessage", getStatusMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long asynchronousProcessAuditId = (Long)attributes.get(
				"asynchronousProcessAuditId");

		if (asynchronousProcessAuditId != null) {
			setAsynchronousProcessAuditId(asynchronousProcessAuditId);
		}

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String statusMessage = (String)attributes.get("statusMessage");

		if (statusMessage != null) {
			setStatusMessage(statusMessage);
		}
	}

	public long getAsynchronousProcessAuditId() {
		return _asynchronousProcessAuditId;
	}

	public void setAsynchronousProcessAuditId(long asynchronousProcessAuditId) {
		_asynchronousProcessAuditId = asynchronousProcessAuditId;
	}

	public String getClassName() {
		if (getClassNameId() <= 0) {
			return StringPool.BLANK;
		}

		return PortalUtil.getClassName(getClassNameId());
	}

	public void setClassName(String className) {
		long classNameId = 0;

		if (Validator.isNotNull(className)) {
			classNameId = PortalUtil.getClassNameId(className);
		}

		setClassNameId(classNameId);
	}

	public long getClassNameId() {
		return _classNameId;
	}

	public void setClassNameId(long classNameId) {
		_classNameId = classNameId;
	}

	public long getClassPK() {
		return _classPK;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public String getStatusMessage() {
		if (_statusMessage == null) {
			return StringPool.BLANK;
		}
		else {
			return _statusMessage;
		}
	}

	public void setStatusMessage(String statusMessage) {
		_statusMessage = statusMessage;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			AsynchronousProcessAudit.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AsynchronousProcessAudit toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (AsynchronousProcessAudit)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		AsynchronousProcessAuditImpl asynchronousProcessAuditImpl = new AsynchronousProcessAuditImpl();

		asynchronousProcessAuditImpl.setAsynchronousProcessAuditId(getAsynchronousProcessAuditId());
		asynchronousProcessAuditImpl.setClassNameId(getClassNameId());
		asynchronousProcessAuditImpl.setClassPK(getClassPK());
		asynchronousProcessAuditImpl.setUserId(getUserId());
		asynchronousProcessAuditImpl.setCreateDate(getCreateDate());
		asynchronousProcessAuditImpl.setEndDate(getEndDate());
		asynchronousProcessAuditImpl.setStatus(getStatus());
		asynchronousProcessAuditImpl.setStatusMessage(getStatusMessage());

		asynchronousProcessAuditImpl.resetOriginalValues();

		return asynchronousProcessAuditImpl;
	}

	public int compareTo(AsynchronousProcessAudit asynchronousProcessAudit) {
		long primaryKey = asynchronousProcessAudit.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		AsynchronousProcessAudit asynchronousProcessAudit = null;

		try {
			asynchronousProcessAudit = (AsynchronousProcessAudit)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = asynchronousProcessAudit.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<AsynchronousProcessAudit> toCacheModel() {
		AsynchronousProcessAuditCacheModel asynchronousProcessAuditCacheModel = new AsynchronousProcessAuditCacheModel();

		asynchronousProcessAuditCacheModel.asynchronousProcessAuditId = getAsynchronousProcessAuditId();

		asynchronousProcessAuditCacheModel.classNameId = getClassNameId();

		asynchronousProcessAuditCacheModel.classPK = getClassPK();

		asynchronousProcessAuditCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			asynchronousProcessAuditCacheModel.createDate = createDate.getTime();
		}
		else {
			asynchronousProcessAuditCacheModel.createDate = Long.MIN_VALUE;
		}

		Date endDate = getEndDate();

		if (endDate != null) {
			asynchronousProcessAuditCacheModel.endDate = endDate.getTime();
		}
		else {
			asynchronousProcessAuditCacheModel.endDate = Long.MIN_VALUE;
		}

		asynchronousProcessAuditCacheModel.status = getStatus();

		asynchronousProcessAuditCacheModel.statusMessage = getStatusMessage();

		String statusMessage = asynchronousProcessAuditCacheModel.statusMessage;

		if ((statusMessage != null) && (statusMessage.length() == 0)) {
			asynchronousProcessAuditCacheModel.statusMessage = null;
		}

		return asynchronousProcessAuditCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{asynchronousProcessAuditId=");
		sb.append(getAsynchronousProcessAuditId());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append(", classPK=");
		sb.append(getClassPK());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusMessage=");
		sb.append(getStatusMessage());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.liferay.lms.model.AsynchronousProcessAudit");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>asynchronousProcessAuditId</column-name><column-value><![CDATA[");
		sb.append(getAsynchronousProcessAuditId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPK</column-name><column-value><![CDATA[");
		sb.append(getClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusMessage</column-name><column-value><![CDATA[");
		sb.append(getStatusMessage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = AsynchronousProcessAudit.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			AsynchronousProcessAudit.class
		};
	private long _asynchronousProcessAuditId;
	private long _classNameId;
	private long _classPK;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _endDate;
	private int _status;
	private String _statusMessage;
	private AsynchronousProcessAudit _escapedModelProxy;
}