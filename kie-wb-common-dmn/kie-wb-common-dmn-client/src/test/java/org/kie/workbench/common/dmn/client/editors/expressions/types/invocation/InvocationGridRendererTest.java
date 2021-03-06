/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.dmn.client.editors.expressions.types.invocation;

import org.junit.Test;
import org.uberfire.ext.wires.core.grids.client.widget.grid.renderers.grids.GridRenderer;

import static org.junit.Assert.assertEquals;

public class InvocationGridRendererTest {

    @Test
    public void testHeaderDimensionsWhenHeaderNotHidden() {
        final GridRenderer renderer = new InvocationGridRenderer(false);

        assertEquals(InvocationGridRenderer.HEADER_HEIGHT,
                     renderer.getHeaderHeight(),
                     0.0);
        assertEquals(InvocationGridRenderer.HEADER_ROW_HEIGHT,
                     renderer.getHeaderRowHeight(),
                     0.0);
    }

    @Test
    public void testHeaderDimensionsWhenHeaderIsNotHidden() {
        final GridRenderer renderer = new InvocationGridRenderer(true);

        assertEquals(InvocationGridRenderer.HEADER_HEIGHT,
                     renderer.getHeaderHeight(),
                     0.0);
        assertEquals(InvocationGridRenderer.HEADER_ROW_HEIGHT,
                     renderer.getHeaderRowHeight(),
                     0.0);
    }
}
