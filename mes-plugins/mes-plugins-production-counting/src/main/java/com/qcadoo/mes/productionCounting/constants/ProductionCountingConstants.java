/**
 * ***************************************************************************
 * Copyright (c) 2010 Qcadoo Limited
 * Project: Qcadoo MES
 * Version: 1.4
 *
 * This file is part of Qcadoo.
 *
 * Qcadoo is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation; either version 3 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * ***************************************************************************
 */
package com.qcadoo.mes.productionCounting.constants;

public final class ProductionCountingConstants {

    private ProductionCountingConstants() {

    }

    public static final String PLUGIN_IDENTIFIER = "productionCounting";

    // MODEL

    public static final String MODEL_PRODUCTION_TRACKING = "productionTracking";

    public static final String MODEL_FINAL_PRODUCT_ANALYSIS_ENTRY = "finalProductAnalysisEntry";

    public static final String MODEL_BEFORE_ADDITIONAL_ACTIONS_ANALYSIS_ENTRY = "beforeAdditionalActionsAnalysisEntry";

    public static final String MODEL_PRODUCTION_TRACKING_STATE_CHANGE = "productionTrackingStateChange";

    public static final String MODEL_PRODUCTION_BALANCE = "productionBalance";

    public static final String MODEL_PRODUCTION_TRACKING_REPORT = "productionTrackingReport";

    public static final String MODEL_TRACKING_OPERATION_PRODUCT_IN_COMPONENT = "trackingOperationProductInComponent";

    public static final String MODEL_TRACKING_OPERATION_PRODUCT_IN_COMPONENT_DTO = "trackingOperationProductInComponentDto";

    public static final String MODEL_TRACKING_OPERATION_PRODUCT_OUT_COMPONENT = "trackingOperationProductOutComponent";

    public static final String MODEL_TRACKING_OPERATION_PRODUCT_OUT_COMPONENT_DTO = "trackingOperationProductOutComponentDto";

    public static final String MODEL_STAFF_WORK_TIME = "staffWorkTime";

    public static final String MODEL_ANOMALY = "anomaly";

    public static final String MODEL_ANOMALY_EXPLANATION = "anomalyExplanation";

    // VIEW

    public static String productionTrackingDetailsUrl(final Long id) {
        return "#page/" + PLUGIN_IDENTIFIER + "/" + MODEL_PRODUCTION_TRACKING + "Details.html?context=%7B%22form.id%22%3A%22"
                + id + "%22%2C%22form.undefined%22%3Anull%7D";
    }
}
