package com.yongboy.socketio.server.transport;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.http.HttpRequest;

import com.yongboy.socketio.server.Transports;

/**
 * 
 * @author yongboy
 * @time 2012-3-29
 * @version 1.0
 */
public class FlashSocketTransport extends WebSocketTransport {

	public FlashSocketTransport(HttpRequest req) {
		super(req);
	}

	@Override
	public String getId() {
		return Transports.FLASHSOCKET.getValue();
	}

	@Override
	protected GenericIO doNewI0Client(ChannelHandlerContext ctx,
			HttpRequest req, String sessionId) {
		FlashSocketIO client = new FlashSocketIO(ctx, req, sessionId);
		return client;
	}
}