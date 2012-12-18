/**
 * ***************************************************************************
 * Copyright (c) 2010 Qcadoo Limited
 * Project: Qcadoo MES
 * Version: 1.2.0-SNAPSHOT
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
package com.qcadoo.mes.technologies;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TechnologyController {

    @RequestMapping(value = "technologies/technologyDetailsReport.pdf", method = RequestMethod.GET)
    public final ModelAndView technologiesReportPdf(@RequestParam("id") final String id) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("technologiesTechnologyDetailsPdfView");
        mav.addObject("id", id);
        return mav;
    }

    @RequestMapping(value = "technologies/technologyDetailsReport.xls", method = RequestMethod.GET)
    public final ModelAndView technologiesReportXls(@RequestParam("id") final String id) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("technologiesTechnologyDetailsXlsView");
        mav.addObject("id", id);
        return mav;
    }

}
