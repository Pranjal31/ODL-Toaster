/*
 * Copyright © 2017 Pranjal Sharma and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package kitchen.impl;

import kitchen.api.EggsType;
import kitchen.api.KitchenService;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev180618.ToastType;
import org.opendaylight.yangtools.yang.common.RpcResult;

import java.util.concurrent.Future;

public class KitchenServiceImpl implements KitchenService {
    @Override
    public Future<RpcResult<Void>> makeBreakfast(EggsType eggs, Class<? extends ToastType> toast, int toastDoneness) {
        return null;
    }
}
