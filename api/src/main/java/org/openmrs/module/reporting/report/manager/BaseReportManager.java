/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.reporting.report.manager;

import org.openmrs.module.reporting.evaluation.EvaluationContext;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Base implementation of ReportManager that provides some common method implementations
 */
public abstract class BaseReportManager implements ReportManager {

	/**
	 * @return by default, no parameters are required
	 */
	@Override
	public List<Parameter> getParameters() {
		return new ArrayList<Parameter>();
	}

	/**
	 * @return by default, no specific privilege is required
	 */
	@Override
	public String getRequiredPrivilege() {
		return null;
	}

	/**
	 * @return by default, return a new EvaluationContext with straight-through parameter mappings
	 */
	@Override
	public EvaluationContext initializeContext(Map<String, Object> parameters) {
		EvaluationContext context = new EvaluationContext();
		context.setParameterValues(parameters == null ? new HashMap<String, Object>() : parameters);
		return context;
	}
}