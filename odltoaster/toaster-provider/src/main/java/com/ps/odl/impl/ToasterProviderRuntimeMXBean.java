/*
 * Copyright © 2017 Pranjal Sharma and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package com.ps.odl.impl;

public interface ToasterProviderRuntimeMXBean {
    Long getToastsMade();

    void clearToastsMade();
}