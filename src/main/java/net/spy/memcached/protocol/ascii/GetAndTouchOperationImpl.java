package net.spy.memcached.protocol.ascii;

import net.spy.memcached.ops.GetAndTouchOperation;

public class GetAndTouchOperationImpl extends BaseGetOpImpl
	implements GetAndTouchOperation{

	public GetAndTouchOperationImpl(String c, int e, GetAndTouchOperation.Callback cb,
			String k) {
		super(c, e, cb, k);
	}

}
